package example01;

/**
 * 领导类
 * @author ★天命之子★
 *
 */
public abstract class Leader {

	protected String name;
	
	protected Leader successor;

	public Leader(String name) {
		this.name = name;
	}
	
	public void setSuccessor(Leader successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(LeaveRequest request);
}
