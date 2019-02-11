/*Insert into binary search tree*/

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

class InsertIntoBST{
	public static void main(String[] args) {
		Node n=new Node(10);
		n.left=new Node(5);
		n.right=new Node(15);
		n.left.left=new Node(2);
		n.left.right=new Node(4);
		n.right.left=new Node(14);
		n.right.right=new Node(18);
		Print(n);
		System.out.println();
		Insert(n,3);
		Print(n);
	}	
	public static void Insert(Node n, int x){
		if(n.left==null && n.right==null){
			Node temp=new Node(x);
			if(n.data>x){
				n.left=temp;
			}
			else{
				n.right=temp;
			}
		}
		else if(n.data>x){
			Insert(n.left,x);
		}
		else{
			Insert(n.right,x);
		}
	}
	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.print(n.data+" ");
			Print(n.right);
		}
	}





}