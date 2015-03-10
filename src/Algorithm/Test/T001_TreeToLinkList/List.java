/**   
* @Title: List.java 
* @Package Algorithm.Test.T001_TreeToLinkList 
* @Description: The class used to describe the linkedlist
* @author xiangmin@cn.ibm.com   
* @date Mar 2, 2015 5:49:16 PM 
* @version V1.0   
*/
package Algorithm.Test.T001_TreeToLinkList;

/** 
 * @ClassName: List 
 * @Description: The class used to describe the linkedlist
 * @author xiangmin@cn.ibm.com 
 * @date Mar 2, 2015 5:49:16 PM 
 *  
 */
public class List<T extends Comparable<T>> {
	/**
	 * 
	* @Title: append 
	* @Description: append two list
	* @param @param node1
	* @param @param node2
	* @param @return
	* @return Node<T>
	* @throws
	 */
	public Node<T> append(Node<T> node1,Node<T> node2)
	{
		if(node1==null)
			return node2;
		if(node2==null)
			return node1;
		Node<T> tail=node1;
		while(tail.getrNode()!=null) {
			tail=tail.getrNode();
		}
		tail.setrNode(node2);
		node2.setlNode(tail);
		return node1;
	}

	public void display(Node<T> node){
		while(node != null){
			System.out.print(node.getData() + "\t");
			node = node.getrNode();
		}
	}
}
