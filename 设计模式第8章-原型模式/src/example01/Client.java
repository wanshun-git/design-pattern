package example01;

/**
 * 客户端测试类
 * @author ★天命之子★
 *
 */
public class Client {

	public static void main(String[] args) {
		Email email,copyEmail;
		email = new Email();
		copyEmail = (Email) email.clone();
		
		System.out.println("email == copyEmail?");
		System.out.println(email == copyEmail);
		
		System.out.println("email.getAttachment == copyEmail.getAttachment?");
		System.out.println(email.getAttachment() == copyEmail.getAttachment());
	}
}
