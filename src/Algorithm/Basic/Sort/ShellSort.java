package Algorithm.Basic.Sort;

public class ShellSort {
	public static <T extends Comparable<T>> void sort(T dataList[]){
		T data[] = dataList.clone();
		// Print data before sort
		SortUtil.printSortDataBefore(data);
		
		// Sort the data
		
		// Print data after sort
		SortUtil.printSortDataAfter(data);
	}
}
