package example01;

/**
 * 终结符表达式类（值节点类）
 * @author ★天命之子★
 *
 */
public class ValueNode implements Node {

	private int value;
	
	public ValueNode(int value) {
		this.value = value;
	}
	
	
	@Override
	public int interpret() {
		return this.value;
	}

}
