package trailFileWriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = System.getProperty("user.dir");
		String file = location + File.separator + "BuffText.txt";
		//String location = "UsingBufferedWriter";
		String content = "Writes using Buffered writer";
		
		FileWriter fileWriter = new FileWriter(file);
		 
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		bufferedWriter.close();

	}

}
