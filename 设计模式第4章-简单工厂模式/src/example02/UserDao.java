package example02;

/**
 * 用户表数据访问类
 * @author ★天命之子★
 *
 */
public class UserDao {

	public int findPermission(String userName, String userPassword) {
		if ("zhangsan" == userName && "123456" == userPassword) {
			return 1;
		} else {
			return -1;
		}
	}
}
