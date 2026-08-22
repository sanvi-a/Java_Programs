import java.util.Scanner;

public class SearchElementLinkedList {

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
        // Create the doubly linked list
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
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        Node temp = head;
        int position = 1;
        boolean found = false;
        while (temp != null) {
            if (temp.data == target) {
                System.out.println("Element found at position " + position);
                found = true;
                break;
            }
            temp = temp.next;
            position++;
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}