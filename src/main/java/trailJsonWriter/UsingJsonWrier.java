package trailJsonWriter;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject; 
import org.json.simple.JSONArray;

public class UsingJsonWrier {

	 
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JSONObject jsonWriter = new JSONObject();
		jsonWriter.put("Name","jaghan");
		jsonWriter.put("Age", 1);
		
		//to create json array
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Smile");
		jsonArray.add("Eyes");
		
		jsonWriter.put("Special quality", jsonArray);
		
		FileWriter fileWriter = new FileWriter("jquality.json");
		fileWriter.write(jsonWriter.toString());
		fileWriter.close();

	}

}
