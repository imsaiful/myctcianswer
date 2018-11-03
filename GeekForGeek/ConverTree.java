import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data=d;
	}
}
class ConverTree{
	public static void main(String[] args) {
		Node root=new Node(8);
		root.left = new Node(3);
		root.right = new Node(5);
		root.left.left = new Node(10);
		root.left.right = new Node(2);
		root.right.left = new Node(4);
		root.right.right = new Node(6);
		print(root);
		Set<Integer> hs = new TreeSet<>();
		constructHS(root,hs);	
		Iterator<Integer> itr=hs.iterator();
		Conversion(root,itr);
		print(root);
	}
	public static void constructHS(Node root,Set<Integer> hs){
		if(root==null){
			return;
		}
		constructHS(root.left,hs);
		hs.add(root.data);		
		constructHS(root.right,hs);
	}
	public static void Conversion(Node root,Iterator<Integer> itr){
		if(root==null){
			return;
		}
		Conversion(root.left,itr);
		root.data=itr.next();
		Conversion(root.right,itr);
	}
	public static void print(Node root){
		if(root==null){
			return;
		}
		print(root.left);
		System.out.println(root.data+"  ");
		print(root.right);
	}
}