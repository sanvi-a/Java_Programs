import java.util.Scanner;

public class StringCharCount {
    public static int count(String str, int index, char target) {
        if (index == str.length()) {
            return 0;
        }
        int current = 0;
        if (str.charAt(index) == target) {
            current = 1;
        }
        return current + count(str, index + 1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character: ");
        char target = sc.next().charAt(0);
        System.out.println("Occurrences: " + count(str, 0, target));
        sc.close();
    }
}