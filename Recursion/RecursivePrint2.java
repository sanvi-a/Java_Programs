import java.util.Scanner;

public class RecursivePrint2 {
    public static void Numbers(int n, int current) {
        if (current > n) {
            return;
        }
        // Going down
        System.out.print(current + " ");
        Numbers(n, current + 1);
        // Coming back up
        System.out.print(current + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total nums to be printed: ");
        int num = sc.nextInt();
        Numbers(num, 1);
    }
}