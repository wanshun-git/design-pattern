package example02;

public class Client {

	public static void main(String[] args) {
		try {
			Connection connection;
			Statement statement;
			DBFactory factory;
			factory = (DBFactory) XMLUtil.getBean();
			connection = factory.createConnection();
			connection.getConn();
			statement = factory.createStatement();
			statement.getState();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
