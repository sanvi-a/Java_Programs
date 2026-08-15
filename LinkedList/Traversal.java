public class Traversal{
    public static void main(String[] args){
        //Creating a Linked List
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        //Connecting the nodes
        first.next = second;
        second.next = third;
        Node head = first;
        Node current = head;
        System.out.println("Linked list elements:");
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}