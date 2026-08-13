import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("The new array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}