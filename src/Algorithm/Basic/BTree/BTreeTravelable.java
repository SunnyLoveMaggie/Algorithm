/**   
* @Title: BTreeTravel.java 
* @Package Algorithm.BTree 
* @Description: TODO
* @author xiangmin@cn.ibm.com   
* @date Mar 10, 2015 4:50:50 PM 
* @version V1.0   
*/
package Algorithm.Basic.BTree;

/** 
 * @ClassName: BTreeTravel 
 * @Description: TODO
 * @author xiangmin@cn.ibm.com 
 * @date Mar 10, 2015 4:50:50 PM 
 *  
 */
public interface BTreeTravelable<T extends Comparable<T>> {
	public void travel(Node<T> root);
}
