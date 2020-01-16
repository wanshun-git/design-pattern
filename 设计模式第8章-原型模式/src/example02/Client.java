package example02;

import java.io.IOException;
import java.io.OptionalDataException;

public class Client {

	public static void main(String[] args) {
		Email email,copyEmail = null;
		email = new Email();
		
		try {
			copyEmail = (Email) email.deepClone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("email == copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println("email.getAttachment == copyEmail.getAttachment?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}
}
