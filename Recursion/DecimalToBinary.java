import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        if (n == 0) {
            return;
        }
        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("Binary: 0");
        } else {
            System.out.print("Binary: ");
            decimalToBinary(n);
        }
        sc.close();
    }
}