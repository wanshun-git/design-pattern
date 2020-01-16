package example01;

/**
 * 抽像迭代器类（电视机遥控器类）
 * @author ★天命之子★
 *
 */
public interface TVIterator {

	void setChannel(int i);
	void next();
	void previous();
	boolean isLast();
	Object currentChannel();
	boolean isFirst();
}
