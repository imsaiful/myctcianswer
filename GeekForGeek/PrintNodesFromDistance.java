/*Print all nodes at distance k from a given node
Given a binary tree, a target node in the binary tree, and an integer value k, print all the nodes that are at distance k from the given target node. No parent pointers are available.
BinaryTree

Consider the tree shown in diagram

Input: target = pointer to node with data 8.
root = pointer to node with data 20.
k = 2.
Output : 10 14 22

If target is 14 and k is 3, then output
should be “4 20”

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.


There are two types of nodes to be considered.
1) Nodes in the subtree rooted with target node. For example if the target node is 8 and k is 2, then such nodes are 10 and 14.
2) Other nodes, may be an ancestor of target, or a node in some other subtree. For target node 8 and k is 2, the node 22 comes in this category.

Finding the first type of nodes is easy to implement. Just traverse subtrees rooted with the target node and decrement k in recursive call. When the k becomes 0, print the node currently being traversed (See this for more details). Here we call the function as printkdistanceNodeDown().*/

 class Node{
 	int data;
 	Node left,right;
 	Node(int d){
 		data=d;
 	}
}


class PrintNodesFromDistance{
	public static void main(String[] args) {
		Node root = new Node(20); 
        root.left = new Node(8); 
        root.right = new Node(22); 
        root.left.left = new Node(4); 
        root.left.right = new Node(12); 
        root.left.right.left = new Node(10); 
        root.left.right.right = new Node(14); 
        //Node target = tree.root.left.right; 
        printkdistanceNode(root,2);
	}

	public static void printkdistanceNode(Node node,int k){
		if(node==null){
			return;
		}
		if(k==0){
			System.out.print(node.data+" ");
		}
		printkdistanceNode(node.left,k-1);
		printkdistanceNode(node.right,k-1);


	} 
}