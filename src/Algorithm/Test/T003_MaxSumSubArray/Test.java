package Algorithm.Test.T003_MaxSumSubArray;

/**
 * http://www.jb51.net/article/37268.htm
 * ˼·:
 *  �����Ǽ���һ������ʱ���ͻ����ӣ������Ǽ���һ������ʱ���ͻ���١������ǰ�õ��ĺ��Ǹ�������
	��ô������ڽ��������ۼ���Ӧ���������������㣬��Ȼ�Ļ��������������ٽ������ĺ͡�����������˼·�����ǿ���д�����´��룺 
 * @author sunny
 *
 */
public class Test {

	public static void main(String args[]){
		int data[] = {1, -2, 3, 10, -4, 7, 2, -5};
		MaxSumSubArray fun = new MaxSumSubArray(data);
		fun.getMaxSumSubArray();
	}

}
