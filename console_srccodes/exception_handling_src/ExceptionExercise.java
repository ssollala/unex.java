import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionExercise {

	// handle most specific exception first and then general ones
	public static void main(String args[]) throws IOException{
		
		BufferedReader reader = null;

		int total = 0;
		try {
			// open up a file
			reader = new BufferedReader(new FileReader("/Users/Sol/Desktop/Numbers.txt"));
			
			String line = null;
			while((line = reader.readLine()) != null){
				total += Integer.valueOf(line);
				
			}	
			System.out.println("Total = " + total);
		} catch(NumberFormatException e){
			// unchecked exception = compiler does not require this exception
			System.out.println("Invalid value: " + e.getMessage());
		}catch(FileNotFoundException e) {
			// checked exception = complier requires this exception handling
			System.out.println("Not found: " + e.getMessage());
		} catch(IOException e){
			// checked exception = complier requires this exception handling
			// IOException can be omitted since more specific exception handling already produced
			System.out.println("Error interaction with file: " + e.getMessage());
		} finally{
			try{
			// close the file if opened up
			if(reader != null)
				reader.close();
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	
	
}
