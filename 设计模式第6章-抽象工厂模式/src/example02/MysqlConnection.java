package example02;

public class MysqlConnection implements Connection {

	@Override
	public void getConn() {
		System.out.println("连接mysql数据库!");
	}

}
