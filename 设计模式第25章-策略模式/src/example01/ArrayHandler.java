package example01;

/**
 * 环境类（数组处理类）
 * @author ★天命之子★
 *
 */
public class ArrayHandler {

	private Sort sortObj;
	
	public int[] sort(int arr[]) {
		sortObj.sort(arr);
		return arr;
	}
	
	public void setSortObj(Sort sortObj) {
		this.sortObj = sortObj;
	}
}
