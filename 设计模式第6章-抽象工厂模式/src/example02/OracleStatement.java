package example02;

public class OracleStatement implements Statement {

	@Override
	public void getState() {
		System.out.println("获得oracle的statement!");
	}

}
