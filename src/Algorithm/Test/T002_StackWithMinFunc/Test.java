package Algorithm.Test.T002_StackWithMinFunc;

/**
 * 题目：定义栈的数据结构，要求添加一个min函数，能够得到栈的最小元素。要求函数min、push以及pop的时间复杂度都是O(1)。 
 * 实现思路：们需要一个辅助栈。每次push一个新元素的时候，同时将最小元素（或最小元素的位置。考虑到栈元素的类型可能是复杂的数据结构，
 * 用最小元素的位置将能减少空间消耗）push到辅助栈中；每次pop一个元素出栈的时候，同时pop辅助栈。
 * @author sunny
 *
 */
public class Test {

	public static void main(String args[]){
		StachWithMinFunc<Integer> newStack = new StachWithMinFunc<Integer>();
        newStack.push(4);
        newStack.push(6);
        newStack.push(2);
        newStack.push(5);
        System.out.println(newStack.min());
        newStack.pop();
        newStack.pop();
        System.out.println(newStack.min());
        newStack.push(1);
        System.out.println(newStack.min());
	}

}
