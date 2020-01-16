package example01;

/**
 * 具体同事类（钻石会员类）
 * @author ★天命之子★
 *
 */
public class DiamondMember extends Member {

	public DiamondMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		System.out.println("钻石会员发送消息：");
		chatroom.sendText(name, to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("钻石会员发送图片：");
		chatroom.sendImage(name, to, image);
	}

}
