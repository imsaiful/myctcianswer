/*Find a pair with given sum in a Balanced BST
Given a Balanced Binary Search Tree and a target sum, write a function that returns true if there is a pair with sum equals to target sum, otherwise return false. Expected time complexity is O(n) and only O(Logn) extra space can be used. Any modification to Binary Search Tree is not allowed. Note that height of a Balanced BST is always O(Logn).

*/
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


class FindSumNodeInBst{
	public static void main(String[] args) {
		Node root=null;
		int[] keys={1,2,3,4,5,6,7};
		for(int key:keys){
			root=insert(root,key);
		}
		Node x=FindMin(root);
		Node y=FindMax(root);
		System.out.println(x.d+"  "+y.d);
		Print(root);

		if(!FindPair(root,root,x,y,7)){
			System.out.println("Pair does not exist");
		}

	}
	public static Node insert(Node n,int x){
		if(n==null){
			return new Node(x);
		}

		if(x<n.d){
			n.left=insert(n.left,x);
		}
		else{
			n.right=insert(n.right,x);
		} 
		return n;
	}
	public static void Print(Node n){
		if(n!=null){
			Print(n.left);
			System.out.print(n.d+"  ");
			Print(n.right);
		}
	}

	public static Node FindMin(Node n){
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}

	public static Node FindMax(Node n){
		while(n.right!=null){
			n=n.right;
		}
		return n;
	}

	public static boolean FindPair(Node X,Node Y,Node x,Node y,int sum){
		if(X==null || Y==null){
			return false;
		}

		if(x.d+y.d<sum){
			if(FindPair(X.left,Y,x,y,sum)){
				return true;
			}
			x=X;
			if(x.d+y.d==sum){
				System.out.println("Pair Found=("+x.d+","+y.d+")");
				return true;
			}
			return FindPair(X.right,Y,x,y,sum);
		}
		else{
			if(FindPair(X,Y.right,x,y,sum)){
				return true;
			}
			y=Y;
			if(x.d+y.d==sum){
				System.out.println("Pair Found=("+x.d+","+y.d+")");
				return true;
			}
			return FindPair(X,Y.left,x,y,sum);
		}
	}
}