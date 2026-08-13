import java.util.Scanner;

public class MoveZerosToEnd {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++;
        }
        System.out.println("\nArray after moving zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}