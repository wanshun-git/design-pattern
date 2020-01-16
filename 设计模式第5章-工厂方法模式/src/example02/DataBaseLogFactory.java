package example02;

public class DataBaseLogFactory implements LogFactory {

	@Override
	public Log createLog() {
		System.out.println("生成数据库记录日志对象");
		return new DatabaseLog();
	}

}
