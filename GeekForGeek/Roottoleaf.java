import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}
class Roottoleaf{
	public static void main(String[] args) { 
        Node root = new Node(10); 
        root.left = new Node(8); 
        root.right = new Node(2); 
        root.left.left = new Node(3); 
        root.left.right = new Node(5); 
        root.right.left = new Node(2); 
        System.out.println(help(root,21));
	}
	public static boolean help(Node node,int sum){

		Stack<Node> st=new Stack<Node>();
		st.push(node);

		while(!st.isEmpty()){
			Node top=st.pop();
			
			if(top.left==null && top.right==null){
				if(top.data==sum){
					System.out.println(top.data);
					return true;

				}
			}
			if(top.left!=null){
				top.left.data+=top.data;
				st.push(top.left);
			}
			if(top.right!=null){
				top.right.data+=top.data;
				st.push(top.right);
			}
			
		}
		return false;	
	}
}