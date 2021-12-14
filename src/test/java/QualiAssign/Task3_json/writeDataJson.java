package QualiAssign.Task3_json;

import java.io.FileWriter;
import org.json.JSONObject;
import java.io.IOException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

public class writeDataJson {

	public static void main(String[] args) throws IOException, TransformerConfigurationException {
// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();

		//adding details
		obj.put("CollegueName", "sarvesh");
		obj.put("Birthyear", "1999");
		obj.put("Qtid", "4612");
		obj.put("country", "India");
		obj.put("age", "21");
		
		//writing to file
	    FileWriter file = new FileWriter(".\\Jason_pgms\\JsonWrite.json,");
		file.write(((Object) obj).toString());
		file.close();
		

		System.out.println("Folder is created");
	}

}