package example02;

public class Administrator extends User {

	public Administrator() {
		System.out.println("创建管理员对象!");
	}
	
	@Override
	public void diffOperation() {
		System.out.println("管理员具有创建和管理假条权限!");
	}

}
