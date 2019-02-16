/*Vertical Sum in a given Binary Tree | Set 1
Given a Binary Tree, find vertical sum of the nodes that are in same vertical line. Print all sums through different vertical lines.
Examples:

      1
    /   \
  2      3
 / \    / \
4   5  6   7
The tree has 5 vertical lines



Vertical-Line-1 has only one node 4 => vertical sum is 4
Vertical-Line-2: has only one node 2=> vertical sum is 2
Vertical-Line-3: has three nodes: 1,5,6 => vertical sum is 1+5+6 = 12
Vertical-Line-4: has only one node 3 => vertical sum is 3
Vertical-Line-5: has only one node 7 => vertical sum is 7

So expected output is 4, 2, 12, 3 and 7
*/
import java.util.*;
class Node{
	int d;
	Node left;
	Node right;
	Node(int d){
		this.d=d;
		right=null;
		left=null;
	}
}
class VerticalSum{
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
		n.right.left=new Node(6);
		n.right.right=new Node(7); 
		TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
		help(n,0,tm);
		for(Map.Entry<Integer,Integer> entry : tm.entrySet()) {
			System.out.print(entry.getValue()+"  ");
		}
	}
	public static void help(Node n,int l,TreeMap<Integer,Integer> tm){
		if(n==null){
			return;
		}
		if(tm.containsKey(l)){
			tm.put(l,tm.get(l)+n.d);
		}
		else{
			tm.put(l,n.d);	
		}
		help(n.left,l-1,tm);
		help(n.right,l+1,tm);
	}
}