package example01;

/**
 * 具体状态类（专家状态类）
 * @author ★天命之子★
 *
 */
public class HighState extends AbstractState {
	
	public HighState(AbstractState state) {
		this.acc = state.acc;
		this.point = state.getPoint();
		this.stateName = "专家";
	}

	@Override
	public void writeNote(int score) {
		System.out.println(acc.getName() + "发布留言" + "，增加" + score + "*2个积分。");
		this.point += score * 2;
		checkState(score);
		System.out.println("剩余积分为：" + this.point + ",当前级别为：" + acc.getState().stateName + "。");
	}
	
	@Override
	public void downloadFile(int score) {
		System.out.println(acc.getName() + "下载文件，扣除" + score + "/2积分。");
		this.point -= score / 2;
		checkState(score);
		System.out.println("剩余积分为：" + this.point + ",当前级别为：" + acc.getState().stateName + "。");
	}
	
	@Override
	public void checkState(int score) {
		if (point < 0) {
			System.out.println("余额不足，文件下载失败！");
			this.point += score / 2;
		} else if (point <= 100) {
			acc.setState(new PrimaryState(this));
		} else if (point <= 1000) {
			acc.setState(new MiddleState(this));
		}
		
	}

}
