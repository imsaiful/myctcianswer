/*Check if a binary tree is subtree of another binary tree | Set 1
Given two binary trees, check if the first tree is subtree of the second one. A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T. The subtree corresponding to the root node is the entire tree; the subtree corresponding to any other node is called a proper subtree.

For example, in the following case, tree S is a subtree of tree T.

        Tree 2
          10  
        /    \ 
      4       6
       \
        30


        Tree 1
              26
            /   \
          10     3
        /    \     \
      4       6      3
       \
        30*/

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
class CheckSubTreeOfTree{
	public static void main(String[] args) {
		Node root1 = new Node(26); 
        root1.right = new Node(3); 
        root1.right.right = new Node(3); 
        root1.left = new Node(10); 
        root1.left.left = new Node(4); 
        root1.left.left.right = new Node(30); 
        root1.left.right = new Node(6); 
   
        // TREE 2 
        /* Construct the following tree 
           10 
         /    \ 
         4      6 
          \ 
          30  */
            
        Node root2 = new Node(10); 
        root2.right = new Node(6); 
        root2.left = new Node(14); 
        root2.left.right = new Node(30); 
        System.out.println(FindNode(root1,root2));	
	}
	public static boolean FindNode(Node n1,Node n2){
		if(n2==null){
			return true;
		}
		if(n1==null){
			return false;
		}
		if(isSubTree(n1,n2)){
			return true;
		}
		return FindNode(n1.left,n2) || FindNode(n1.right,n2);
	}
	public static boolean isSubTree(Node n1,Node n2){
		if(n1==null && n2==null){
			return true;
		}
		return (n1.data==n2.data && isSubTree(n1.left,n2.left) && (isSubTree(n1.left,n2.left)));
	}
}