/*Boundary Traversal of binary tree
Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise starting from the root. For example, boundary traversal of the following tree is “20 8 4 10 14 25 22”


Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.


We break the problem in 3 parts:
1. Print the left boundary in top-down manner.
2. Print all leaf nodes from left to right, which can again be sub-divided into two sub-parts:
…..2.1 Print all leaf nodes of left sub-tree from left to right.
…..2.2 Print all leaf nodes of right subtree from left to right.
3. Print the right boundary in bottom-up manner.

We need to take care of one thing that nodes are not printed again. e.g. The left most node is also the leaf node of the tree.

Based on the above cases, below is the implementation:*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}


class BoundyValue{
	public static void main(String[] args) {
		Node node = new Node(20); 
        node.left = new Node(8); 
        node.left.left = new Node(4); 
        node.left.right = new Node(12); 
        node.left.right.left = new Node(10); 
        node.left.right.right = new Node(14); 
        node.right = new Node(22); 
        node.right.right = new Node(25);
        PrintNBoundry(node); 
	}
	public static void PrintNBoundry(Node n){
		PrintLeft(n);
		PrintLeaf(n);
		PrintRight(n.right);
	}

	public static void PrintLeft(Node n){
		//System.out.print("Print LEft == "+n.data+"  ");
		if(n!=null){
			if(n.left!=null){
				System.out.print(n.data+"  ");
				PrintLeft(n.left);	
			}
			else if(n.right!=null){
				System.out.print(n.data+"  ");
				PrintLeft(n.right);	
			}
		}
	}
	public static void PrintRight(Node n){
		//System.out.print("Print Right  ");
		if(n!=null){
			if((n.right)!=null){
				PrintLeft(n.right);	
				System.out.print(n.data+"  ");
				
			}
			else if(n.left!=null){
				PrintLeft(n.left);	
				System.out.print(n.data+"  ");
			}
		}
	}

	public static void PrintLeaf(Node n){
		//System.out.print("Print leaf  ");
		if(n!=null){
			PrintLeaf(n.left);
			if(n.left==null && n.right==null){
				System.out.print(n.data+"  ");
			}
			PrintLeaf(n.right);
		}
	}





















}