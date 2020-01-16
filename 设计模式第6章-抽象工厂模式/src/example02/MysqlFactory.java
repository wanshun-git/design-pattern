package example02;

public class MysqlFactory implements DBFactory {

	@Override
	public Connection createConnection() {
		return new MysqlConnection();
	}

	@Override
	public Statement createStatement() {
		return new MysqlStatement();
	}

}
