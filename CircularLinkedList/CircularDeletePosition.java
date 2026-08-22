import java.util.Scanner;

public class CircularDeletePosition {
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
            System.out.print("Enter element "+(i+1)+": ");
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }
        System.out.print("Enter position to delete: ");
        int position = sc.nextInt();
        if (head == null) {
            System.out.println("List is empty");
        }
        else if (position == 1) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
        }
        else {
            Node temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            if (temp.next == tail) {
                tail = temp;
            }
            temp.next = temp.next.next;
            tail.next = head;
        }
        System.out.println("After deletion:");
        if (head != null) {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
    }
}