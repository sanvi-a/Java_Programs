import java.util.Scanner;
public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Find: ");
        char a = sc.next().charAt(0);
        System.out.print("Replace:");
        char b = sc.next().charAt(0);
        String str1 = "";
        for (int i =0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch==a){
                ch = b;
            }
            str1 += ch;
        }
        System.out.println("Replaced String :"+str1);
    }
}