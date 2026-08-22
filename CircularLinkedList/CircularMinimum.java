import java.util.Scanner;

public class CircularMinimum {
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
        if (head == null) {
            System.out.println("List is empty");
        } else {
            int min = head.data;
            Node temp = head.next;
            while (temp != head) {
                if (temp.data < min) {
                    min = temp.data;
                }
                temp = temp.next;
            }
            System.out.println("Minimum element: " + min);
        }
    }
}