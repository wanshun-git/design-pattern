package example02;

public class OracleConnection implements Connection {

	@Override
	public void getConn() {
		System.out.println("连接oracle数据库!");
	}

}
