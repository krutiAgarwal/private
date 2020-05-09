package check;   

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeToAFile {

	public static void main(String[] args) throws IOException {
		String fileContent="This is the testing ";
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("/Users/nitinagarwal/Documents/workspace/check/src/check/testing1.txt"));
		
		writer.write(fileContent);
		writer.append("K");
writer.close();
	}

}
