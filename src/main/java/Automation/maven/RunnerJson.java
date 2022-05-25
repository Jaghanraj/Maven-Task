package Automation.maven;

import java.io.IOException;

import org.json.simple.parser.ParseException;

public class RunnerJson {

    public static void main(String[] args) throws IOException, ParseException {
        
        JsonOperations oJsonOperations = new JsonOperations();
        oJsonOperations.writeJsonFile();
        oJsonOperations.writeExcel(oJsonOperations.readJsonFile());

    }

}
