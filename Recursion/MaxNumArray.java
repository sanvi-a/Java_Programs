import java.util.Scanner;
public class MaxNumArray{
    public static int max(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxOfRemaining = max(arr, index + 1);
        if (arr[index] > maxOfRemaining) {
            return arr[index];
        } else {
            return maxOfRemaining;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element: " + max(arr, 0));
    }
}