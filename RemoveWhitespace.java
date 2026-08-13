import java.util.Scanner;
public class RemoveWhitespace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str = sc.nextLine();
        String str1 = "";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch)){
                continue;
            }
            str1 += ch;
        }
        System.out.println("String without Whitespace: "+str1);
        sc.close();
    }
}