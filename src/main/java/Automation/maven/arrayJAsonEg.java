package Automation.maven;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;
import org.json.simple.JSONArray;

public class arrayJAsonEg {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name","jaghan");
		jsonObject.put("Age",1);
		
		JSONArray array = new JSONArray();
		array.add("Smile");
		array.add("eyes");
		
		jsonObject.put("Special qualities","array");
		FileWriter fileWriter = new FileWriter("jaghan.json");
		fileWriter.write(jsonObject.toString());
		fileWriter.close();

	}

}
