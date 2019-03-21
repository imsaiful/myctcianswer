/* Algorithm for Level order traversal of BST without using Queue Data structure.*/
import java.util.*;
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
class LevelOrderWithoutQueue{
	static int maxLevel=-1;
	public static void main(String[] args){
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.right=new Node(6);
		TreeMap<Integer,ArrayList<Integer>> tm=new TreeMap<Integer,ArrayList<Integer>>();
		help(n,0,tm);
		for(Map.Entry<Integer,ArrayList<Integer>> entry : tm.entrySet()) {
 			System.out.println(entry.getValue());
		}

	}
	public static void help(Node n,int level,TreeMap<Integer,ArrayList<Integer>> tm){
		if(n==null){
			return;
		}
		if(tm.containsKey(level)){
			ArrayList<Integer> al=tm.get(level);
			al.add(n.d);
			tm.put(level,al);
		}
		else{
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(n.d);
			tm.put(level,al);
		}
		if(n.left!=null){
			help(n.left,level+1,tm);
		}

		if(n.right!=null){
			help(n.right,level+1,tm);
		}
	}


    
}