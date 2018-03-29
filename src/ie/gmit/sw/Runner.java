package ie.gmit.sw;
import java.util.*;

public class Runner {

	private static Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) {
	//This method has no big O calculation as it only calls the menu method
	
		menu();//Call the menu
		
	}//Main Method

	 static void menu()
	{
	//This method is used to create the menu and switch through 
	//that menu to decide the direction of the program.	 
		 
		String input = " ";			//Value to store user input
		String fileIn = " ";		//Name of the file
		String keyword = " ";		//The keyword for decrypting
		
		do{
			System.out.println("\t1.Parse and Encrypt a File or URL");
			System.out.println("\t2.Parse and Decrypt Previous File (" +fileIn+")");
			System.out.println("\t3.Encrypt War and Peace");
			System.out.println("\t4.Decrypt War and Peace");
			System.out.println("\t5.Exit");
			
			input = UserInput("Please Enter a Value");
			
			switch(input)
			{
				case "1":
						Decrypt.setCounter(0);						//reset the keyword counter
						Parse.writeToFile( 
							fileIn = UserInput("Please enter file or URL you wish to parse"),		
															//get the file name from the scanner method
							keyword = UserInput("Please Enter Keyword You wish to Decryt the File with"), "output.txt");							
															//get the keyword using the scanner method
															//Both are passed to the writeToFile method in the parse class
					break;
				case "2":
						Decrypt.setCounter(0);				//reset keyword counter
						Parse.writeToFile( "output.txt" , keyword, "output2.txt");
															//Decrypt the output file to ouput2
						Parse.swapFile("output2.txt", "output.txt");
															//Swap files output and output 2
					break;
				case "3":
						Decrypt.setCounter(0);				//Reset keyword counter
						Parse.writeToFile( "WarAndPeace-LeoTolstoy.txt" , "DATA", "output.txt"); 
															//encrypt war and peace
					break;
				case "4":
						Decrypt.setCounter(0);				//reset counter
						Parse.writeToFile( "output.txt" , "DATA", "output2.txt");	
															//Decrypt War and peace from output to output2
						Parse.swapFile("output2.txt", "output.txt");
															//Swap output2 and output
						break;
				case "5":
						System.exit(0);
					break;
				default:
					System.err.println("Incorrect Value\n");
			}
			
		}while(input != "5");
		//Run this loop until the user inputs 5 and exits the program
		//In big O notation this would calculate at:
		// f(1N) - This depends on how many times the user enacts the program
		
	}

	private static String UserInput(String output) {
	//This method is how i take in input from the scanner, instead of calling 
	//the scanner in multiple locations i find this method more useful	
		
		System.out.println(output);				//Ask the user a question
		String input = scanner.next();			//Read the users answer
		
		return input;							//return the answer in string format
	}
}