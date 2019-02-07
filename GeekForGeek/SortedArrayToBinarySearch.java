/*Convert a sorted array to binary search tree.*/

class Node{
	int data;
	Node left=null,right=null;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}


}

class SortedArrayToBinarySearch{
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=a.length-1;
		Node head=help(a,start,end);
		Print(head);
		System.out.println();
		Print(head);
	}
	public static Node help(int[] a,int s,int e){
		if(s>e){
			return null;
		}
		int mid=s+(e-s)/2;
		Node temp=new Node(a[mid]);
		temp.left=help(a,s,mid-1);
		temp.right=help(a,mid+1,e);
		return temp;
	}
	public static void Print(Node head){
		if(head!=null){
			Print(head.left);
			System.out.print(head.data+"  ");
			Print(head.right);
		}
		
	}
}