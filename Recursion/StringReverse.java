import java.util.Scanner;

public class StringReverse {
    public static String reverse(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        return reverse(str, index + 1) + str.charAt(index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverse(str, 0));
        sc.close();
    }
}