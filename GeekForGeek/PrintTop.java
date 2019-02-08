/*Print Nodes in Top View of Binary Tree
Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. Given a binary tree, print the top view of it. The output nodes can be printed in any order. Expected time complexity is O(n)

A node x is there in output if x is the topmost node at its horizontal distance. Horizontal distance of left child of a node x is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1.

       1
    /     \
   2       3
  /  \    / \
 4    5  6   7
Top view of the above binary tree is
4 2 1 3 7
*/
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int d){
	data=d;
	left=null;
	right=null;
	}
}

class PrintTop{
	static HashSet<Integer> hs=new HashSet<Integer>();
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.right = new Node(4); 
        root.left.right.right = new Node(5); 
        root.left.right.right.right = new Node(6); 
        PrintTopView(root,0);
	}
	public static void PrintTopView(Node n,int x){
		if(n!=null){
			if(!hs.contains(x)){
				System.out.print(n.data);
				hs.add(x);
			}
			if(n.left!=null){
				PrintTopView(n.left,x-1);
			}
			if(n.right!=null){
				PrintTopView(n.right,x+1);	
			}
		}
	}
}