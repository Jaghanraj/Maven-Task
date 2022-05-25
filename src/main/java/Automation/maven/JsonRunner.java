package Automation.maven;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class JsonRunner {

	public static void main(String[] args) throws IOException, ParseException, java.text.ParseException {
		JsonWritter oJsonWritter = new JsonWritter();
		oJsonWritter.writeJsonFile();		
		oJsonWritter.writeExcel( oJsonWritter.readJsonFile());
		
	}

}
