package QualiAssign.Task3_json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class update_Json {
	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();

		//fetching file
		FileReader fr = new FileReader(".\\Jason_pgms\\Json_Ex.json");
		Object o = jsonparser.parse(fr);
		JSONObject collObj = (JSONObject) o;
		
		//updating info
		collObj.put("country", "Australia");
		
		//writing updation
		FileWriter f2 = new FileWriter(".\\Jason_pgms\\Json_Ex.json",false);
		f2.write(collObj.toJSONString());
		f2.close();
		
		System.out.println("Json File is updated");
	}
}


