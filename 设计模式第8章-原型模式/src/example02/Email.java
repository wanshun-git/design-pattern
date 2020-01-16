package example02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

/**
 * 邮件类(深克隆)
 * @author ★天命之子★
 *
 */
public class Email implements Serializable {

	private Attachment attchment = null;
	
	public Email() {
		this.attchment = new Attachment();
	}
	
	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException {
		//将对象写入流中
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		
		//将对象从流中取出
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (ois.readObject());
	}
	
	public Attachment getAttachment() {
		return this.attchment;
	}
	
	public void display() {
		System.out.println("查看邮件");
	}
}
