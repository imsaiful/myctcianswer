
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class BottomView{
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
    TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
    help(n,tm,0);
    for(Map.Entry<Integer,Integer> entry : tm.entrySet()){
        System.out.print(entry.getValue()+" ");
    }
    
}
public static void help(Node n,TreeMap<Integer,Integer> tm,int hd){  
    if(n!=null){
        tm.put(hd,n.data);
        help(n.left,tm,hd-1);
        help(n.right,tm,hd+1);

    }
}
}