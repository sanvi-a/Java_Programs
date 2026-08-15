import java.util.Scanner;

public class CreateLinkedList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;
        for(int i =1;i<=n;i++){
            System.out.println("Enter data for the node: "+ i +":");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }

        }
        System.out.println("Linked List:");
        Node current = head;

        while(current != null){
            System.out.print(current.data+"\t");
            current = current.next;
        }
        System.out.println("null");

    }
}