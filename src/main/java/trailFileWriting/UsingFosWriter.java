package trailFileWriting;
 
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFosWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location ="UsingFosWriter.txt";
		String content = "File writing using FosWriter";
		
		FileOutputStream outputStream = new FileOutputStream(location);
		
		byte[] writethis = content.getBytes();
		
		outputStream.write(writethis);
		
		outputStream.close();
		

	}

}
