/*
Print Right View of a Binary Tree
Given a Binary Tree, print Right view of it. Right view of a Binary Tree is set of nodes visible when tree is visited from Right side.
Right view of following tree is 1 3 7 8

          1
       /     \
     2        3
   /   \     /  \
  4     5   6    7
                  \
                   8
*/

import java.util.*;
class Node{
	int data;
	Node left=null;
	Node right=null;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
class PrintRightView{
	public static void main(String[] args) {
		
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        PrintRight(root);	
	}

	public static void PrintRight(Node root){
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		boolean flag=true;
		while(!q.isEmpty()){
			int n=q.size();
			while(n-->0){
				Node temp=q.poll();
				if(flag){
					System.out.print(temp.data+" ");
					flag=false;
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
				if(temp.left!=null){
					q.add(temp.left);
				}
			}
			flag=true;
		}
	}


}