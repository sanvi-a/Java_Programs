import java.util.Locale;
import java.util.Scanner;
public class UpperCaseConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
            }
            str1 += ch;

        }
        System.out.print("Upper case String: "+str1);
    }
}
