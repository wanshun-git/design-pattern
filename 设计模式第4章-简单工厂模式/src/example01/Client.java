package example01;

/**
 * 客户端测试类
 * @author ★天命之子★
 *
 */
public class Client {
	
	public static void main(String[] args) {
		try {
			TV tv;
			String brandName = XMLUtilTV.getBrandName();
			tv = TVFactory.produceTV(brandName);
			tv.play();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
