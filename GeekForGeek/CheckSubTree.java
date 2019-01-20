/*Given two binary trees, check if the first tree is subtree of the second one. A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T. The subtree corresponding to the root node is the entire tree; the subtree corresponding to any other node is called a proper subtree.*/
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

class CheckSubTree{

	
	static Node root1,root2;
	public static void main(String[] args) {
		root1 = new Node(26); 
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
            
        root2 = new Node(10); 
        root2.right = new Node(6); 
        root2.left = new Node(4); 
        root2.left.right = new Node(30); 
        System.out.println(help(root1,root2));
	}

	public static boolean help(Node n1,Node n2){
		if(n2==null){
			return true;
		}

		if(n1==null){
			return false;
		}

		if(isIdentical(n1,n2)){
			return true;
		}

		return help(n1.left,n2) || help(n1.right,n2);
	}

	public static boolean isIdentical(Node n1,Node n2){
		if(n1==null && n2==null){
			return true;
		}

		if(n1!=null && n2!=null){

			return (n1.data==n2.data) && isIdentical(n1.left,n2.left) && isIdentical(n1.right,n2.right);
		}

		return false;
	} 
}