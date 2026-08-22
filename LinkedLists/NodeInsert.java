import java.util.Scanner;

public class NodeInsert{
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

        // Create the original linked list
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

        System.out.print("Enter element to insert: ");
        int value = sc.nextInt();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        Node newNode = new Node(value);

        // Insert at beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;

            // Move to the node before the required position
            for (int i = 1; i < position - 1; i++) {
                current = current.next;
            }

            // Insert the new node
            newNode.next = current.next;
            current.next = newNode;

            // If inserted at the end, update tail
            if (newNode.next == null) {
                tail = newNode;
            }
        }

        // Print updated linked list
        Node current = head;

        System.out.print("Linked list after insertion: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}