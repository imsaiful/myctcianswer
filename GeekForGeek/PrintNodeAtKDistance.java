/*perm_identity Print all nodes that are at distance k from a leaf node*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class PrintNodeAtKDistance{
	public static void main(String[] args) {
		Node n=new Node(1);

		n.left=new Node(2);
		n.right=new Node(12);
		n.left=new Node(22);
		n.right=new Node(32);

		n.left.left=new Node(3);
		n.right.left=new Node(13);
		n.left.right=new Node(23);
		n.right.right=new Node(33);

		n.left.left.right=new Node(4);
		n.right.left.right=new Node(14);
		n.right.left.left=new Node(34);
		n.left.left.left=new Node(44);
		n.right.right.right=new Node(55);

		help(n,2);

	}

	public static void help(Node n,int k){
		if(n==null){
			return;
		}
		if(k==0){
			System.out.print(n.data+" ");
		}
		help(n.left,k-1);
		help(n.right,k-1);
	}
}