/*Create Balanced binary search tree from sorted array*/

class Node{
	int d;
	Node left;
	Node right;
	Node(int d){
		this.d=d;
		left=null;
		right=null;
	}
}
class CreateBalanceBST{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		Node root=CreateBST(a,0,a.length-1);
		Print(root);	
	}
	public static Node CreateBST(int[] a,int low,int high){
		if(low>high){
			return null;
		}
		int mid=low+(high-low)/2;
		Node n=new Node(a[mid]);
		n.left=CreateBST(a,low,mid-1);
		n.right=CreateBST(a,mid+1,high);
		return n;
	}

	public static void Print(Node n){
		if(n!=null){
			System.out.print(n.d+" ");
			Print(n.left);
			Print(n.right);
		}
	}
}