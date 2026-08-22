import java.util.Scanner;

public class InsertPosition {
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
        // Create the original list
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
        System.out.print("Enter position: ");
        int position = sc.nextInt();
        System.out.print("Enter value: ");
        int value = sc.nextInt();
        Node newNode = new Node(value);
        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        }
        // Insert at another position
        else {
            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid position");
            } else {
                newNode.next = temp.next;
                newNode.prev = temp;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
            }
        }
        // Display
        System.out.println("Doubly Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}