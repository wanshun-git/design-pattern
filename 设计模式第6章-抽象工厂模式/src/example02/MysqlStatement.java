package example02;

public class MysqlStatement implements Statement {

	@Override
	public void getState() {
		System.out.println("获得mysql的statement!");
	}

}
