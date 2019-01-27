/*Write a function that returns the length of the longest leaf-to-leaf path in a binary tree.
*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}


class Diameter{
	public static void main(String[] args) {
		Node root=new Node(1); 
        root.left = new Node(2); 
        root.left.left = new Node(4);
        root.left.left.left = new Node(-4); 
        root.left.right = new Node(5); 		
        root.left.right.right = new Node(5);
         root.left.right.right.left = new Node(-2);
        System.out.println(help(root));
	}

	public static int help(Node n){
		if(n==null){
			return 0;
		}
		int l=height(n.left);
		int r=height(n.right);
		int ls=help(n.left);
		int rs=help(n.right);
		return Math.max(l+r+1,Math.max(ls,rs));
	}

	public static int height(Node n){
		if(n==null){
			return 0;
		}
		if(n.left==null && n.right==null){
			return 1;
		}
		if(n.left==null && n.right!=null){
			return height(n.right)+1;
		}
		if(n.right==null && n.left!=null){
			return height(n.left)+1;
		}
		return Math.max(height(n.left),height(n.right))+1;
	}
}