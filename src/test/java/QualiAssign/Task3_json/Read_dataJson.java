package QualiAssign.Task3_json;

import java.io.FileReader;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.text.ParseException;
import org.json.simple.parser.JSONParser; 

public class Read_dataJson{

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException {

		JSONParser jsonparser = new JSONParser();

		FileReader reader = new FileReader(".\\Jason_pgms\\Json_Ex.json");

		Object o = jsonparser.parse(reader);
		JSONObject collobj = (JSONObject) o;

		//get Details
		String cname = (String) collobj.get("Colleguename");
		String Birthyear = (String) collobj.get("Birthyear");
		String Id = (String) collobj.get("QTId");
		String Country = (String) collobj.get("country");

		//print content
		System.out.println(" " + cname);
		System.out.println(" " + Birthyear);
		System.out.println(" " + Id);
		System.out.println(" " + Country);

	}

}