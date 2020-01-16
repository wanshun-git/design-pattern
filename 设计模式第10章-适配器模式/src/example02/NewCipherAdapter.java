package example02;

public class NewCipherAdapter extends DataOperation {

	NewCipher cipher;
	
	public NewCipherAdapter() {
		cipher = new NewCipher();
	}
	
	@Override
	public String doEncrypt(int key, String ps) {
		return cipher.doEncrypt(key, ps);
	}

}
