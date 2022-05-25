package trailFileReading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingBufferedWriter";
		
		FileReader fileReader = new FileReader(location);
		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String currentLine=bufferedReader.readLine();
		
		System.out.println(currentLine);
		bufferedReader.close();

	}

}
