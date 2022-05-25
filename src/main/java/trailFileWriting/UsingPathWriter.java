package trailFileWriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPathWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String location = "UsingPathLocation.txt";
		String content = "Writing using path location";
		
		Path path = Paths.get(location);
		Files.write(path,content.getBytes());

	}

}
