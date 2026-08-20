import java.util.Scanner;

public class palindromeNumber{
    public static int palindrome(int x,int rev){
        if(x==0){
            return rev;
        }
        int digit = x%10;
        rev = rev*10+digit;
        return palindrome(x/10,rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = palindrome(n,0);
        if(n==reverse){
            System.out.printf("%d == %d is a palindrome number",n,reverse);
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}