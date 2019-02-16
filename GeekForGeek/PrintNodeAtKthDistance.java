/*1. Print nodes at K distance in BT*/


import java.util.*;

class Node{
	int d;
	Node left;
	Node right;
	Node(int d){
		this.d=d;
		left=null;
		right=null;
	}
}


class PrintNodeAtKthDistance{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7); 		
		help(n,4);
	}

	public static void help(Node cur,int k){
		int flag=0;
		Queue<Node> q=new LinkedList<Node>();
		q.add(cur);
		while(!q.isEmpty()){
			int n=q.size();
			flag++;
			while(n-->0){
				Node temp=q.poll();
				if(flag==k){
					System.out.print(temp.d+" ");
				}
				else{
					if(temp.left!=null){
						q.add(temp.left);
					}
					if(temp.right!=null){
						q.add(temp.right);
					}
				}
			}
		}
	}



}