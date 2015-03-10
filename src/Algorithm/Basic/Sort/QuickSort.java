package Algorithm.Basic.Sort;

public class QuickSort {
	public static <T extends Comparable<T>> void sort(T dataList[]){
		T data[] = dataList.clone();
		// Print data before sort
		SortUtil.printSortDataBefore(data);
		
		// Sort the data
		innerSort(data, 0, data.length-1);
		// Print data after sort
		SortUtil.printSortDataAfter(data);
	}
	
	private static<T extends Comparable<T>> int partition(T dataList[], int start, int end){
		T partitionPoint = dataList[start];
		while(start<end){
			while(start<end && dataList[end].compareTo(partitionPoint)>0){
				end--;
			}
			if(start<end){
				dataList[start]= dataList[end];
				dataList[end] = null;//inder to see easy when do debug
			}
			while(start<end && dataList[start].compareTo(partitionPoint)<=0){
				start++;
			}
			if(start<end){
				dataList[end]= dataList[start];
				dataList[start] = null;
			}
		}
		dataList[start] = partitionPoint;
		return start;
	}
	
	private static<T extends Comparable<T>> void innerSort(T dataList[], int start, int end){
		if(start<end){
			int partitionPoint = partition(dataList, start, end);
			innerSort(dataList, start, partitionPoint-1);
			innerSort(dataList, partitionPoint+1, end);
		}
		
	}
}
