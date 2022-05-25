package trailFileReading;

public class TopperFinderRunner {
	public static void main(String[] args) throws Exception {
		
		TopperFinder topperFinder = new TopperFinder();
		topperFinder.writeToJsonFile();
		//topperFinder.readJsonFile();
		topperFinder.findTheTopperStudent();
		topperFinder.writeToXlsxFile();
	}
}
