package BuiltinStacks;
import java.util.Scanner;
import java.util.Stack;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        int position = stack.search(target);
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position " + position + " from top");
        }
    }
}