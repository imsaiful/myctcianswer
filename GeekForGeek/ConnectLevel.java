/*given a binary tree. connect all the node at the same level. each node would have left,right and nextSibling pointers. we need to fill nextSibling.
solved with level order traversal . Similar to BFS on tree with queue. Only approach was needed, no code for this one.*/
import java.util.*;
class Node{
	int data;
	Node left,right,next;
	Node(int d){
		data=d;
		left=right=next=null;
	}

}

class ConnectLevel{
	public static void main(String[] args) {
			Node n=new Node(1);
			n.left=new Node(2);
			n.right=new Node(3);
			n.left.left=new Node(4);
			n.left.right=new Node(5);
			n.right.left=new Node(6);
			n.right.right=new Node(7);
			Print(help(n));

	}
	public static Node help(Node n){
		if(n==null){
			return null;
		}
		Node last=null;
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		while(!q.isEmpty()){
			int size=q.size();
			//System.out.println(size);
			Node prev=null;
			while(size-->0){
				Node temp=q.poll();
				if(prev==null){
					prev=temp;
				}
				else{
					prev.next=temp;
					prev=temp;
				}
				if(temp.left!=null){
					q.add(temp.left);
				}
				else if(temp.left==null && last==null){
					last=temp;
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
		}
		return last;
	}
	public static void Print(Node n){
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
}