/**   
* @Title: BTree.java 
* @Package Algorithm.Test.T001_TreeToLinkList 
* @Description: This class describe the binary tree
* @author xiangmin@cn.ibm.com   
* @date Mar 2, 2015 2:01:53 PM 
* @version V1.0   
*/
package Algorithm.Test.T001_TreeToLinkList;

/** 
 * @ClassName: BTree 
 * @Description: This class describe the binary tree
 * @author xiangmin@cn.ibm.com 
 * @date Mar 2, 2015 2:01:53 PM 
 *  
 */
public class Tree<T extends Comparable<T>> {
	public Node<T> root = null;
	/**
	 * @Title: addNode 
	 * @Description: This method used to add a new node into the tree
	 * @param @param data
	 * @return void
	 * @throws
	 */
	public void addNode(T data){
		Node<T> node = new Node<T>(data);
		if(root == null){
			root = node;
		} else {
			Node<T> parent = root;
			Node<T> cur = root;
			boolean isLeft=true;
			while(cur != null)
			{
				parent=cur;
				if(data.compareTo(cur.getData()) < 0) {
					isLeft = true;
					cur = cur.getlNode();
				} else {
					isLeft=false;
					cur = cur.getrNode();
				}
			}
			if(isLeft) {
				parent.setlNode(node);
			} else
				parent.setrNode(node);
		}
	}

	/**
	 * 
	* @Title: display 
	* @Description: display all the nodes in tree
	* @param @param node
	* @return void
	* @throws
	 */
	public void display(Node<T> node){
		if(node != null){
			display(node.getlNode());
			System.out.print(node.getData() + "-->");
			display(node.getrNode());
		}
	}

}
