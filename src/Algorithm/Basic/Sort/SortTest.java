package Algorithm.Basic.Sort;


/**
 * Description�� 
    �ȶ�����
 * ��ĭ����bubble sort�� �� O(n2)
 * �������� ��insertion sort���� O(n2)
 * Ͱ���� ��bucket sort���� O(n); ��Ҫ O(k) ����ռ�
 * �������� (counting sort) �� O(n+k); ��Ҫ O(n+k) ����ռ�
 * �ϲ����� ��merge sort���� O(n log n); ��Ҫ O(n) ����ռ�
 * �������������� ��Binary tree sort�� �� O(n log n)����ʱ��; O(n2)�ʱ��; ��Ҫ O(n) ����ռ�
 * �������� ��radix sort���� O(n��k); ��Ҫ O(n) ����ռ�
 * 
   ���ȶ�����
 * ѡ������ ��selection sort���� O(n2)
 * ϣ������ ��shell sort���� O(n log n) ���ʹ����ѵ����ڰ汾
 * ������ ��heapsort���� O(n log n)
 * �������� ��quicksort���� O(n log n) ����ʱ��, O(n2) ����; ���ڴ�ġ���������һ��������������֪����
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
		//ð�������ѡ������Ƚ����񣬱Ƚϴ���һ������Ϊ n * (n + 1) / 2 ��
		//����ð����������ѡ��Сֵ�Ĺ����л���ж���Ľ�����ð��������������ֻҪ��������Ԫ�ص�˳�򲻶Ծͻ���н�����
		//��֮��Ӧ����ѡ������ֻ�����ڲ�ѭ���ȽϽ���֮�������������Ƿ���н��������������ҿ�����ѡ����������ð������ĸĽ���
		System.out.println("===============Bulle Sort===============");
		BulleSort.<Integer>sort(data);
		
		//Select sort
		//ѡ������ıȽϴ����ǹ̶� ʱ�临�ӶȺͿռ临�Ӷȷֱ�Ϊ O(n2 ) �� O(1)
		System.out.println("===============Select Sort===============");
		SelectSort.<Integer>sort(data);
		
		// Insert Sort
		//����������һ�����ȶ������򷽷�������Ч���������ʼ˳��ϢϢ��ء�һ������£����������ʱ�临�ӶȺͿռ临�Ӷȷֱ�Ϊ O(n2 ) �� O(1)
		System.out.println("===============Inset Sort===============");
		InsertSort.<Integer>sort(data);

		// Quick Sort
		//����������һ�����ȶ������򷽷�������Ч���������ʼ˳��ϢϢ��ء�һ������£����������ʱ�临�ӶȺͿռ临�Ӷȷֱ�Ϊ O(n2 ) �� O(1)
		System.out.println("===============quick Sort===============");
		QuickSort.<Integer>sort(data);
		
	}

}
