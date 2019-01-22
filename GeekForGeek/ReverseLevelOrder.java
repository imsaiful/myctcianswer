/*Reverse Level Order Traversal
We have discussed level order traversal of a post in previous post. The idea is to print last level first, then second last level, and so on. Like Level order traversal, every level is printed from left to right.
The method 2 of normal level order traversal can also be easily modified to print level order traversal in reverse order. The idea is to use a stack to get the reverse level order. If we do normal level order traversal and instead of printing a node, push the node to a stack and then print contents of stack, we get “5 4 3 2 1” for above example tree, but output should be “4 5 2 3 1”. So to get the correct sequence (left to right at every level), we process children of a node in reverse order, we first push the right subtree to stack, then left subtree.*/
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

class ReverseLevelOrder{
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
		Stack<Integer> st=new Stack<Integer>();
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		while(!q.isEmpty()){
			int size=q.size();
			while(size-->0){
				Node temp=q.poll();
				st.push(temp.data);
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
			st.push(-1);
		}
		while(!st.isEmpty()){
			if(st.peek()!=-1){
				System.out.print(st.peek()+" ");
			}
			else{
				System.out.println();	
			}
			st.pop();
		}



	}
}