import java.util.Scanner;

public class FindCommonElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements arr1:");
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the elements arr2:");
        for (int i = 0; i < n; i++) {
            arr2[i] = input.nextInt();
        }
        System.out.println("Common elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    break;
                }
            }
        }
    }
}