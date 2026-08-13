import java.util.Scanner;

public class CountGreaterThanTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("The Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the target: ");
        int s = input.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > s) {
                count++;
            }
        }
        System.out.printf("\nThe elements greater that %d:%d ", s, count);
    }
}