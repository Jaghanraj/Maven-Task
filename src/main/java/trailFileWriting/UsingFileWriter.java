package trailFileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
 

public class UsingFileWriter {

	public static void main(String[] args) throws IOException {
		 
		// TODO Auto-generated method stub
		String location =System.getProperty("user.dir");
		String path = location +File.separator+"sample.txt";
//		 String location ="UsingFileWriter.txt";
		 String content ="Hello this is jaghan";
		 
		FileWriter fileWriter = new FileWriter(path);
		
		fileWriter.write(content);
		
		fileWriter.close();

	}

}
