import java.util.Scanner;

public class FindLargestElementIndex {
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
        int largest = arr[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                index = i;
            }
        }

        System.out.println("\nThe target is found at index: " + index);
    }
}