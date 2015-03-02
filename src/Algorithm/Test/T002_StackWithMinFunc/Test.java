package Algorithm.Test.T002_StackWithMinFunc;

/**
 * ��Ŀ������ջ�����ݽṹ��Ҫ�����һ��min�������ܹ��õ�ջ����СԪ�ء�Ҫ����min��push�Լ�pop��ʱ�临�Ӷȶ���O(1)�� 
 * ʵ��˼·������Ҫһ������ջ��ÿ��pushһ����Ԫ�ص�ʱ��ͬʱ����СԪ�أ�����СԪ�ص�λ�á����ǵ�ջԪ�ص����Ϳ����Ǹ��ӵ����ݽṹ��
 * ����СԪ�ص�λ�ý��ܼ��ٿռ����ģ�push������ջ�У�ÿ��popһ��Ԫ�س�ջ��ʱ��ͬʱpop����ջ��
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
