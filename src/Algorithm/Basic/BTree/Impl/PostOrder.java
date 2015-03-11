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
public class PostOrder <T extends Comparable<T>> implements BTreeTravelable<T>{

	/* (non-Javadoc)
	 * <p>Title: travel</p> 
	 * <p>Description: </p> 当上一个访问的结点是右孩子或者当前结点没有右孩子则访问当前结点
	 * @param root 
	 * @see Algorithm.BTree.BTreeTravelable#travel(Algorithm.BTree.Node) 
	 */
	@Override
	public void travel(Node<T> root) {
		LinkedList<Node <T>> stack = new LinkedList<Node <T>>();
		Node<T> node = root;
		Node<T> rNode = null;  
		while(!stack.isEmpty() || node !=null){
			while(node!=null){
				stack.push(node);
				node = node.getlNode();
			}
			node = stack.pop();
			while(node != null && (node.getrNode() == null || node.getrNode() == rNode)){
				System.out.print(node.getData() + "\t");
				rNode = node;
				if(stack.isEmpty()){
					return;
				}
				node = stack.pop();
			}
			stack.push(node);
			node = node.getrNode();
		}
	}
	
}
