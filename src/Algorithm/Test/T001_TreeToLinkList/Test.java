package Algorithm.Test.T001_TreeToLinkList;

import Algorithm.Test.T001_TreeToLinkList.Solution1.TreeToLinkListImpl2;

/**
 * 输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。要求不能创建任何新的结点，只调整指针的指向。
	 比如将二元查找树
	 10
	 / \
	 6 14
	 / \ /  \
	 4 8 12  16
	转换成双向链表
	4=6=8=10=12=14=16。
 * @author Maggie Xiang
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree<Integer> tree=new Tree<Integer>();
		tree.addNode(49);
		tree.addNode(25);
		tree.addNode(55);
		tree.addNode(10);
		tree.addNode(51);
		tree.addNode(65);
		tree.display(tree.root);
		System.out.println();
//		TreeToLinkList<Integer> solution = new TreeToLinkListImpl1<Integer>();
//		Node<Integer> node = solution.convert(tree.root);
//		List<Integer> list = new List<Integer>();
//		list.display(node);
//		
		TreeToLinkList<Integer> solution2 = new TreeToLinkListImpl2<Integer>();
		Node<Integer> node2 = solution2.convert(tree.root);
		List<Integer> list2 = new List<Integer>();
		list2.display(node2);
	}

}