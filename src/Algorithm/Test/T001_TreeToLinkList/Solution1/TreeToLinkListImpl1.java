/**   
* @Title: TreeToLinkListImpl1.java 
* @Package Algorithm.Test.T001_TreeToLinkList.Solution1 
* @Description: The class implements the algorithm that conver the tree to link list
* @author xiangmin@cn.ibm.com   
* @date Mar 2, 2015 4:24:31 PM 
* @version V1.0   
*/
package Algorithm.Test.T001_TreeToLinkList.Solution1;

import Algorithm.Test.T001_TreeToLinkList.List;
import Algorithm.Test.T001_TreeToLinkList.Node;
import Algorithm.Test.T001_TreeToLinkList.TreeToLinkList;

/** 
 * @ClassName: TreeToLinkListImpl1 
 * @Description: The class implements the algorithm that convert the tree to link list
 * @author xiangmin@cn.ibm.com 
 * @date Mar 2, 2015 4:24:31 PM 
 *  
 */
public class TreeToLinkListImpl1<T extends Comparable<T>> implements TreeToLinkList<T>{

	/* (non-Javadoc)
	 * <p>Title: convert</p> 
	 * <p>Description: </p> 
	 * @param tree 
	 * @see Algorithm.Test.T001_TreeToLinkList.TreeToLinkList#convert(Algorithm.Test.T001_TreeToLinkList.Tree) 
	 */
	@Override
	public Node<T> convert(Node<T> root) {
		List<T> list = new List<T>();
		if(root != null){
			Node<T> left = convert(root.getlNode());
			Node<T> right = convert(root.getrNode());
			root.setlNode(null);
			root.setrNode(null);
			left = list.append(left, root);
			left = list.append(left, right);
			return left;
		} else {
			return null;
		}
	}

}
