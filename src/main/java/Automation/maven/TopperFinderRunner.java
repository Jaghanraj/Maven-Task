package Automation.maven;

 import java.text.ParseException;

public class TopperFinderRunner {

	public static void main(String[] args) throws ParseException, Exception {
		 TopperFinder oTopperFinder = new  TopperFinder();
		 oTopperFinder.writeToJsonFile();
		 oTopperFinder.readJsonFile();
	}

}
