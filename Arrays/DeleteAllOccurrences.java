import java.util.Scanner;

public class DeleteAllOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element to delete:");
        int ele = input.nextInt();
        int[] unique = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                continue;
            } else {
                unique[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array :");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}