
public class Encrypter {
	public String encrypt(String num) {
		//variable declaration
		String encryption_string = "";
		
		//for loop that parses through the individual numbers in the 4 digit number, applies the formula, to encrypt the integer with the correct values
		for(int i=0; i<num.length(); i++) 
			encryption_string += (Integer.parseInt(num.charAt(i)+"")+ 7) % 10;
		
		//hard programming using the charAt function, so the values are in their proper place before the program returns the encrypted value
		String encryption = encryption_string.charAt(2) + "" + encryption_string.charAt(3) + "" + encryption_string.charAt(0) + "" + encryption_string.charAt(1);
		return encryption;
	}
		
}
