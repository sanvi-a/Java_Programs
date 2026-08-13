import java.util.Scanner;

public class RotateArrayLeft {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        System.out.println("\nArray after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}