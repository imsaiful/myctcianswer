/* Root To Leaf path */
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}

class RootToLoeafPathWithSum{
	static ArrayList<Node> al=new ArrayList<Node>();
	public static void main(String[] args) {
		Node root=new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 	
        root.left.right.left = new Node(5); 	
        root.left.right.right = new Node(5);
        if(help(root,13,al)){
        	for(int i=0;i<al.size();i++){
        		System.out.print(al.get(i).data+"  ");
        	}
        }
        else{
        	System.out.println("No Path exist");	
        }
	}
	public static boolean help(Node node,int sum,ArrayList<Node> al){

		if(node==null){
			return false;
		}
		if(node.left==null && node.right==null){
			
			if(node.data==sum){
				al.add(node);
				return true;
			}
			else{
				return false;
			}
		}

		if(help(node.left,sum-node.data,al)){
			al.add(node);
			return true;
		}
		if(help(node.right,sum-node.data,al)){
			al.add(node);
			return true;
		}
		return false;
	}
}