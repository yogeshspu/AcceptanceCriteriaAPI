import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author admin
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String apilink = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
		new getapiurl(apilink);

		boolean acceptanceCriteria = validateAcceptanceCriteria();
		if(acceptanceCriteria) {
			System.out.println("API ACCEPTED");
		}else {
			System.out.println("API NOT ACCEPTED");
		}
	}

	private static boolean validateAcceptanceCriteria() {
		boolean result = false;
		JSONParser parser = new JSONParser();
		try {

			Object object = parser.parse(new FileReader("./sampleapi.json"));

			JSONObject jsonObject = (JSONObject) object;
			String name = (String) jsonObject.get("Name");
			boolean nameResult = name.equals("Carbon credits");
			System.out.println(name+ ": " +nameResult);
			
			boolean canRelist = (boolean) jsonObject.get("CanRelist");
			System.out.println("CanRelist: "+ canRelist);

			String validateStr = "2x larger image";
			boolean galleryResult = getGalleryValidation((JSONArray) jsonObject.get("Promotions"), validateStr);

			result = (nameResult && canRelist && galleryResult);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	private static boolean getGalleryValidation(JSONArray promotions, String validate) {
		boolean galleryResult = false;
		for (Object promotion : promotions) {
			JSONObject promo = (JSONObject) promotion;
			String promoName = (String) promo.get("Name");
			if(promoName.equals("Gallery")) {
				String description = (String) promo.get("Description");
				if(description.contains(validate)) {
					galleryResult = true;
					System.out.println("Promotion name " +promoName + " found description: " +validate);
				}
				
			}

		}
		System.out.println("Gallery: " +galleryResult);
		return galleryResult;

	}

}
