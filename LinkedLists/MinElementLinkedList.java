import java.util.Scanner;

public class MinElementLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Node head = null;
        Node tail = null;

        for(int i = 0; i < n; i++){
            System.out.print("Enter element "+(i+1)+": ");
            int value = sc.nextInt();

            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        Node current = head;
        int min = current.data;
        while(current != null){
            if(current.data < min){
                min = current.data;
            }
            current = current.next;
        }
        System.out.print("The maximum element is "+min);
    }
}

