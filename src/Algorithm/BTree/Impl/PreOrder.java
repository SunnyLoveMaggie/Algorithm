/**   
* @Title: PreOrderRec.java 
* @Package Algorithm.BTree.Impl 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:53:26 PM 
* @version V1.0   
*/
package Algorithm.BTree.Impl;
import java.util.LinkedList;

import Algorithm.BTree.BTreeTravelable;
import Algorithm.BTree.Node;
/** 
 * @ClassName: PreOrderRec 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:53:26 PM 
 *  
 */
public class PreOrder <T extends Comparable<T>> implements BTreeTravelable<T>{

	/* (non-Javadoc)
	 * <p>Title: travel</p> 
	 * <p>Description: </p> 
	 * @param root 
	 * @see Algorithm.BTree.BTreeTravelable#travel(Algorithm.BTree.Node) 
	 */
	@Override
	public void travel(Node<T> root) {
		LinkedList<Node <T>> stack = new LinkedList<Node <T>>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node<T> node = stack.poll();
			if(node != null) {
				System.out.print(node.getData() + "\t");
				stack.push(node.getrNode());
				stack.push(node.getlNode());
			}
		}
	}
	
}
