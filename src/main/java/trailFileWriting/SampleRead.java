package trailFileWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SampleRead {

	public static void main(String[] args) throws FileNotFoundException {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the File name");
		 String FileName = scan.nextLine();
		 scan.close();
		 
		 String input = System.getProperty("user.dir");
		 String path = input + File.separator + FileName;
		 System.out.println(path);
		 File file = new File(path);
		 Scanner DataReader = new Scanner(file);
		 
		 while(DataReader.hasNextLine())
			 {
			String output = DataReader.nextLine();
			 System.out.println(output);
			 }
		 DataReader.close();
	}

}
