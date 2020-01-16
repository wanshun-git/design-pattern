package example01;

/**
 * 抽象非终结符表达式类（符号节点类）
 * @author ★天命之子★
 *
 */
public abstract class SymbolNode implements Node {

	protected Node left;
	
	protected Node right;

	public SymbolNode(Node left, Node right) {
		this.left = left;
		this.right = right;
	}
	
}
