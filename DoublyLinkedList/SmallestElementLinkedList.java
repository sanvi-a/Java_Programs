import java.util.Scanner;

public class SmallestElementLinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        Node head = null;
        // Create the list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.prev = temp;
            }
        }
        if (head == null) {
            System.out.println("List is empty");
        } else {
            int smallest = head.data;
            Node temp = head.next;
            while (temp != null) {
                if (temp.data < smallest) {
                    smallest = temp.data;
                }
                temp = temp.next;
            }
            System.out.println("Smallest element: " + smallest);
        }
    }
}