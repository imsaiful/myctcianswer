/* K’th Largest Element in BST when modification to BST is not allowed
Given a Binary Search Tree (BST) and a positive integer k, find the k’th largest element in the Binary Search Tree.
For example, in the following BST, if k = 3, then output should be 14, and if k = 5, then output should be 10.


We have discussed two methods in this post. The method 1 requires O(n) time. The method 2 takes O(h) time where h is height of BST, but requires augmenting the BST (storing count of nodes in left subtree with every node).

Can we find k’th largest element in better than O(n) time and no augmentation? */

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class FindKthLargestInBST{
	static int c=0;
	public static void main(String[] args) {
		Node n=new Node(50);
		n.left=new Node(30);
		n.right=new Node(70);
		n.left.left=new Node(20);
		n.left.right=new Node(40);
		n.right.left=new Node(60);
		n.right.right=new Node(80);
		FindKthLargest(n,4);	
	}
	public static void FindKthLargest(Node n,int k){
		if(n==null || c>=k){
			return;
		}
		FindKthLargest(n.right,k);
		c++;
		if(c==k){
			System.out.println(n.data);
			return;	
		}
		
		FindKthLargest(n.left,k);
	}


}