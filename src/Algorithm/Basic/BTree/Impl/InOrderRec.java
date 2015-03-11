/**   
* @Title: PreOrderRec.java 
* @Package Algorithm.BTree.Impl 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:53:26 PM 
* @version V1.0   
*/
package Algorithm.Basic.BTree.Impl;
import Algorithm.Basic.BTree.*;
/** 
 * @ClassName: PreOrderRec 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:53:26 PM 
 *  
 */
public class InOrderRec <T extends Comparable<T>> implements BTreeTravelable<T>{

	/* (non-Javadoc)
	 * <p>Title: travel</p> 
	 * <p>Description: </p> 
	 * @param root 
	 * @see Algorithm.BTree.BTreeTravelable#travel(Algorithm.BTree.Node) 
	 */
	@Override
	public void travel(Node<T> root) {
		if(root != null){
			travel(root.getlNode());
			System.out.print(root.getData() + "\t");
			travel(root.getrNode());
		}
	}
	
}
