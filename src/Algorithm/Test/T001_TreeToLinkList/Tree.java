package Algorithm.Test.T001_TreeToLinkList;

public class Tree {
	 public TreeNode root;
	 //排序二叉树中插入节点
	 public void add(int data)
	 {
		 TreeNode node=new TreeNode(data);
		 if(root==null)
			 root=node;
		 else
		 {
			 TreeNode current=root;
			 TreeNode parent=root;
			 boolean isLeft=true;
			 while(current!=null)
			 {
				 parent=current;
				 if(data<current.data)
				 {
					 isLeft=true;
					 current=current.left;
				 }
				 else
				 {
					 isLeft=false;
					 current=current.right;
				 }
			 }
			 if(isLeft)
				 parent.left=node;
			 else
				 parent.right=node;
		 }
	 }
	 
	 //将两个链表合并
	 public TreeNode append(TreeNode node1,TreeNode node2)
	 {
		 if(node1==null)
			 return node2;
		 if(node2==null)
			 return node1;
		 TreeNode tail=node1;
		 while(tail.right!=null)
			 tail=tail.right;
		 tail.right=node2;
		 node2.left=tail;
		 return node1;
	 }
	 //转换
	 public TreeNode convertoList(TreeNode node)
	 {
		 if(node==null)
			 return null;
		 TreeNode left=convertoList(node.left);
		 TreeNode right=convertoList(node.right);//将父节点独立
		 node.left=null;
		 node.right=null;
		 left=append(left,node);
		 left=append(left,right);
		 return left;
		 
	 }
	 public void display(TreeNode head)
	 {
		 TreeNode current=head;
		 TreeNode parent=head;
		 while(current!=null)
		 {
			 System.out.print(current.data+"  ");
			 parent=current;
			 current=current.right;
		 }
		 System.out.println();
		 while(parent!=null)
		 {
			 System.out.print(parent.data+"  ");
			 parent=parent.left;
		 }
		 
	 }
	}