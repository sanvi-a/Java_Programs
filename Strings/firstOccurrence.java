import java.util.Scanner;
public class firstOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        boolean found = false;
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ch){
                System.out.println("First Occurrence at index: "+i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Character not found!!");
        }
        sc.close();
    }
}