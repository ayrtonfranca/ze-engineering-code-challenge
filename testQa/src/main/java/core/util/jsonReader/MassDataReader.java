package core.util.jsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import core.setup.GlobalVariables;

public class MassDataReader {
	
	public static String QueryData(String json_file, String id_massa, String identifier) {
	
		GlobalVariables.massData = json_file; 
		GlobalVariables.massIdentifier = id_massa;
		
		JSONParser Jparser = new JSONParser();
		JSONObject JObj = new JSONObject();
		
		try {
			String path = System.getProperty("user.dir");
			JObj = (JSONObject) Jparser.parse(new FileReader(path+ "/src/main/resources/json_file/" +GlobalVariables.massData+".json"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		JSONObject JObje = (JSONObject) JObj.get(id_massa);
		String returnData = (String) JObje.get(identifier);
		return returnData;
	
	}
}
