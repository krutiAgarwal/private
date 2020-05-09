package check;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class File_Handling {

	public static void main(String[] args) throws IOException {
	 File f=new File("/Users/nitinagarwal/Documents/workspace/check/src/check/testing1.txt");
	try{
	 if(f.createNewFile()){
		 System.out.println("The name of the File is ..."+f.getName());
		 System.out.println("The absolute path f the file ..."+f.getAbsolutePath());
		 
		 
		 

	 } else {
		 
		 System.out.println("File already exists");
	 }
	}catch(Exception e ){
		
		System.out.println("the error is "+e.getStackTrace());
		
		
	}

}
}