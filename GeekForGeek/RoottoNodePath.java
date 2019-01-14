import java.util.*;
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}


}

class RoottoNodePath{
	static ArrayList<Integer> ar=new ArrayList<Integer>();
	public static void main(String[] args) {
		Node root=new Node(1); 
        root.left = new Node(2);  
        root.right = new Node(3);  
        root.left.left = new Node(4);  
        root.left.right = new Node(5);  
        root.right.left = new Node(6);  
        root.right.right = new Node(7);  
        int x=5; 
        printPath(root, x); 
	}
	public static void printPath(Node root,int x){
		if(hasPath(root,x,ar)){
			for(int i=0;i<ar.size();i++){
				System.out.print(ar.get(i));
			}
		}
		else{
				System.out.println("No path exist");
			}
	}

	public static boolean hasPath(Node root,int x,ArrayList<Integer> ar){
		if(root==null){
			return false;
		}
		ar.add(root.data);
		if(root.data==x){
			return true;
		}

		if(hasPath(root.left,x,ar) || hasPath(root.right,x,ar)){
			return true;
		}

		ar.remove(ar.size()-1);
		return false;



	}
	
}