import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author admin
 *
 */
public class getapiurl {
	String urlAddress = null;

	public getapiurl(String urladd) {
		this.urlAddress = urladd;
		geturlbackground();
	}

	private void geturlbackground() {
		String textread = "";
		try {
			URL url = new URL(this.urlAddress);
			try {
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.connect();
				int responsecode = conn.getResponseCode();
				if (responsecode != 200)
					throw new RuntimeException("HttpResponseCode: " + responsecode);
				else {
					Scanner sc = new Scanner(url.openStream());
					while (sc.hasNext()) {
						textread += sc.nextLine();
					}
					System.out.println("\nJSON out file created !");
					sc.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} //

		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter("./sampleapi.json"));
			writer.write(textread);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
