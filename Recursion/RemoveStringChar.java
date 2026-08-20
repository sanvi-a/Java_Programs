import java.util.Scanner;

public class RemoveStringChar{
    public static String removeChar(String str, int index, char target) {
        if (index == str.length()) {
            return "";
        }
        char current = str.charAt(index);
        if (current == target) {
            return removeChar(str, index + 1, target);
        }
        return current + removeChar(str, index + 1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char target = sc.next().charAt(0);
        System.out.print("Result: " + removeChar(str, 0, target));
        sc.close();
    }
}