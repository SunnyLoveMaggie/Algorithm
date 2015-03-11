/**   
* @Title: Node.java 
* @Package Algorithm.BTree 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:44:47 PM 
* @version V1.0   
*/
package Algorithm.BTree;

/** 
 * @ClassName: Node 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:44:47 PM 
 *  
 */
public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> lNode;
	private Node<T> rNode;
	Node(T data){
		this.data = data;
		this.lNode = null;
		this.rNode = null;
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	/**
	 * @return the lNode
	 */
	public Node<T> getlNode() {
		return lNode;
	}
	/**
	 * @param lNode the lNode to set
	 */
	public void setlNode(Node<T> lNode) {
		this.lNode = lNode;
	}
	/**
	 * @return the rNode
	 */
	public Node<T> getrNode() {
		return rNode;
	}
	/**
	 * @param rNode the rNode to set
	 */
	public void setrNode(Node<T> rNode) {
		this.rNode = rNode;
	}
	
}
