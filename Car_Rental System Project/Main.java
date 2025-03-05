class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class Main {
    public static Node reverseList(Node head )
    {
        Node curr = head , prev = null , next;   
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }     
         return prev;
    }

    public static Node addFirst(Node head , int digit)
    {
        Node newNode = new Node(digit);
        newNode.next = head;
        return newNode ;
    }
    public static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " , ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int digit = 1;
        head = addFirst(head, digit);
        head = reverseList( head );
        System.err.println(" Your Reverse Linked List is here :-");
        printList(head);
    }
}