/*Least common ancestor of a binary tree (Solution and Code)*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class LeastCommonAncesstor{
	public static void main(String[] args) {
		Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
		Print(root);		
		Node r=FindAncesstor(root,2,4);
		System.out.println("Ancesstor of 6,7 in above tree is "+r.data);
	}

	public static Node insert(int d,Node n){
		if(n==null){
			return new Node(d);
		}
		if(d<n.data){
			n.left=insert(d,n.left);
		}
		else{
			n.right=insert(d,n.right);
		}
		return n;
	}

	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.print(n.data+"  ");
			Print(n.right);
		}

	}
	public static Node FindAncesstor(Node n,int d1,int d2){
		if(n==null){
			return null;
		}
		if(n.data==d1 || n.data==d2){
			return n;
		}

		Node left=FindAncesstor(n.left,d1,d2);
		Node right=FindAncesstor(n.right,d1,d2);

		if(left!=null && right!=null){
			return n;
		}

		return left!=null?left:right;

	}
}