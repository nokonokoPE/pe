

public class Main {
	public static final int DATA_SIZE = 1000000;
	
    public static void main(String[] args) {
    	int[] datas = new int[DATA_SIZE];
    	for(int i=0; i<DATA_SIZE; i++) {
    		datas[i] = (int)(Math.random()*DATA_SIZE);
    	}
    	
    	long start = System.currentTimeMillis();
    	datas = Sort.insertionSort(datas);
    	//datas = Sort.bogoSort(datas);
    	//datas = Sort.bubbleSort(datas);
    	//datas = Sort.mergeSort(datas);
    	//datas = Sort.quickSort(datas, 0, datas.length-1);
    	long end = System.currentTimeMillis();
    	
//    	for(int i=0; i<DATA_SIZE; i++) {
//    		System.out.println(datas[i]);
//    	}
    	System.out.println(end-start);
    }
}
