/*Bottom View of Binary Tree Submissions: 15003   Accuracy: 45.32%   Difficulty: Medium   Marks: 4
Associated Course(s):   Sudo Placement [IITs]
                  
Given a binary tree, print the bottom view from left to right. A node x is there in output if x is the bottommost node at its horizontal distance from root. Horizontal distance of left child of a node x is equal to horizontal distance of x minus 1, and that of right child is horizontal distance of x plus 1.

Examples:

                      20
                    /    \
                  8       22
                /   \        \
              5      3       25
                    /   \      
                  10    14

For the above tree the output should be 5, 10, 3, 14, 25.

If there are multiple bottom-most nodes for a horizontal distance from root, then print the later one in level traversal. For example, in the below diagram, 3 and 4 are both the bottommost nodes at horizontal distance 0, we need to print 4.

                      20
                    /    \
                  8       22
                /   \     /   \
              5      3 4     25
                     /    \      
                 10       14

For the above tree the output should be 5, 10, 4, 14, 25.*/

import java.util.*;

class Node{
	int d;
	Node left,right;
	Node(int d){
		this.d=d;
		left=null;
		right=null;
	}
}


class VerticalOrderOfTree{
	public static void main(String[] args) {
		Node n=new Node(20);
		n.left=new Node(8);
		n.right=new Node(22);
		n.left.left=new Node(5);
		n.left.right=new Node(3);
		n.left.right.left=new Node(10);
		n.right.right=new Node(25);
		n.right.left=new Node(4);
		n.right.left.right=new Node(14);
		TreeMap<Integer,ArrayList<Integer>> tm=new TreeMap<Integer,ArrayList<Integer>>();
		tm=PrintBottom(n,0,tm);
		for(Map.Entry<Integer,ArrayList<Integer>> entry : tm.entrySet()) {
  			ArrayList<Integer> al=entry.getValue();
  			for(int i=0;i<al.size();i++){
  				System.out.print(al.get(i)+" ");
  			}
  			System.out.println();
		}
	}

	public static TreeMap<Integer,ArrayList<Integer>> PrintBottom(Node n,int hd,TreeMap<Integer,ArrayList<Integer>> tm){
		if(n!=null){
			if(tm.containsKey(hd)){
				ArrayList<Integer> al=tm.get(hd);
				al.add(n.d);
				tm.put(hd,al);
			}
			else{
				ArrayList<Integer> al=new ArrayList<Integer>();
				al.add(n.d);
				tm.put(hd,al);
			}
			if(n.left!=null){
				PrintBottom(n.left,hd-1,tm);
			}
			if(n.right!=null){
				PrintBottom(n.right,hd+1,tm);
			}
		}
		return tm;
	}
}