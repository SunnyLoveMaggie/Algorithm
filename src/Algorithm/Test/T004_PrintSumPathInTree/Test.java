package Algorithm.Test.T004_PrintSumPathInTree;

public class Test {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addNode(new BinaryTreeNode(10));
		tree.addNode(new BinaryTreeNode(5));
		tree.addNode(new BinaryTreeNode(12));
		tree.addNode(new BinaryTreeNode(4));
		tree.addNode(new BinaryTreeNode(7));
		tree.addNode(new BinaryTreeNode(9));
		tree.addNode(new BinaryTreeNode(3));
		tree.print();
		tree.printSumPath(22);
		tree.printSumPath(31);
	}

}
