/*Q2) Maximum triangle path Sum : Starting from the top of a pyramid of numbers like below, you can walk down going one step on the right or on the left, until you reach the bottom row:



One of such walks is 55 -> 94 >- 30 -> 26. You can compute the total of the numbers you have seen in such walk, in this case it’s 205.*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}



class FindMaxFromRootToLeaf{
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		Node n=new Node(55);
		n.left=new Node(94);
		n.right=new Node(46);
		n.left.left=new Node(95);
		n.left.right=new Node(35);
		n.left.left.left=new Node(5);
		n.left.left.right=new Node(155);		
		n.right.left=new Node(146);
		n.right.right=new Node(6);
		System.out.println(help(n));
	}
	public static int help(Node n){
		if(n==null){
			return 0;
		}
		if(n.left!=null){
			n.left.data+=n.data;
			help(n.left);
		}
		if(n.right!=null){
			n.right.data+=n.data;
			help(n.right);
		}
		if(n.left==null && n.right==null){
			System.out.println(n.data+"  ");
			if(n.data>max){
				max=n.data;
			}
		}
		return max;
		



	}




}