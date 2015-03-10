package Algorithm.Basic.Sort;


/**
 * Description： 
    稳定排序：
 * 泡沫排序（bubble sort） — O(n2)
 * 插入排序 （insertion sort）— O(n2)
 * 桶排序 （bucket sort）— O(n); 需要 O(k) 额外空间
 * 计数排序 (counting sort) — O(n+k); 需要 O(n+k) 额外空间
 * 合并排序 （merge sort）— O(n log n); 需要 O(n) 额外空间
 * 二叉排序树排序 （Binary tree sort） — O(n log n)期望时间; O(n2)最坏时间; 需要 O(n) 额外空间
 * 基数排序 （radix sort）— O(n·k); 需要 O(n) 额外空间
 * 
   不稳定排序
 * 选择排序 （selection sort）— O(n2)
 * 希尔排序 （shell sort）— O(n log n) 如果使用最佳的现在版本
 * 堆排序 （heapsort）— O(n log n)
 * 快速排序 （quicksort）— O(n log n) 期望时间, O(n2) 最坏情况; 对于大的、乱数串行一般相信是最快的已知排序
 * 
 * @author Xiang Min(xiangmin@cn.ibm.com)
 * @version 1.0.0
 *
 *
 *  Create date		:
 *  Last update date:
 *  Update log		:
 */
public class SortTest {

	public static void main(String[] args) {

//		Integer[] data = {3,0,5,7,9,6,7,11,2,3};
		Integer[] data = {3,0,5,7,9,6,7,11,2,1};
		//BulleSort
		//冒泡排序跟选择排序比较相像，比较次数一样，都为 n * (n + 1) / 2 ，
		//但是冒泡排序在挑选最小值的过程中会进行额外的交换（冒泡排序在排序中只要发现相邻元素的顺序不对就会进行交换，
		//与之对应的是选择排序，只会在内层循环比较结束之后根据情况决定是否进行交换），所以在我看来，选择排序属于冒泡排序的改进版
		System.out.println("===============Bulle Sort===============");
		BulleSort.<Integer>sort(data);
		
		//Select sort
		//选择排序的比较次数是固定 时间复杂度和空间复杂度分别为 O(n2 ) 和 O(1)
		System.out.println("===============Select Sort===============");
		SelectSort.<Integer>sort(data);
		
		// Insert Sort
		//插入排序是一个不稳定的排序方法，插入效率与数组初始顺序息息相关。一般情况下，插入排序的时间复杂度和空间复杂度分别为 O(n2 ) 和 O(1)
		System.out.println("===============Inset Sort===============");
		InsertSort.<Integer>sort(data);

		// Quick Sort
		//插入排序是一个不稳定的排序方法，插入效率与数组初始顺序息息相关。一般情况下，插入排序的时间复杂度和空间复杂度分别为 O(n2 ) 和 O(1)
		System.out.println("===============quick Sort===============");
		QuickSort.<Integer>sort(data);
		
	}

}
