package Algorithm.Basic.Sort;

public class InsertSort {

	public static <E extends Comparable<E>> void sort(E dataList[]){
		E[] data = dataList.clone();
		// Print data before sort
		SortUtil.printSortDataBefore(data);
		
		// Sort the data
		for(int outter = 0; outter < data.length; outter++){
			for(int inner = outter; inner > 0; inner--){
				if(data[inner].compareTo(data[inner-1])<0){
					E temp = data[inner];
					data[inner] = data[inner -1];
					data[inner -1] = temp;
				} else{
					break;
				}
			}
		}
		
		// Print data after sort
		SortUtil.printSortDataAfter(data);
		
	}
}
