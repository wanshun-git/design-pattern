package example02;

public class FileLog implements Log {

	@Override
	public void writeLog() {
		System.out.println("利用文件记录日志!");
	}

}
