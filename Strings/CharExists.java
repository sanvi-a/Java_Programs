import java.util.Scanner;
public class CharExists{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Enter the character to check: ");
        char ch = sc.next().charAt(0);
        boolean found = false;
        for(int i =0;i<str.length();i++) {
            char c = str.charAt(i);
            if (c == ch) {
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("Character not found!!");
        }else{
            System.out.println("Character found !!!");
        }
        sc.close();
    }
}