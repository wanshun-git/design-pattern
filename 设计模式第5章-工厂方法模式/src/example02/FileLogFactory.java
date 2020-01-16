package example02;

public class FileLogFactory implements LogFactory {

	@Override
	public Log createLog() {
		System.out.println("生成文件记录日志对象!");
		return new FileLog();
	}

}
