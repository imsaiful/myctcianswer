/*Q3) Maximum difference between node and its ancestor in Binary Tree. https://www.geeksforgeeks.org/maximum-difference-between-node-and-its-ancestor-in-binary-tree/*/
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

class MaxDiffInNode{
	public static void main(String[] args) {
		Node root = new Node(8); 
        root.left = new Node(3); 
        root.left.left = new Node(1); 
        root.left.right = new Node(6); 
        root.left.right.left = new Node(4); 
        root.left.right.right = new Node(7); 
        root.right = new Node(10); 
        root.right.right = new Node(14); 
        root.right.right.left = new Node(13);
        System.out.println(help(root,0,0));
	}
	public static int help(Node root,int maxDiff,int maxDiffSoFar){
		if(root==null){
			return maxDiff;
		}
		maxDiff=Math.max(maxDiff,maxDiffSoFar-root.d);
		maxDiffSoFar=Math.max(maxDiffSoFar,root.d);
		return Math.max(help(root.left,maxDiff,maxDiffSoFar),help(root.right,maxDiff,maxDiffSoFar));
	}
}