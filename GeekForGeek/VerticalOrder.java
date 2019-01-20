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
class VerticalOrder{
	static Node root;
	static TreeMap<Integer,ArrayList<Integer>> tm=new TreeMap<Integer,ArrayList<Integer>>(); 
	public static void main(String[] args) {
		root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 
        root.right.left.right = new Node(8); 
        root.right.right.right = new Node(9); 	
        help(root,0);
        Print();
	}

	public static void help(Node node, int hd){
		if(node==null){
			return;
		}

		if(tm.containsKey(hd)){
			ArrayList<Integer> al=tm.get(hd);
			al.add(node.data);
			tm.put(hd,al);
		}
		else{
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(node.data);
			tm.put(hd,al);
		}
		help(node.left,hd-1);
		help(node.right,hd+1);
	}
	public static void Print(){
		for(Map.Entry m:tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
       		    
      	}    
	}


}