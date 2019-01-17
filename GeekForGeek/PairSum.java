import java.util.*;
class Node { 
      
    int data; 
    Node left, right; 
      
    Node(int d) { 
        data = d; 
        left = right = null; 
    } 
} 
  
class PairSum
{ 
      
    // Root of BST 
    Node root; 
  	static HashSet<Integer> hs=new HashSet<Integer>();
   
      
    // Inorder traversal of the tree 
    void inorder() 
    { 
        inorderUtil(this.root); 
    } 
      
    // Utility function for inorder traversal of the tree 
    void inorderUtil(Node node) 
    { 
        if(node == null) 
            return; 
          
        inorderUtil(node.left); 
        System.out.print(node.data + " "); 
        inorderUtil(node.right); 
    } 
      
    // This method mainly calls insertRec() 
    void insert(int key) { 
    root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int data) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (data < root.data) 
            root.left = insertRec(root.left, data); 
        else if (data > root.data) 
            root.right = insertRec(root.right, data); 
  
        return root; 
    } 
      
    // Method that adds values of given BST into ArrayList 
    // and hence returns the ArrayList 
    ArrayList<Integer> treeToList(Node node, ArrayList<Integer> 
                                                      list) 
    {      
        // Base Case 
        if(node == null) 
            return list; 
          
        treeToList(node.left, list); 
        list.add(node.data); 
        treeToList(node.right, list); 
          
        return list; 
    } 
      
    // method that checks if there is a pair present 
    static void isPairPresent(Node node, int target) 
    {    
    	//System.out.println("Enter the system");
    	if(node==null){
    		return;
    	}

    	isPairPresent(node.left,target);
    	if(hs.contains(target-node.data)){
    		System.out.println("Pairs("+node.data+","+(target-node.data)+")");
    		
    	}
    	else{
    		hs.add(node.data);
    	}
    	isPairPresent(node.right,target);

    } 
          
    // Driver function 
    public static void main(String[] args) { 
        PairSum tree = new PairSum(); 
        /* 
                   15 
                /     \ 
              10      20 
             / \     /  \ 
            8  12   16  25    */
        tree.insert(15); 
        tree.insert(10); 
        tree.insert(20); 
        tree.insert(8); 
        tree.insert(12); 
        tree.insert(16); 
        tree.insert(25); 
  		
        isPairPresent(tree.root, 33); 
        } 
} 