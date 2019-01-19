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
	System.out.println(help(root,Integer.MIN_VALUE+1,Integer.MAX_VALUE-1));

	}
	public static boolean help(Node node,int min,int max){
       if(node==null){
       	return true;
       }
       if(node.val<=min || node.val>max){
       	return true;
       }
       return help(node.left,Integer.MIN_VALUE,node.val) && help(node.right,node.val,max);
    }
}





	 	