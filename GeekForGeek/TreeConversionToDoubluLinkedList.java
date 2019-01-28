/* Convert the binary tree to doubly linked list */

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class TreeConversionToDoubluLinkedList{
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
		Convert(n);
		Print(head);	
	}
	
	public static void Convert(Node n){
		if(n==null){
			return;
		}
		Convert(n.left);

		if(prev==null){
			head=n;
		}
		else{
			n.left=prev;
			prev.right=n;
		}
		prev=n;
		Convert(n.right);
	}
	

	public static void Print(Node n){
		while(n!=null){
			System.out.println(n.data);
			n=n.right;

		}
	}


}