package Algorithm.Test.T001_TreeToLinkList;

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
 * @author sunny
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.add(49);
		tree.add(25);
		tree.add(55);
		tree.add(10);
		tree.add(51);
		tree.add(65);
        TreeNode head=tree.convertoList(tree.root);
        tree.display(head);
	}

}