package ie.gmit.sw;

public class PortaCipher{
	
	//The tableau which was already provided, 
	//The program could be run without this all together,
	//But this would assume that you already knew it by heart

	public static final String[][] tableau = {
		{"KEYS","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
		{"AB","N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z","A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M"},
		{"CD","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "N","M", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"},
		{"EF","P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "N", "O","L", "M", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"},
		{"GH","Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "N", "O", "P","K", "L", "M", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J"},
		{"IJ","R", "S", "T", "U", "V", "W", "X", "Y", "Z", "N", "O", "P", "Q","J", "K", "L", "M", "A", "B", "C", "D", "E", "F", "G", "H", "I"},
		{"KL","S", "T", "U", "V", "W", "X", "Y", "Z", "N", "O", "P", "Q", "R","I", "J", "K", "L", "M", "A", "B", "C", "D", "E", "F", "G", "H"},
		{"MN","T", "U", "V", "W", "X", "Y", "Z", "N", "O", "P", "Q", "R", "S","H", "I", "J", "K", "L", "M", "A", "B", "C", "D", "E", "F", "G"},
		{"OP","U", "V", "W", "X", "Y", "Z", "N", "O", "P", "Q", "R", "S", "T","G", "H", "I", "J", "K", "L", "M", "A", "B", "C", "D", "E", "F"},
		{"QR","V", "W", "X", "Y", "Z", "N", "O", "P", "Q", "R", "S", "T", "U","F", "G", "H", "I", "J", "K", "L", "M", "A", "B", "C", "D", "E"},
		{"ST","W", "X", "Y", "Z", "N", "O", "P", "Q", "R", "S", "T", "U", "V","E", "F", "G", "H", "I", "J", "K", "L", "M", "A", "B", "C", "D"},
		{"UV","X", "Y", "Z", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W","D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "A", "B", "C"},
		{"WX","Y", "Z", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "A", "B"},
		{"YZ","Z", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "A"}
	};
}