import java.util.Scanner;
public class CharOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.print("Enter the Character: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for(int i =0; i<str.length();i++){
            char c = str.charAt(i);
            if(c==ch){
                count++;
            }
        }
        System.out.println("Enter character occurrence: "+count);
    }
}