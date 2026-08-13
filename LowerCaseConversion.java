import java.util.Locale;
import java.util.Scanner;
public class LowerCaseConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
            }
            str1 += ch;

        }
        System.out.print("Lower case String: "+str1);
    }
}