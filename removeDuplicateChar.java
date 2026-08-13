import java.util.Scanner;

public class removeDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String ch = "";
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    found = true;
                    break;
                }
            }
                if (!found) {
                    ch += str.charAt(i);
                }
            }
        System.out.println(ch);

    }
}
