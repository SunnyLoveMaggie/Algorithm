package Algorithm.Basic.Sort;


public class BulleSort{

	public static <T extends Comparable<T>> void sort(T dataList[]){
		T data[] = dataList.clone();
		// Print data before sort
		SortUtil.printSortDataBefore(data);
		
		// Sort the data
		for(int outIndex = 0; outIndex < data.length; outIndex++){
			for(int innerIndex = 0; innerIndex < data.length - outIndex -1; innerIndex++){
				if(data[innerIndex].compareTo(data[innerIndex + 1]) >  0){
					T temp = data[innerIndex];
					data[innerIndex] = data[innerIndex + 1];
					data[innerIndex + 1] = temp;
				}
			}
		}
		
		// Print data after sort
		SortUtil.printSortDataAfter(data);
	}
}
