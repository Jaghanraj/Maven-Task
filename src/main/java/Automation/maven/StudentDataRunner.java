package Automation.maven;

import java.io.IOException;

public class StudentDataRunner {

	public static void main(String[] args) throws IOException {
		Writestudentdata_Json_Excel oExcel = new Writestudentdata_Json_Excel();
		oExcel.WriteToJsonFile();
		 

	}

}
