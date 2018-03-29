package ie.gmit.sw;

public class Decrypt {
	
	private static int z = 0;
	private static int column = 0;
	private static int row = 0;
	
	public static char start(char c, String keyword){
	//This method decrypts each character based on the tableau
	//Big O notation for this method is based on how many times the
	//parse class calls it, which would be f(N) - which is the 
	//iterations from how many characters are in the parsed file 	
		
		int unicode = ((int)c - 64);				
		//Cast the char to an int 
		
		column = (( (int) keyword.charAt( z % keyword.length() )) - 65 ) /2 +1;
		//Determine the column by dividing the ASCII value by 2 adding 1
		
				if (unicode >= 14 && unicode <= 26)
				{
					//If the ASCII value is within the last 13 letters of the alphabet
					
					row = ( ( (unicode) - column)+ 1 ) % 13; 		
					//DONT CHANGE
					
					if(row == 0)
					{
						row = 13;
					}
					c = PortaCipher.tableau[0][row].charAt(0);
					//Locate the letter from the tableau
					
					z++;
				}
				else if(unicode > 0 && unicode <= 13)
				{
					//If the ASCII value is within the first 13 letters of the alphabet
					
					row = (((unicode) + (column - 1))) % 13 + 13;
					
					if(row == 13)
					{
						row = 26;
					}
					
					//c = (char)(row + 64);	
					//This Method was actually slower so I decided against it
					
					c = PortaCipher.tableau[0][row].charAt(0);
					//Locate the letter from the tableau
					
					z++;
				}		
			
		return c;
		//return the character, no matter what it is,
		//This method keeps the spaces, newlines, ints etc all intact
	}	
	
	public static void setCounter(int num)
	{
		//Method used to set the counter back to 0
		z = num;
	}
	
}