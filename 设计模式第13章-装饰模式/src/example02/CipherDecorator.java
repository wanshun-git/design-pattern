package example02;

/**
 * 抽象装饰类
 * @author dmc
 *
 */
public class CipherDecorator implements Cipher {

	private Cipher cipher;
	
	public CipherDecorator(Cipher cipher) {
		this.cipher = cipher;
	}
	
	@Override
	public String encrypt(String plainText) {
		return cipher.encrypt(plainText);
	}

}
