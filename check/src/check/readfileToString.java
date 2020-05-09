package check;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class readfileToString {

	private static String readLineByLine(String filePath) throws IOException
	{
		
		StringBuilder contentBuilder=new StringBuilder();
		  try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)) 
		    {
		        stream.forEach(s -> contentBuilder.append(s).append("\n"));
		    }
		  catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	 
	        return contentBuilder.toString();
	    
	}
	
	public static void main(String[] args) throws IOException {
		
		 String filePath = "/Users/nitinagarwal/Documents/workspace/check/src/check/testing1.txt";
		 
	        System.out.println( readLineByLine( filePath ) );
	}

}
