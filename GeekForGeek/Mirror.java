/*Convert a Binary Tree into its Mirror Tree
Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged.

MirrorTree1
Trees in the above figure are mirror of each other*/
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}


}

class Mirror{
	public static void main(String[] args) {
		Node root=new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        Print(root);
        MirrorImage(root);
        System.out.println();
        Print(root);

	}
	public static void Print(Node n){
		if(n==null){
			return;
		}
		Print(n.left);
		System.out.print(n.data+"  ");
		Print(n.right);
	}
	public static void MirrorImage(Node node){
		if(node!=null){
			MirrorImage(node.left);
			MirrorImage(node.right);
			Node temp=node.left;
			node.left=node.right;
			node.right=temp;
		}
		return;
	}



}