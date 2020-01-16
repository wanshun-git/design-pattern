package example02;

public interface DBFactory {

	Connection createConnection();
	Statement createStatement();
}
