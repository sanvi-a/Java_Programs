import java.util.Scanner;

public static int Sum(int n){
    if(n==0){
        return 0;
    }
    int sum = 0;
    int digit = n % 10;
    sum = sum + digit;
    n = n / 10;

    return digit + Sum(n);
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    System.out.print(Sum(num));
}