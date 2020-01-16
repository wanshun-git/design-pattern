package example01;

/**
 * 抽象权限接口
 * @author dmc
 *
 */
public interface AbstractPermission {

	void modifyUserInfo();
	void viewNote();
	void publishNote();
	void modifyNote();
	void setLevel(int level);
}
