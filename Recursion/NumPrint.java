import java.util.Scanner;

public class NumPrint {
    public static void Numbers(int n) {
        if (n == 0) {
            return;
        }
        Numbers(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total nums to be printed: ");
        int num = sc.nextInt();
        Numbers(num);
    }
}