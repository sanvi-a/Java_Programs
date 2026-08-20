import java.util.Scanner;
public class MinNumArray{
    public static int min(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minOfRemaining = min(arr, index + 1);
        if (arr[index] < minOfRemaining) {
            return arr[index];
        } else {
            return minOfRemaining;
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
        System.out.println("Minimum element: " + min(arr, 0));
    }
}