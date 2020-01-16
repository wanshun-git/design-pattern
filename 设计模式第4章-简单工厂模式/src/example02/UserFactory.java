package example02;

/**
 * 用户工厂类
 * @author ★天命之子★
 *
 */
public class UserFactory {

	/**
	 * 根据传入参数不同获得不同权限对象
	 * @param permission
	 * @return
	 */
	public static User getUser(int permission) {
		if (0 == permission) {
			return new Employee();
		} else if (1 == permission) {
			return new Manager();
		} else if (2 == permission) {
			return new Administrator();
		} else {
			return null;
		}
	}
	
}
