package Algorithm.Basic.Sort;

public class SortUtil {

	public static <E extends Comparable<E>>void printSortDataBefore(E data[]){
		// Data before sort
		System.out.println("The data before sort is:");
		for(E temp : data){
			System.out.print(temp + ", ");
		}
		System.out.println();
	}
	
	public static <E extends Comparable<E>>void printSortDataAfter(E data[]){
		// Data after sort
		System.out.println("The data after sort is:");
		for(E temp : data){
			System.out.print(temp + ", ");
		}
		System.out.println();
	}
	
}
