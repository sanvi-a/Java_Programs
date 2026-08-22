import java.util.Scanner;

public class InsertNodeBeginning {
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

        // New node to insert
        System.out.print("Enter element to insert at beginning: ");
        int value = sc.nextInt();

        Node newNode = new Node(value);

        // Insert at beginning
        newNode.next = head;
        head = newNode;

        // Traverse and print the updated list
        Node current = head;

        System.out.print("Linked list after insertion: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}