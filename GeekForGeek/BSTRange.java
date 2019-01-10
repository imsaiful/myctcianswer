class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}

class BSTRange{
	static Node root;
	public static void main(String[] args) {
		BSTRange tree=new BSTRange();
		tree.root = new Node(20); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(22); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(12); 
        Print(root,10,20);
	}
	public static void Print(Node n,int a,int b){
		if(n==null){
			return;
		}
		if(a<n.data){
			Print(n.left,a,b);
		}
		if(n.data>=a && n.data<=b){
			System.out.println(n.data);
		}
		if(n.data<b){
			Print(n.right,a,b);
		}
	}
}

