
public class Decrypter {
	public String decrypt(String encrypt_result) {
		//variable declaration
		String decrypt_string = "";
		
		//for loop parses through the integers 
		for(int i=0; i<encrypt_result.length(); i++) {
			int neg_check = 0;
			neg_check += (Integer.parseInt(encrypt_result.charAt(i)+"") - 7);
			if (neg_check < 0)
				neg_check += 10;
			decrypt_string += neg_check;
		}
		
		//hard programming the decryption with the charAt function, so the numbers end up back at their original place before they're returned
		String decryption = decrypt_string.charAt(2) + "" + decrypt_string.charAt(3) + "" + decrypt_string.charAt(0) + "" + decrypt_string.charAt(1);
		return decryption;	 
		
	}
}
