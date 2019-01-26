/*Write a program to print all permutations of a given string
A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.
Source: Mathword(http://mathworld.wolfram.com/Permutation.html)

Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB*/

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class MinHeightOfTree{
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        System.out.println(help(root));
	}


	public static int help(Node node){
		if(node==null){
			return 0;
		}
		if(node.left==null && node.right==null){
			return 1;
		}
		if(node.left==null){
			return help(node.right)+1;
		}
		if(node.right==null){
			return help(node.left)+1;
		}
		return Math.min(help(node.left),help(node.right))+1;
	}
}
