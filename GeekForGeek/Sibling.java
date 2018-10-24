class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}

class Sibling{
	Node root;


	public static void main(String[] args) {
		Sibling tree = new Sibling(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.right.left = new Node(5); 
        tree.root.right.left.right = new Node(6); 
        tree.printSingles(tree.root); 
	}
	public static void printSingles(Node root){
		if(root==null){
			return;
		}
		if(root.left!=null && root.right!=null){
			printSingles(root.left);
			printSingles(root.right);
		}
		else if(root.left!=null){
			System.out.println(root.left.data);
			printSingles(root.left);
		}

		else if(root.right!=null){
			System.out.println(root.right.data);
			printSingles(root.right);
		}




	}

}