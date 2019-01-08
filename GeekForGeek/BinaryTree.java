import java.util.Queue; 
import java.util.TreeMap; 
import java.util.LinkedList; 
import java.util.Map; 
import java.util.Map.Entry; 
  
// class to create a node 
class Node { 
    int data; 
    Node left, right; 
  
    public Node(int data) { 
        this.data = data; 
        left = right = null; 
    } 
} 

class BinaryTree { 
    Node root; 
  
    public BinaryTree() { 
        root = null; 
    } 
      

      
    // Driver Program to test above functions 
    public static void main(String[] args)  
    {  
        /* Create following Binary Tree  
            1  
        / \  
        2 3  
        \  
            4  
            \  
            5  
            \  
                6*/
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.left.right.right = new Node(5); 
        tree.root.left.right.right.right = new Node(6); 
        top_view(tree.root);
        
    }  
    public static void top_view(Node root)
{
    left_view(root.left);
    System.out.print(root.data + " ");
    right_view(root.right);
}

 public static void left_view(Node root) {
    if (root == null) return;
    left_view(root.left);
    System.out.print(root.data + " ");
}

public static void right_view(Node root) {
    if (root == null) return;
  
    System.out.print(root.data + " ");
    right_view(root.right);
}
      
} 