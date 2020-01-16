package example01;

/**
 * 非终结符表达式类（除法节点类）
 * @author ★天命之子★
 *
 */
public class DivNode extends SymbolNode {

	public DivNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		return super.left.interpret() / super.right.interpret();
	}

}
