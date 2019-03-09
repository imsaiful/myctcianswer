// Given a binary tree. Find out if it is a binary search tree or not.
class Node{
	int val;
	Node left,right;
	Node(int d){
		val=d;
		left=null;
		right=null;
	}
}

class BstOrNot{

	static Node root;
	public static void main(String[] args) {
	
	root=new Node(5);
	root.left=new Node(3);
	root.left.left=new Node(2);
	root.left.right=new Node(4);
	root.right=new Node(8);
	root.right.left=new Node(6);
	root.right.right=new Node(10);
	System.out.println(help(root,18));

	}
	public static int help(Node node,int x){
       if(node!=null){
       	 if(node.val==x){
	       	return 1;
	       }
	       else if(node.val<x){
	       	return help(node.right,x);
	       }
	       else{
	       	return help(node.left,x);
	       }
       }
       return 0;
       
    }
}





	 	