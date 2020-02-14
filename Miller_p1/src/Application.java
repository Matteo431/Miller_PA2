import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		//prompt the user to enter the four-digit integer
		System.out.println("Please enter a four-digit integer: ");
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		
		//safe programming in case the length isn't there
		if(num.length() != 4)
			System.out.println("Please enter a four-digit integer: ");
		
		//run through the encrypter program to encrypt the value
		Encrypter run_encryption = new Encrypter();
		String encrypt_result = run_encryption.encrypt(num);
		System.out.printf("Encrypted value: %s\n", encrypt_result);
		
		//run through the decrypter program to attain the original prompted value
		Decrypter run_decryption = new Decrypter();
		String decrypt_result = run_decryption.decrypt(encrypt_result);
		System.out.printf("Decrypted value: %s\n", decrypt_result);	

	}
	
}
