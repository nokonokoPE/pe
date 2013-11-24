

public class Main {
	public static final int DATA_SIZE = 100000;
	private static final long TIMES = 10;
	
    public static void main(String[] args) {
    	
    	
    	long totalTime = 0;
    	for(int i=0; i<TIMES; i++) {
    		int[] datas = new int[DATA_SIZE];
        	for(int j=0; j<DATA_SIZE; j++) {
        		datas[j] = (int)(Math.random()*DATA_SIZE);
        	}

	    	long start = System.currentTimeMillis();
	    	datas = Sort.insertionSort(datas);
	    	//datas = Sort.bogoSort(datas);
	    	//datas = Sort.bubbleSort(datas);
	    	//datas = Sort.mergeSort(datas);
	    	//datas = Sort.quickSort(datas, 0, datas.length-1);
	    	long end = System.currentTimeMillis();
	    	totalTime += end - start;
    	}
    	
//    	for(int i=0; i<DATA_SIZE; i++) {
//    		System.out.println(datas[i]);
//    	}
    	System.out.println(totalTime/TIMES);
    }
}
