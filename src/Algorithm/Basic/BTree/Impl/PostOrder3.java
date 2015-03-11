/**   
* @Title: PreOrderRec.java 
* @Package Algorithm.BTree.Impl 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:53:26 PM 
* @version V1.0   
*/
package Algorithm.Basic.BTree.Impl;
import java.util.LinkedList;

import Algorithm.Basic.BTree.*;
/** 
 * @ClassName: PreOrderRec 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:53:26 PM 
 *  
 */
public class PostOrder3 <T extends Comparable<T>> implements BTreeTravelable<T>{

	/* (non-Javadoc)
	 * <p>Title: travel</p> 
	 * <p>Description: Ë«Õ»·¨
	 * @param root 
	 * @see Algorithm.BTree.BTreeTravelable#travel(Algorithm.BTree.Node) 
	 */
	@Override
	public void travel(Node<T> root) {
		LinkedList<Node <T>> lstack = new LinkedList<Node <T>>(); //×ó×ÓÊ÷Õ»
		LinkedList<Node <T>> rstack = new LinkedList<Node <T>>(); //ÓÒ×ÓÊ÷Õ»
		Node<T> node = root, right;
			do {
				while (node != null) {
					right = node.getrNode();
					lstack.push(node);
					rstack.push(right);
					node = node.getlNode();
				}
				node = lstack.pop();
				right = rstack.pop();
				if (right == null) {
					System.out.print(node.getData() + "\t");
				} else {
					lstack.push(node);
					rstack.push(null);
				}
				node = right;
			} while (lstack.size() > 0 || rstack.size() > 0);
	}

}
