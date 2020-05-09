package check;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferReader {

	public static void main(String[] args) {
		 BufferedReader bufferedReader = null;
		 
	        try
	        {
	 
	            String currLine;
	 
	            bufferedReader = new BufferedReader(new FileReader("/Users/nitinagarwal/Documents/workspace/check/src/check/testing1.txt"));
	 
	            while ((currLine = bufferedReader.readLine()) != null)
	            {
	            
	            		
	            		
	            	
	            	
	                System.out.println(currLine);
	            }
	 
	        }
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        } 
	        finally
	        {
	            try
	            {
	                if (bufferedReader != null)
	                    bufferedReader.close();
	            } 
	            catch (IOException ex) 
	            {
	                ex.printStackTrace();
	            }
	        }
	    }
	

	}


