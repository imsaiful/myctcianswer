/*LCS In Bst*/

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d=d;
		left=null;
		right=null;
	}
}


class LCSInBST{
	public static void main(String[] args) {
		Node root = new Node(10); 
        root.left = new Node(5); 
        root.right = new Node(30); 
        root.left.left = new Node(1); 
        root.left.right = new Node(8); 
        root.right.left = new Node(20); 
        root.right.right = new Node(40);
        root.right.right.left = new Node(38);
        root.right.right.right = new Node(42);
        System.out.println(help(root,20,42));

        /*
					10
				   /   \
				  5     30
				 / \    /  \
				1  8   20  40
                      /  \  / \
						   38  42

        */ 	
	}
	public static int help(Node n,int x,int y){
		if(n==null){
			return -1;
		}
		if(n.d>x && n.d>y){
			return help(n.left,x,y);
		}
		if(n.d<x && n.d<y){
			return help(n.right,x,y);	
		}

		return n.d;
	}
}