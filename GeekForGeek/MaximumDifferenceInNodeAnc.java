/*Maximum difference between node and its ancestor in Binary Tree*/
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


class MaximumDifferenceInNodeAnc{
	public static void main(String[] args) {
		Node n=new Node(8);
		n.left = new Node(3); 
        n.left.left = new Node(1); 
        n.left.right = new Node(6); 
        n.left.right.left = new Node(4); 
        n.left.right.right = new Node(7); 
        n.right = new Node(10); 
        n.right.right = new Node(14); 
        n.right.right.left = new Node(13);		
        System.out.println(help(n,Integer.MIN_VALUE));
	}
	public static int help(Node n,int result){
		if(n==null){
			return Integer.MAX_VALUE;
		}
		if(n.left==null && n.right==null){
			return n.d;
		}
		int val=Math.min(help(n.left,result),help(n.right,result));

		result=Math.max(result,n.d-val);

		return Math.min(result,n.d);


	}
}