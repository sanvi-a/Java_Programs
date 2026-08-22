import java.util.Scanner;

public class SearchLinkedList{
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
        System.out.print("Enter the number of elements: ");
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
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        Node current = head;
        boolean found = false;
        while(current != null){
            if(current.data == target){
                found = true;
            }
            current = current.next;
        }
        if(found){
            System.out.print("Element found");
        }else{
            System.out.print("Element not found");
        }
    }

}