/*Convert a given binary tree to sum tree.*/

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

class ConvertSumTree{
    public static void main(String[] args){
        Node n=new Node(10);
        n.left=new Node(-2);
        n.right=new Node(6);
        n.left.left=new Node(8);
        n.left.right=new Node(-4);
        n.right.left=new Node(7);
        n.right.right=new Node(5);  
        
        SumTree(n);
        Print(n);
    }
    public static void Print(Node n){
            Queue<Node> q=new LinkedList<Node>();
            q.add(n);
            while(!q.isEmpty()){
                int size=q.size();
                while(size-->0){
                    Node temp=q.poll();
                    System.out.print(temp.data+" ");
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.left!=null){
                        q.add(temp.right);
                    }
                }
            }
    }
    public static int SumTree(Node n){
        if(n==null){
            return 0;
        }
        int old_value=n.data;
        n.data=SumTree(n.left)+SumTree(n.right);
        return n.data+old_value;
    }
}