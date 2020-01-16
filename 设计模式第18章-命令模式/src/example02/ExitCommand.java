package example02;

public class ExitCommand implements Command {

	private SystemExitClass seObj;
	
	public ExitCommand() {
		seObj = new SystemExitClass();
	}

	@Override
	public void execute() {
		seObj.exit();
		
	}
	
}
