package example01;

/**
 * 身份证号码类
 * @author ★天命之子★
 *
 */
public class IdentityCardNo {

	private static IdentityCardNo instance = null;
	private String no;
	
	private IdentityCardNo(){}
	
	public static IdentityCardNo getInstance() {
		if (instance == null) {
			System.out.println("第一次办理秽语证,分配新号码!");
			instance = new IdentityCardNo();
			instance.setIdentityCardNo("No400011112222");
		} else {
			System.out.println("重复办理身份证,获取旧号码!");
		}
		return instance;
	}
	
	private void setIdentityCardNo(String no) {
		this.no = no;
	}
	
	public String getIdentityCardNo() {
		return this.no;
	}
}
