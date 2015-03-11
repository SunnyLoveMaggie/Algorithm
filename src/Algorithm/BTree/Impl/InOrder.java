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
public class InOrder <T extends Comparable<T>> implements BTreeTravelable<T>{

	/* (non-Javadoc)
	 * <p>Title: travel</p> 
	 * <p>Description: </p> 
	 * @param root 
	 * @see Algorithm.BTree.BTreeTravelable#travel(Algorithm.BTree.Node) 
	 */
	@Override
	public void travel(Node<T> root) {
		LinkedList<Node <T>> stack = new LinkedList<Node <T>>();
		Node<T> node = root;
		while(!stack.isEmpty() || node !=null){
			while(node!=null){
				stack.push(node);
				node = node.getlNode();
			}
			if(!stack.isEmpty()){
				node = stack.pop();
				System.out.print(node.getData() + "\t");
				node = node.getrNode();
			}
		}
	}
	
}
