package example02;

public class HelpCommand implements Command {
	
	private DisplayHelpClass hcObj;

	public HelpCommand() {
		hcObj = new DisplayHelpClass();
	}
	
	@Override
	public void execute() {
		hcObj.display();
	}

}
