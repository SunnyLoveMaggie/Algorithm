package Algorithm.Test.T001_TreeToLinkList;

/**
 * ����һ�ö�Ԫ�����������ö�Ԫ������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ����ָ���ָ��
	 ���罫��Ԫ������
	 10
	 / \
	 6 14
	 / \ /  \
	 4 8 12  16
	ת����˫������
	4=6=8=10=12=14=16��
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