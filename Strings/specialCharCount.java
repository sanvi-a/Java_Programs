import java.util.Scanner;
public class specialCharCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(!(Character.isLetterOrDigit(ch)||Character.isWhitespace(ch))){
                count++;
            }
        }
        System.out.println("Special Char Count: "+count);
    }
}