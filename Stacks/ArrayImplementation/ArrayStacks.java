package ArrayImplementation;
import java.util.Scanner;

public class ArrayStacks {
    static int[] stack;
    static int top = -1;
    static void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top] = value;
    }
    static void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        stack = new int[size];
        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            int value = sc.nextInt();
            push(value);
        }
        display();
    }
}