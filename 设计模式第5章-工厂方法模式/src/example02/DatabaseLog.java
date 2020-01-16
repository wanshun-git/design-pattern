package example02;

public class DatabaseLog implements Log {

	@Override
	public void writeLog() {
		System.out.println("利用数据库记录日志!");
	}

}
