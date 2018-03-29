package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Parse {
	
	public static BufferedReader readIn(String location){
		
		BufferedReader br = null;				//Initial Buffered Reader
		
			try {
				
				if(location.contains("http//:") || location.contains("www."))
				{
					//Determine if web address us present
					//instead of asking the user
					
					URL url = new URL(location);
					//URL variable
					
			        br = new BufferedReader(			//Input stream for URL
			        		new InputStreamReader(
			        				url.openStream()));
				}
				else
				{
					br = new BufferedReader(new FileReader(location));
					//Call the filereader if not a web address
				}
			
		} catch (FileNotFoundException e) {				//Catch no file
			System.err.println("File Not Found");
		}catch (MalformedURLException e) {				//Catch invalid web address
			System.err.println("URL Not Found");
		}catch (IOException e) {						//Catch incorrect inputs and outputs
			e.printStackTrace();
		}
		
	
	return br;											//return the Buffered Reader
	
	}
	
	public static void writeToFile (String location, String keyword, String output){
		//This method is where the big O notation comes in
		//it determines how many iterations of the other methods are required
		//It reads in the file char by char and decrypts each character as it is read
		//the big O notation is f(N), N is the iterations from char to char in the file.
		//Each time the user runs the program the result is f(N) as i have only included one loop
		
		long startTime = System.currentTimeMillis();
		//Calculate start time in milliseconds

		BufferedReader br = readIn(location);
		//Call readIn method which returns buffered reader
		
		int s;
		
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(output));
			//Buffered writer for output

			while((s = br.read()) != -1)		//Loop while each int value from the file is not = -1
			{	
				char c = Decrypt.start(Character.toUpperCase((char)s), keyword.toUpperCase());
				//Decrypt the char -  while asking for keyword through
				//scanner method, upper casing all 
				//cant trust the user 
				
				bw.write(c);
				//write the character that was decrypted to the output file
			}
			
			br.close();			//close the reader
			bw.close();			//close the writer
			
			System.out.println("Took "+(System.currentTimeMillis() - startTime) + " ms");
			//Calcualte the run time, by subtracting the start time from current time

		} 
		catch (FileNotFoundException e) {					//Catch no file found
			System.err.println("File Not Found");
			Runner.menu();
		} 
		catch (IOException e) {								//Catch Input/Output Errors
			System.err.println("Input or Output Error");
		}
		catch (NullPointerException e) {					//Catch Null pointer
			System.err.println("No File by That Name");
		}		
		
	}
	
	public static void swapFile (String location, String output){
		//This method swaps the file output2 and places the text in output

		BufferedReader br = readIn(location); //Reader
		
		int s;
		
		try {

			BufferedWriter bw = new BufferedWriter(new FileWriter(output)); //Writer

			while((s = br.read()) != -1) //run while not = -1 or NULL
			{	
				bw.write((char)s);		//write to file
			}
			
			br.close();					//close reader
			bw.close();					//close writer
		} 
		catch (FileNotFoundException e) {			//Catch File not Found
			System.err.println("File Not Found");
			Runner.menu();
		} 
		catch (IOException e) {						//Catch Input/Output Errors
			System.err.println("Input or Output Error");
		}
		catch (Exception e) {						//Catch All, just in case
			System.err.println("No File by That Name");
		}
	}
	
}


