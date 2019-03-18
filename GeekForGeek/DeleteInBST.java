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
	static Node n;
	public static void main(String[] args) {
		n=new Node(10);
		n=new Node(10);
		n.left=new Node(5);
		n.right=new Node(15);
		n.left.left=new Node(1);			
		n.left.right=new Node(8);
		n.right.right=new Node(20);
		n.right.left=new Node(12);
		Print(n);
		System.out.println();
		DeleteKey(n,30);
		Print(n);

	}

	public static void DeleteKey(Node n,int k){
		n=Delete(n,k);
	}
	public static Node Delete(Node n,int k){
		if(n==null){
			return null;
		}
		if(n.data<k){
			n.right=Delete(n.right,k);			
		}
		else if(n.data>k){
			n.left=Delete(n.left,k);
		}
		else{
			if(n.left==null){
				return n.right;
			}
			else if(n.right==null){
				return n.left;
			}
			n.data=FindMin(n.right);
			n.right=Delete(n.right,n.data);
		}
		return n;
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
			System.out.print(n.data+" ");
			Print(n.right);
		}

	}

}