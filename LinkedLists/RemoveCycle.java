public class RemoveCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        head.next = second;
        second.next = third;
        third.next = fourth;
        // Create cycle
        fourth.next = second;
        Node slow = head;
        Node fast = head;
        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        // If cycle exists
        if (slow == fast) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            // Find the last node of the cycle
            Node cycleEnd = fast;
            while (cycleEnd.next != slow) {
                cycleEnd = cycleEnd.next;
            }
            cycleEnd.next = null;
        }
        // Print list
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}