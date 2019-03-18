/*Binary Search Tree*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
class DeleteInBST{
	public static void main(String[] args) {
		Node n=new Node(10);
		n=new Node(10);
		n.left=new Node(5);
		n.right=new Node(15);
		n.left.left=new Node(1);			
		n.left.right=new Node(8);
		n.right.right=new Node(20);
		n.right.left=new Node(12);
		Print(n);
		Delete(n,15);

	}
	public static void Delete(Node n,int k){





	}
	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.println(n.data+" ");
			Print(n.right);
		}
	}

}