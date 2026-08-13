import java.util.Scanner;
public class Wordcount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if((!Character.isWhitespace(ch))&&(i == 0 || Character.isWhitespace(str.charAt(i - 1)))){
                count++;
            }
        }
        System.out.println("Number of words: " + count);

        String str1 = "Java is a high level program.";
        System.out.println(str1);
        String[] word = str1.trim().split("\\s+");
        System.out.println(word.length);
    }
}