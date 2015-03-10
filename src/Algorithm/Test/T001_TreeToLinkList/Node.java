/**   
* @Title: Node.java 
* @Package Algorithm.Test.T001_TreeToLinkList 
* @Description: This class used to describe the tree node
* @author xiangmin@cn.ibm.com   
* @date Mar 2, 2015 1:54:09 PM 
* @version V1.0   
*/
package Algorithm.Test.T001_TreeToLinkList;

/** 
 * @ClassName: Node 
 * @Description: This class used to describe the tree node(contains the data, left node and right node)
 * @author xiangmin@cn.ibm.com 
 * @date Mar 2, 2015 1:54:09 PM 
 *  
 */
public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> lNode;
	private Node<T> rNode;
	public Node(T data){
		this.setData(data);
		this.setlNode(null);
		this.setrNode(null);
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
