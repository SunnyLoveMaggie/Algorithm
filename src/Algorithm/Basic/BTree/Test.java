/**   
* @Title: Test.java 
* @Package Algorithm.BTree 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 5:15:13 PM 
* @version V1.0   
*/
package Algorithm.Basic.BTree;

import Algorithm.Basic.BTree.Impl.InOrder;
import Algorithm.Basic.BTree.Impl.InOrderRec;
import Algorithm.Basic.BTree.Impl.PostOrder;
import Algorithm.Basic.BTree.Impl.PostOrderRec;
import Algorithm.Basic.BTree.Impl.PreOrder;
import Algorithm.Basic.BTree.Impl.PreOrderRec;


/** 
 * @ClassName: Test 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 5:15:13 PM 
 *  
 */
public class Test {
	public static void main(String args[]){
		BTree<Integer> tree=new BTree<Integer>();
		tree.insert(49);
		tree.insert(25);
		tree.insert(55);
		tree.insert(10);
		tree.insert(51);
		tree.insert(65);
		System.out.println("ǰ��������ݹ飩:");
		tree.setTravelMethod(new PreOrderRec<Integer>());
		tree.travelTree();
		System.out.println();
		System.out.println("ǰ��������ǵݹ飩:");
		tree.setTravelMethod(new PreOrder<Integer>());
		tree.travelTree();
		System.out.println();
		System.out.println("����������ݹ飩:");
		tree.setTravelMethod(new InOrderRec<Integer>());
		tree.travelTree();
		System.out.println();
		System.out.println("����������ǵݹ飩:");
		tree.setTravelMethod(new InOrder<Integer>());
		tree.travelTree();
		System.out.println();
		System.out.println("����������ݹ飩:");
		tree.setTravelMethod(new PostOrderRec<Integer>());
		tree.travelTree();
		System.out.println();
		System.out.println("����������ǵݹ飩:");
		tree.setTravelMethod(new PostOrder<Integer>());
		tree.travelTree();
	}
}
