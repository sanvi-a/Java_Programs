import java.util.Scanner;
public class CheckPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        String str1= "";
        for(int i = str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            str1 += ch;
        }
        if(str.equals(str1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }
}