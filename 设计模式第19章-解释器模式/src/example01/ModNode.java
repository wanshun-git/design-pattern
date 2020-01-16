package example01;

/**
 * 非终结符表达式类（求模结点类）
 * @author ★天命之子★
 *
 */
public class ModNode extends SymbolNode {

	public ModNode(Node left, Node right) {
		super(left, right);
	}

	@Override
	public int interpret() {
		return super.left.interpret() % super.right.interpret();
	}

}
