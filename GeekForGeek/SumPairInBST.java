/* First question was to get two numbers fro a BST whose sum was equal to k. I answered it using a preorder traversal to get a sorted array and than starting two index from both ends to find if two elements with sum as k exist or not. He than asked if it can be solved without using an array or extra space.  */

class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class SumPairInBST{
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
		System.out.println(FindSum(19));

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
	public static boolean FindSum(int sum){
		while(head!=prev && head!=null && prev!=null){
			if(head.data+prev.data==sum){
				return true;
			}
			else if(head.data+prev.data<sum){
				head=head.right;
			}
			else{
				prev=prev.left;
			}
		}
		return false;
	}


}