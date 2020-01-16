package example01;

/**
 * 邮件类(浅克隆）
 * @author ★天命之子★
 *
 */
public class Email implements Cloneable {

	private Attachment attacchment = null;
	
	public Email() {
		this.attacchment = new Attachment();
	}
	
	public Object clone() {
		Email clone = null;
		try {
			clone = (Email) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Clone failure!");
		}
		return clone;
	}
	
	public Attachment getAttachment() {
		return this.attacchment;
	}
	
	public void display() {
		System.out.println("查看邮件");
	}
}
