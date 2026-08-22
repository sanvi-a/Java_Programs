import java.util.Scanner;

public class CircularSearch {
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
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        boolean found = false;
        Node temp = head;
        if (head != null) {
            do {
                if (temp.data == target) {
                    found = true;
                    break;
                }
                temp = temp.next;
            } while (temp != head);
        }
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}