package example01;

import java.util.Hashtable;

/**
 * 具体中介者类（具体聊天室类）
 * @author ★天命之子★
 *
 */
public class ChatGroup extends AbstractChatroom {

	private Hashtable members = new Hashtable();
	
	@Override
	public void register(Member member) {
		if (!members.contains(member)) {
			members.put(member.getName(), member);
			member.setChatroom(this);
		}

	}

	@Override
	public void sendText(String from, String to, String message) {
		Member member = (Member) members.get(to);
		// 模拟不雅字符过滤
		String newMessage = message.replaceAll("日", "*");
		member.receiveText(from, newMessage);
	}

	@Override
	public void sendImage(String from, String to, String image) {
		Member member = (Member) members.get(to);
		// 模拟图片大小判断
		if (image.length() > 5) {
			System.out.println("图片太大，发送失败！");
		} else {
			member.receiveImage(from, image);
		}

	}

}
