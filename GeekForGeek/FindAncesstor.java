/*Lowest Common Ancestor in a Binary Tree | Set 1
Given a binary tree (not a binary search tree) and two values say n1 and n2, write a program to find the least common ancestor.
Following is definition of LCA from Wikipedia:
Let T be a rooted tree. The lowest common ancestor between two nodes n1 and n2 is defined as the lowest node in T that has both n1 and n2 as descendants (where we allow a node to be a descendant of itself).

The LCA of n1 and n2 in T is the shared ancestor of n1 and n2 that is located farthest from the root. Computation of lowest common ancestors may be useful, for instance, as part of a procedure for determining the distance between pairs of nodes in a tree: the distance from n1 to n2 can be computed as the distance from the root to n1, plus the distance from the root to n2, minus twice the distance from the root to their lowest common ancestor. (Source Wiki)

lca

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.


We have discussed an efficient solution to find LCA in Binary Search Tree. In Binary Search Tree, using BST properties, we can find LCA in O(h) time where h is height of tree. Such an implementation is not possible in Binary Tree as keys Binary Tree nodes don’t follow any order. Following are different approaches to find LCA in Binary Tree.

Method 1 (By Storing root to n1 and root to n2 paths):
Following is simple O(n) algorithm to find LCA of n1 and n2.
1) Find path from root to n1 and store it in a vector or array.
2) Find path from root to n2 and store it in another vector or array.
3) Traverse both paths till the values in arrays are same. Return the common element just before the mismatch.

Following is the implementation of above algorithm.*/
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


class FindAncesstor{
	static Node root;
	static ArrayList<Integer> p1=new ArrayList<Integer>();
	static ArrayList<Integer> p2=new ArrayList<Integer>();
	public static void main(String[] args) {
		root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        System.out.println(help(4,5));
	}
	public static int help(int n1,int n2){
		p1.clear();
		p2.clear();
		return FindLCA(root,n1,n2);
	}
	public static int FindLCA(Node root,int n1,int n2){
		boolean r1=findPath(root,n1,p1);
		boolean r2=findPath(root,n2,p2);
		if(r1 && r1){
			int i;
			for(i=0;i<p1.size() && i<p2.size();i++){
				if(p1.get(i)!=p2.get(i)){
					break;
				}
			}
			return p1.get(i-1);
		}
		return -1;



	}
	public static boolean findPath(Node root, int n, ArrayList<Integer> p){
		if(root==null){
			return false;
		}
		p.add(root.data);
		if(root.data==n){
			return true;
		}
		if(root.left!=null && findPath(root.left,n,p)){
			return true;
		}
		if(root.right!=null && findPath(root.right,n,p)){
			return true;
		}
		p.remove(p.size()-1);
		return false;



	}
}