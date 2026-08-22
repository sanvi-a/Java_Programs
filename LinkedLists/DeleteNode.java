import java.util.Scanner;

public class DeleteNode {
    static class Node {
        int data;
        Node next;
        Node(int data) {
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
        // Create linked list
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int value = sc.nextInt();
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.print("Enter position to delete: ");
        int position = sc.nextInt();
        // Delete first node
        if (position == 1) {
            head = head.next;
            // If the list becomes empty
            if (head == null) {
                tail = null;
            }
        } else {
            Node current = head;
            // Move to the node before the position
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }
            // Delete the node
            if (current.next != null) {
                if (current.next == tail) {
                    tail = current;
                }
                current.next = current.next.next;
            }
        }
        // Print updated linked list
        Node current = head;
        System.out.print("Linked list after deletion: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}