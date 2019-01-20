/*
Find maximum level sum in Binary Tree
Given a Binary Tree having positive and negative nodes, the task is to find maximum sum level in it.

Examples:

Input :               4
                    /   \
                   2    -5
                  / \    /\
                -1   3 -2  6
Output: 6
Explanation :
Sum of all nodes of 0'th level is 4
Sum of all nodes of 1'th level is -3
Sum of all nodes of 0'th level is 6
Hence maximum sum is 6

Input :          1
               /   \
             2      3
           /  \      \
          4    5      8
                    /   \
                   6     7  
Output :  17


*/

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
class MaxLevelSum{
	static Node root1;
	public static void main(String[] args) {
		root1 = new Node(2); 
        root1.right = new Node(3); 
        root1.right.right = new Node(3); 
        root1.left = new Node(10); 
        root1.left.left = new Node(6); 
        root1.left.left.right = new Node(3); 
        root1.left.right = new Node(6); 
        help(root1);
	}

	public static void help(Node n){
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		int max=Integer.MIN_VALUE;
		while(!q.isEmpty()){
			int sum=0;
			int size=q.size();
			while(size-->0){
				Node temp=q.poll();
				sum+=temp.data;
				if(sum>max){
					max=sum;
				}
				if(temp.left!=null){
					q.add(temp.left);
				}

				if(temp.right!=null){
					q.add(temp.right);
				}
			}
		}
		System.out.println(max);



	}


}
