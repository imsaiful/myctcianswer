import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		left=null;
		right=null;
	}
}

class IsBalance{
	static Node root;
	public static void main(String[] args) {
		root=new Node(1);
		root.left=new Node(1);
		root.left.left=new Node(1);
		root.left.right=new Node(1);
		root.right=new Node(1);
		root.right.left=new Node(1);
		root.right.right=new Node(1);
		System.out.println(help(root));
	}
	public static boolean help(Node node){
		if(node==null){
			return true;
		}

		int ls=Height(node.left);
		int rs=Height(node.right);

		if(Math.abs(ls-rs)<=1 && help(node.left) && help(node.right)){
			return true;
		}
		return false;
	}


	public static int Height(Node root){
		if(root==null ){
			return 0;
		}


		return 1+Math.max(Height(root.left),Height(root.right));



	}
}