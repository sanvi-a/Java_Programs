import java.util.Scanner;

public class Subsequences {
    public static void generate(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        generate(str, index + 1, current);
        generate(str, index + 1, current + str.charAt(index));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        generate(str, 0, "");
        sc.close();
    }
}