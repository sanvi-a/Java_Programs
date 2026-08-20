import java.util.Scanner;

public static int reverse(int x,int rev) {
    if(x==0){
        return rev;
    }
    int digit = x%10;
    rev = rev*10+digit;
    return reverse(x/10,rev);

}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    System.out.println("Reversed number: "+reverse(n,0));

}
