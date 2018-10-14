import java.io.*;
import java.util.*;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int d){
		data=d;
		left=null;
		right=null;
	}
}

class SumTree{
	TreeNode root;
		public static void main(String[] args) {
		Scanner in=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		SumTree st=new SumTree();
		st.root=new TreeNode(26);
		st.root.left = new TreeNode(10); 
        st.root.right = new TreeNode(3); 
        st.root.left.left = new TreeNode(4); 
        st.root.left.right = new TreeNode(6); 
        st.root.right.right = new TreeNode(3); 
        boolean flag=st.isSumTree(st.root);
        if(flag){
          	System.out.println("The given tree is a sum tree");
        } 
        else{
        	System.out.println("The given tree is not a sum tree"); 
        }
    }
    public boolean isSumTree(TreeNode node)
	{

		int ls,rs;
		ls=rs=0;
		if(node==null || isLeaf(node)){
			return true;
		}
		if(!isSumTree(node.left) && !isSumTree(node.right))
		{
			if(node.left==null){
				ls=0;
			}
			else if(isLeaf(node.left)){
				ls=node.left.data;
			}
			else{
				ls=2*node.left.data;
			}

			if(node.right==null){
				rs=0;
			}
			else if(isLeaf(node.right)){
				rs=node.right.data;
			}
			else{
				rs=2*node.right.data;
			}

			
		}
		if(node.data==ls+rs){
				return true;
			}
			return false;

	} 
    



	public boolean isLeaf(TreeNode node)
	{
		if(node == null)
		{
			return false;
		}
		if(node.left==null && node.right==null)
		{
			return true;
		}
		return false;
	} 
}