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

class LeftView{
	static Node root;
	static int max_level;

	public static void main(String[] args) {
		LeftView tree = new LeftView(); 
        tree.root = new Node(12); 
        tree.root.left = new Node(10); 
        tree.root.right = new Node(30); 
        tree.root.right.left = new Node(25); 
        tree.root.right.right = new Node(40); 
        leftView(root,1); 
	}

	public static void leftView(Node n,int level){
		if(n==null){
			return;
		}
		if(level>max_level){
			System.out.println(n.data+" ");
			max_level=level;
		}
		leftView(n.left,level+1);
		leftView(n.right,level+1);
	}
}