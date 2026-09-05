package BuiltinStacks;
import java.util.Scanner;
import java.util.Stack;

public class PeekTopElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack: " + stack);
    }
}