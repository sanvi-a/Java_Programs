import java.util.Scanner;

public class DeleteFirstNode {
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

        // Delete first node
        if (head != null) {
            head = head.next;
        }

        // Print updated linked list
        Node current = head;

        System.out.print("Linked list after deleting first node: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}