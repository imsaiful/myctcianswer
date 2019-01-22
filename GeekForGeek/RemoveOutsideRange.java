/*perm_identity
Remove BST keys outside the given range
Given a Binary Search Tree (BST) and a range [min, max], remove all keys which are outside the given range. The modified tree should also be BST. For example, consider the following BST and range [-10, 13]. 
BinaryTree1

The given tree should be changed to following. Note that all keys outside the range [-10, 13] are removed and modified tree is BST.
*/

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

class RemoveOutsideRange{
	
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.right = new Node(10); 
        root.left = new Node(-10); 
        root.left.left = new Node(-27); 
        root.left.right = new Node(-5); 
        root.right.left = new Node(5); 
        root.right.right = new Node(40);
        Print(root);
        System.out.println();
        Node result=Remove(root,1,10);
        Print(result);
	}

	public static Node Remove(Node root,int min,int max){
		if(root==null){
			return null;
		}
		if(root.data<min){
			return Remove(root.right,min,max);
		}
		if(root.data>max){
			return Remove(root.left,min,max);
		}

		root.left=Remove(root.left,min,max);
		root.right=Remove(root.right,min,max);
		//System.out.println(root.data);
		return root;
	}

	public static void Print(Node root){
		if(root!=null){
			Print(root.left);
			System.out.print(root.data+"  ");
			Print(root.right);
		}
	}
}
