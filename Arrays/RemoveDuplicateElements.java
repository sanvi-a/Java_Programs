import java.util.Scanner;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] unique = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array without duplicates:");
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}