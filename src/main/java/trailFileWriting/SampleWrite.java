package trailFileWriting;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SampleWrite {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		String TextFile = input.nextLine();
		input.close();
		 String UserPath = System.getProperty("user.dir");
		 String Path = UserPath + File.separator + TextFile ;
		 System.out.println(Path);
		 
		 
		 FileWriter  oFileWriter = new FileWriter(Path);
		 oFileWriter.write( "Hi How Are You");
		 oFileWriter.close();
		 
	}

}
