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
        add(n1,n2,n3);

    }
    public static void Print(Node n){
        Node cur=n;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public static void add(Node n1,Node n2,Node n3){
        Node head=null;
        Node cur1=Rev(n1);
        Node cur2=Rev(n2);
        Node cur3=Rev(n3);
        int c=0;
        while(cur1!=null || cur2!=null || cur3!=null || c!=0){
            if(cur1!=null){
                c+=cur1.data;
                cur1=cur1.next;
            }
            if(cur2!=null){
                c+=cur2.data;
                cur2=cur2.next;
            }
            if(cur3!=null){
                c+=cur3.data;
                cur3=cur3.next;
            }
            
            Node temp=new Node(c%10);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            c=c/10;
        }
        Print(head);
    }
    public static Node Rev(Node n){
        Node cur=n;
        Node prev=null;
        while(cur!=null){
            Node next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}