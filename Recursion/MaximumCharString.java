import java.util.Scanner;

public class MaximumCharString {
    public static char max(String str, int index) {
        if (index == str.length() - 1) {
            return str.charAt(index);
        }
        char maxRemaining = max(str, index + 1);
        if (str.charAt(index) > maxRemaining) {
            return str.charAt(index);
        }
        return maxRemaining;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Maximum character: " + max(str, 0));
        sc.close();
    }
}