import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

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
		
		validateAcceptanceCriteria();
	}
	
	private static boolean validateAcceptanceCriteria() {
		boolean result = false;
	JSONParser parser = new JSONParser();
	try {
		 
        Object object= parser.parse(new FileReader("./sampleapi.json"));

        JSONObject jsonObject = (JSONObject) object;
        String name = (String) jsonObject.get("Name");
        System.out.println(name);
        
        boolean canRelist = (boolean) jsonObject.get("CanRelist");
        System.out.println(canRelist);
        
        	JSONArray promotions = (JSONArray) jsonObject.get("Promotions");
        
        System.out.println("\nPromotions List:");
        
        for (Object promotion : promotions) {
            JSONObject promo = (JSONObject) promotion;
            String strName = (String) promo.get("Name");
            System.out.println("Promotion Name:  " + strName);

        }
       
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return result;
}

}
