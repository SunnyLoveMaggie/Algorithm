package Algorithm.Test.T003_MaxSumSubArray;

/**
 * http://www.jb51.net/article/37268.htm
 * 思路:
 *  当我们加上一个正数时，和会增加；当我们加上一个负数时，和会减少。如果当前得到的和是个负数，
	那么这个和在接下来的累加中应该抛弃并重新清零，不然的话这个负数将会减少接下来的和。基于这样的思路，我们可以写出如下代码： 
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
