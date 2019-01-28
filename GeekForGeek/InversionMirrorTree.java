/*Third was that for a given BST invert the signs of the elements and finally have a new BST. It clicked my mind that after sign inversion it will be a mirror tree and gave the solution for the same.*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class InversionMirrorTree{
		static Node prev=null;
		static Node head;
		public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7);
		Print(n);	
		System.out.println();
		ConvertToInvertMirror(n);
		Print(n);
		
	}
	
	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.print(n.data+" ");
			Print(n.right);
		}
	}

	public static Node ConvertToInvertMirror(Node n){
		if(n==null){
			return null;
		}
		Node left=ConvertToInvertMirror(n.left);
		Node right=ConvertToInvertMirror(n.right);
		n.left=right;
		n.right=left;
		n.data=-n.data;
		return n;
	}	
	
}