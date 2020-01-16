package example01;

/**
 * 抽象中介者类（抽象聊天室类）
 * @author ★天命之子★
 *
 */
public abstract class AbstractChatroom {

	public abstract void register(Member member);
	
	public abstract void sendText(String from, String to, String message);
	
	public abstract void sendImage(String from, String to, String image);
	
}
