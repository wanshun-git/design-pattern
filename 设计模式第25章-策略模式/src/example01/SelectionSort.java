package example01;

/**
 * 具体策略类（选择排序类）
 * @author ★天命之子★
 *
 */
public class SelectionSort implements Sort {

	@Override
	public int[] sort(int[] arr) {

		int len = arr.length;
		int temp;
		for (int i = 0; i < len; i++) {
			temp = arr[i];
			int j;
			int smallestLocation = i;
			for (j = i + 1; j < len; j++) {
				if (arr[j] < temp) {
					temp = arr[j];
					smallestLocation = j;
				}
			}
			arr[smallestLocation] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("选择排序");
		return arr;
	}

}
