/**   
* @Title: TreeToLinkList.java 
* @Package Algorithm.Test.T001_TreeToLinkList 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 2, 2015 4:16:32 PM 
* @version V1.0   
*/
package Algorithm.Test.T001_TreeToLinkList;


/** 
 * @ClassName: TreeToLinkList 
 * @Description: The interface the convert the tree to link list
 * @author xiangmin@cn.ibm.com 
 * @date Mar 2, 2015 4:16:32 PM 
 *  
 */
public interface TreeToLinkList<T extends Comparable<T>> {
	public Node<T> convert(Node<T> root);
}
