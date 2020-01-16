package example02;

public class Client {

	public static void main(String[] args) {
		FunctionButton button = new FunctionButton();
		button.setCommand(new ExitCommand());
		button.click();
		button.setCommand(new HelpCommand());
		button.click();
	}
}
