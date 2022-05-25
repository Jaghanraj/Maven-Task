package trailJsonReader; 
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class UsingJsonReader {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		JSONParser jsonParser = new JSONParser();
		FileReader oFileReader = new FileReader("jquality.json");
		
		Object parsedObject = jsonParser.parse(oFileReader);
		
		JSONObject jsonObject = (JSONObject) parsedObject;
		
		String name = (String) jsonObject.get("Name");
		
		Long age = (Long) jsonObject.get("Age");
		
		//to take array elements
		JSONArray array = (JSONArray) jsonObject.get("Special quality");
		
		@SuppressWarnings("rawtypes")
		Iterator iterator = array.iterator();
		
		System.out.println("Name is :" +name);
		System.out.println("Age is :" +age);
		
		while (iterator.hasNext()) {
			 System.out.println("Special Qualities :" +iterator.next());
			
		}

	}

}
