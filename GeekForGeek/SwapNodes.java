/*Two nodes of a BST are swapped, correct the BST
Two of the nodes of a Binary Search Tree (BST) are swapped. Fix (or correct) the BST.
Input Tree:
         10
        /  \
       5    8
      / \
     2   20

In the above tree, nodes 20 and 8 must be swapped to fix the tree.  
Following is the output tree
         10
        /  \
       5    20
      / \
     2   8*/
class Node{
  int data;
  Node left,right;
  Node(int d){
    data=d;
    left=right=null;
  }
}     
class SwapNodes{
  static Node root;
  static Node first,middle,last,prev;
  public static void main(String[] args) {
    Node n=new Node(10);
    n.left=new Node(5);
    n.right=new Node(8);
    n.left.left=new Node(2);
    n.left.right=new Node(20);
    Print(n);
    help(n);
    System.out.println();
    Print(n);
  }

  public static void Print(Node n){
    while(n!=null){
      System.out.print(n.data+"  ");
      n=n.next;
    }
  }

  public static void help(Node n){
    first=middle=last=null;
    FindNode(n);
    if(first!=null && last!=null){
      int temp=first.data;
      first.data=last.data;
      last.data=temp;
    }
    else if(first!=null && middle!=null){
      System.out.println(first.data+"  "+middle.data);
      int temp=first.data;
      first.data=middle.data;
      middle.data=temp;
    }
  }

  public static void FindNode(Node n){
    if(n!=null){
      //System.out.println(n.data+"  ");
      FindNode(n.left);
    if(prev!=null && prev.data>n.data){
      if(first==null){
        first=prev;
        middle=n;
      }
      else{
        last=n;
      }
    }
     prev=n;
    FindNode(n.right);
    }
  }
}