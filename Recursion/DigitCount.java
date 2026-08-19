import java.util.Scanner;
public class DigitCount {
    public static int count(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + count(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(1);
        } else {
            System.out.println(count(num));
        }
    }
}