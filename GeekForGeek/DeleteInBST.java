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
		Print(n);

	}
	public static void Delete(Node n,int k){
		if(n.data<k){
			Delete(n.right,k);			
		}
		else if(n.data>k){
			Delete(n.right,k);
		}
		else{
			if(n.left!=null){
				return n.right;
			}
			else if(n.right!=null){
				return n.left;
			}
			n.data=FindMin(n.right);
			n.right=Delete(n.right,n.data);
		}
	}
	public static int FindMin(Node n){
		if(n.left!=null){
			return FindMin(n.left);
		}
		return n.data;
	}


	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.println(n.data+" ");
			Print(n.right);
		}
	}

}