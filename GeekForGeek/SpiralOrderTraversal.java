/*perm_identity
Level order traversal in spiral form
Write a function to print spiral order traversal of a tree. For below tree, function should print 1, 2, 3, 4, 5, 6, 7.
spiral_order*/
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
class SpiralOrderTraversal{
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(7); 
        root.left.right = new Node(6); 
        root.right.left = new Node(5); 
        root.right.right = new Node(4); 
        help(root);
	}
	public static void help(Node n){
		Stack<Node> st1=new Stack<Node>();
		Stack<Node> st2=new Stack<Node>();
		st1.push(n);
		while(!st1.isEmpty() || !st2.isEmpty()){
			while(!st1.isEmpty()){
				Node temp=st1.peek();
				st1.pop();
				System.out.print(temp.data+" ");

				if(temp.right!=null){
					st2.push(temp.right);
				}
				if(temp.left!=null){
					st2.push(temp.left);
				}
				
			}
			while(!st2.isEmpty()){
				Node temp=st2.peek();
				st2.pop();
				System.out.print(temp.data+" ");
				if(temp.left!=null){
					st1.push(temp.left);
				}
				if(temp.right!=null){
					st1.push(temp.right);
				}
			}
		}
	}
}