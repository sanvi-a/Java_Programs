import java.util.Scanner;
public class Whitespace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch)){
                count++;
            }
        }
        System.out.println("Number of Whitespace: "+count);
    }
}