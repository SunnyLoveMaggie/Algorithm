package Algorithm.Basic.Sort;

public class SelectSort {

	public static <E extends Comparable<E>> void sort(E dataList[]){
		E data[] = dataList.clone();
		// Print data before sort
		SortUtil.printSortDataBefore(data);
		
		// Sort data
		for(int outter = 0; outter < data.length; outter ++){
			int maxIndex = 0;
			for(int inner = 0; inner < data.length - outter; inner ++){
				if(data[inner].compareTo(data[maxIndex]) > 0) {
					maxIndex = inner;
				}
			}
			if(maxIndex != data.length - outter -1){
				E temp = data[maxIndex];
				data[maxIndex] = data[data.length - outter -1];
				data[data.length - outter -1] = temp;
			}
		}
		
		// Print data after sort
		SortUtil.printSortDataAfter(data);
	}
}
