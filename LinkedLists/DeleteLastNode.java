import java.util.Scanner;

public class DeleteLastNode {
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
        // Delete last node
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            // Only one node
            head = null;
            tail = null;
        } else {
            Node current = head;
            // Move to second-last node
            while (current.next.next != null) {
                current = current.next;
            }
            // Remove last node
            current.next = null;
            tail = current;
        }
        // Print updated linked list
        Node current = head;
        System.out.print("Linked list after deleting last node: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}