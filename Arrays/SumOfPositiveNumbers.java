import java.util.Scanner;

public class SumOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements:");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("\nSum of positive numbers:" + sum);
    }
}