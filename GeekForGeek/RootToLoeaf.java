/* Root To Leaf path */
import java.util.*;
class Node{
	int left;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class RootToLoeafPathWithSum{
	static ArrayList<Integer> al=new ArrayList<Integer>();
	public static void main(String[] args) {
		Node root=new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 	
        root.left.right.left = new Node(5); 	
        root.left.right.right = new Node(5);
        if(help(root,9,al)){
        	System.out.println(al);	
        }
        else{
        	System.out.println("No Path exist");	
        }
	}
	public static boolean help(Node node,int sum,ArrayList<Integer> al){
		if(node==null){
			return false;
		}
		if(node.left==null && node.right==null){
			if(node.data==sum){
				al.add(node);
				return true;
			}
		}

		if(help(root.left,sum-node.data,al)){
			al.add(node);
			return true;
		}
		if(help(root.right,sum-node.data,al)){
			al.add(node);
			return true;
		}
		return false;
	}
}