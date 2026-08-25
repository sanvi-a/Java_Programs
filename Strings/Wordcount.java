import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = sc.nextLine();
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isWhitespace(ch)) {
                inWord = false;
            }
            else if (!inWord) {
                count++;
                inWord = true;
            }
        }
        System.out.println("Number of words: " + count);
    }
}