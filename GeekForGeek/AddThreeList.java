/*1.	Given three linked lists,where each linked list represents a number, add the three lists and return the resultant list.
5->1->2->NULL
9->1->NULL
7->2->2->NULL*/
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

class AddThreeList{
    public static void main(String[] args){
        Node n1=new Node(5);
        n1.next=new Node(1);
        n1.next.next=new Node(2);

        Node n2=new Node(9);
        n2.next=new Node(1);
   

        Node n3=new Node(7);
        n3.next=new Node(2);
        n3.next.next=new Node(2);
        
        Print(n1);
        Print(n2);
        Print(n3);


    }
    public static void Print(Node n){
        Node cur=n;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}