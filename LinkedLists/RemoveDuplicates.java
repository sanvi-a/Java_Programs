import java.util.Scanner;

public class RemoveDuplicates {
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
        Node current = head;
        while (current != null) {
            Node previous = current;
            Node temp = current.next;
            while (temp != null) {
                if (temp.data == current.data) {
                    previous.next = temp.next;
                } else {
                    previous = temp;
                }
                temp = temp.next;
            }
            current = current.next;
        }
        System.out.print("Linked list after removing duplicates: ");
        Node result = head;
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
    }
}