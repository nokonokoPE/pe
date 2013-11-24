
/**
 * Sort Class
 * @author Yoshiki
 *
 */
public class Sort {
	
	/**
	 * Insert Sort
	 * @param datas
	 * @return array
	 */
	public static int[] insertionSort(int[] datas) {
		int length = datas.length;
		for(int i=1; i<length; i++) {
			int tmp = datas[i];
			int j;
			for(j=i; j>0 && datas[j-1]>tmp; j--) {
				datas[j] = datas[j-1];
			}
			datas[j] = tmp;
		}
		return datas;
	}
	
	/**
	 * Bubble Sort
	 * @param datas
	 * @return array
	 */
	public static int[] bubbleSort(int[] datas) {
		int length = datas.length;
		for(int i=0; i<length-1; i++) {
			
			for(int j=1; j<length-i; j++) {
				// 前の方が大きい場合交換
				if(datas[j] < datas[j-1]) {
					int tmp = datas[j];
					datas[j] = datas[j-1];
					datas[j-1] = tmp;
				}
			}

			
		}
		return datas;
	}
	
	/**
	 * Merge Sort
	 * @param datas
	 * @return
	 */
	public static int[] mergeSort(int[] datas) {
		int length = datas.length;
		if(length > 1) {
			int mid = length / 2;
			int[] first = new int[mid];
			int[] second = new int[length-mid];
			for(int i=0; i<mid; i++) { // 前半部分
				first[i] = datas[i];
			}
			for(int i=0; i+mid<length; i++) { // 後半部分
				second[i] = datas[mid+i];
			}
			mergeSort(first);
			mergeSort(second);
			merge(first, second, datas);
		}
		return datas;
	}

	/**
	 * Merge
	 * @param first
	 * @param second
	 * @param datas
	 * @return
	 */
	private static int[] merge(int[] first, int[] second, int[] datas) {
		int i=0;
		int j=0;
		while(i<first.length || j<second.length) {
			if(j>=second.length || (i<first.length && first[i] < second[j])) {
				datas[i+j] = first[i];
				i++;
			} else {
				datas[i+j] = second[j];
				j++;
			}
		}
		return datas;
	}
	
	/**
	 * Quick Sort
	 * @param datas
	 * @param start
	 * @param end
	 * @return
	 */
	public static int[] quickSort(int[] datas, int start, int end) {
		if(start <= end) { // 交差したら終了
			int pivot = datas[(start+end)/2];
			int tmp;
			int i = start;
			int j = end;
			
			while(i<=j) {
				while(datas[i]<pivot) i++;
				while(datas[j]>pivot) j--;
				
				if(i<=j) {
					tmp = datas[j];
					datas[j] = datas[i];
					datas[i] = tmp;
					i++;
					j--;
				}
			}
			
			quickSort(datas, start, j);
			quickSort(datas, i, end);
		}
		
		return datas;
	}
	
	/**
	 * Bogo Sort
	 * @param datas
	 * @return
	 */
	public static int[] bogoSort(int[] datas) {
		
		while(sortChecker(datas) == false) {
			for(int i=0; i<datas.length; i++) {
				int index = (int)(Math.random()*Main.DATA_SIZE);
				int tmp = datas[i];
				datas[i] = datas[index];
				datas[index] = tmp;
			}
		}
		
		return datas;
	}
	
	/**
	 * Sort Checker
	 * @param datas
	 * @return boolean
	 */
	private static boolean sortChecker(int[] datas) {
		for(int i=1; i<datas.length ; i++) {
			if(datas[i-1] > datas[i]) {
				return false;
			}
		}
		return true;
	}
}
