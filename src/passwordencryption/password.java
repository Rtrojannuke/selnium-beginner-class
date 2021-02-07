package passwordencryption;

import java.util.Base64;

public class password {
	
	public static void main(String[] args) {
		
		//Placing password value in a variable
		String password = "password";
		
		//encoding the variable in a new variable 
		String encodedpassword = new String(Base64.getEncoder().encode(password.getBytes()));
		
		//printing out the encoded value
		System.out.println(encodedpassword);
		
		//to DECODE
		String decodedPassword = new String(Base64.getDecoder().decode(encodedpassword.getBytes()));
		System.out.println(decodedPassword);
		
		
		
	}

}
