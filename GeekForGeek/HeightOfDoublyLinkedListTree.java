/*Minimum time required to rot all oranges
Given a matrix of dimension m*n where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
0: Empty cell

1: Cells have fresh oranges

2: Cells have rotten oranges 
So we have to determine what is the minimum time required so that all the oranges become rotten. A rotten orange at index [i,j] can rot other fresh orange at indexes [i-1,j], [i+1,j], [i,j-1], [i,j+1] (up, down, left and right). If it is impossible to rot every orange then simply return -1.*/


class Node {  
      int data;  
      Node left, right;  
      // Constructor to create a new tree node  
      Node(int key)  
      {  
           data = key;  
           left = right = null;  
      }  
}  


class HeightOfDoublyLinkedListTree{
	public static void main(String[] args) {
			Node root = new Node(1); 
            root.left = new Node(2); 
            root.right = new Node(3); 
            root.left.left = new Node(4); 
            root.left.right = new Node(5); 
            root.left.left.left = new Node(6); 
            Node L1 = root.left.left.left; 
            Node L2 = root.left.right; 
            Node L3 = root.right; 
            L1.right = L2; L2.right = L3; L3.right = L1;
            L3.left = L2; L2.left = L1; L1.left = L3; 
            System.out.println("Height of tree is " + maxDepth(root)); 
		}

	public static int maxDepth(Node root){
		if(root==null){
			return 0;
		}

		if(isLeaf(root)){
			return 1;
		}
		return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	}

	public static boolean isLeaf(Node n){
		return n.right!=null && n.right.left==n && n.left!=null && n.left.right==n;
	}
}