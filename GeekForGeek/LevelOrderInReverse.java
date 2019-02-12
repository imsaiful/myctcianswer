/*Reverse Level Order Traversal
*/

import java.util.*;
class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d=d;
		left=null;
		right=null;
	}
}

class LevelOrderInReverse{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		PrintBottomLevel(n);
	}
	public static void PrintBottomLevel(Node n){
		if(n==null){
			return;
		}
		Queue<Node> q=new LinkedList<Node>();
		Stack<Node> st=new Stack<Node>();
		q.add(n);
		while(!q.isEmpty()){
			int size=q.size();
			while(size-->0){
				Node temp=q.poll();
				st.push(temp);
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
			st.push(null);
		}
		while(!st.isEmpty()){
			Node temp=st.peek();
			if(temp!=null){
				System.out.print(temp.d+" ");
				st.pop();
			}
			else{
				System.out.println();
				st.pop();
			}
		}
	}

}