import java.util.Scanner;

public static int power(int n,int p){
    if(p==0){
        return 1;
    }
    return n*power(n,p-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base: ");
    int base = sc.nextInt();
    System.out.print("Enter the exponent: ");
    int exponent = sc.nextInt();
    System.out.print("Power is: "+power(base,exponent));
}