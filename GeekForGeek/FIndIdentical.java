import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}

class FIndIdentical{
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.right = new Node(2); 
        root.left = new Node(3); 
        root.left.left = new Node(7); 
        root.left.right = new Node(6); 
        root.right.left = new Node(5); 
        root.right.right = new Node(4); 
        Node root1 = new Node(1); 
        root1.left = new Node(2); 
        root1.right = new Node(3); 
        root1.left.right = new Node(7); 
        root1.left.left = new Node(6); 
        root1.right.right = new Node(5); 
        root1.right.left = new Node(4); 
        System.out.println(help(root));
	}
	public static void help(Node n){
		



	}
}