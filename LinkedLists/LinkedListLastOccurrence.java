import java.util.Scanner;

public class LinkedListLastOccurrence {
    static class Node{
        int data;
        Node next;
        Node(int data){
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

        for(int i = 0; i < n; i++){
            System.out.print("Enter element "+(i+1)+": ");
            int value = sc.nextInt();

            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        Node current = head;
        boolean found = false;
        int position = 1;
        int lastPosition = -1;
        while(current != null){
            if(current.data == target){
                lastPosition = position;
                found = true;
            }
            current = current.next;
            position++;
        }
        if(found){
            System.out.print("Last occurrence found at position: " + lastPosition);
        }else{
            System.out.print("Element not found");
        }
        }
    }


