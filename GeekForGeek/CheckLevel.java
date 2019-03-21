/*Check if all leaves are at same level */
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		left=null;
		right=null;
	}
}


class CheckLevel{
	static int fl=0;
	public static void main(String[] args) {
		Node n=new Node(1);
		n.left=new Node(2);
		n.right=new Node(3);
		n.left.left=new Node(4);
		n.left.right=new Node(5);
	
		System.out.println(help(n));
	}
	public static boolean  help(Node n){
		int tl=0;
		int level=0;
		Queue<Node> q=new LinkedList<Node>();
		q.add(n);
		while(!q.isEmpty()){
			int size=q.size();
			level=level+1;
			while(size-->0){
				System.out.print(tl+" "+level);
				Node temp=q.poll();
				if(temp.left==null && temp.right==null){
					if(tl==0){
						tl=level;
					}
					else if(level!=tl){
						return false;
					}
				}
				if(temp.left!=null){
					q.add(temp.left);
				}

				if(temp.right!=null){
					q.add(temp.right);
				}
			}
		}
		return true;
		
	}
}