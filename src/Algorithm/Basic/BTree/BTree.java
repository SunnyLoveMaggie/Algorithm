/**   
* @Title: BTree.java 
* @Package Algorithm.BTree 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:46:02 PM 
* @version V1.0   
*/
package Algorithm.Basic.BTree;

/** 
 * @ClassName: BTree 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:46:02 PM 
 *  
 */
public class BTree<T extends Comparable<T>> {
	private Node<T> root;
	private BTreeTravelable<T> travelMethod;
	public void insert(T data){
		Node<T> node = new Node<T>(data);
		if(root == null){
			root = node;
			return;
		}
		Node<T> cur = root;
		Node<T> preNode = null;
		while(cur!=null){
			if(cur.getData().compareTo(node.getData()) < 0){
				preNode = cur;
				cur = cur.getrNode();
			} else if(cur.getData().compareTo(node.getData()) > 0){
				preNode = cur;
				cur = cur.getlNode();
			} else {
				return; // Have already include the data, no need to insert
			}
		}
		if(preNode.getData().compareTo(node.getData()) < 0){
			preNode.setrNode(node);
		} else{
			preNode.setlNode(node);
		}
	}

	public void travelTree(){
		travelMethod.travel(root);
	}

	public void setTravelMethod(BTreeTravelable<T> method){
		travelMethod = method;
	}
}
