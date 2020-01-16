package example01;

/**
 * 调用者类（摇控器类）
 * @author ★天命之子★
 *
 */
public class Controller {

	private AbstractCommand openCommand, closeCommand, changeCommand;
	
	public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
		this.openCommand = openCommand;
		this.closeCommand = closeCommand;
		this.changeCommand = changeCommand;
	}
	
	public void open() {
		openCommand.execute();
	}
	
	public void close() {
		closeCommand.execute();
	}
	
	public void change() {
		changeCommand.execute();
	}
}
