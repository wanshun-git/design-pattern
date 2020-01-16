package example02;

public class FunctionButton {

	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
	
}
