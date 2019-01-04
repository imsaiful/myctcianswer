import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}

class CznNode{
	public static void main(String[] args) {
		Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(3); 
	    root.left.left = new Node(4); 
	    root.left.right = new Node(5); 
	    root.left.right.right = new Node(15); 
	    root.right.left = new Node(6); 
	    root.right.right = new Node(7); 
	    root.right.left.right = new Node(8); 
		
	    help(root, root.left.right); 
	}
	public static void help(Node root,Node x)
	{
		Node p=null;
		boolean flag=false;
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty() && flag==false){
			int q_size=q.size();
			while(q_size-->0){
				p=q.peek();
				q.remove();
				if(p.left==x || p.right==x){
					flag=true;
				}
				else{
					if(p.left!=null){
						q.add(p.left);
					}
					if(p.right!=null){
						q.add(p.right);
					}
				}
			}
		}
		if(flag){
			int size=q.size();	
			while(size>0){
				Node n=q.peek();
				q.poll();
				System.out.println(n.data+"  ");
				size--;
			}

		}
		else{
			System.out.println("No Sibling found");
		}





	}




}