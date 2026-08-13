import java.util.Scanner;
public class RemoveAllOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Remove: ");
        char ch = sc.next().charAt(0);
        String new_str = "";
        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            if(ch == c){
                continue;
            }
            new_str += c;
        }
        System.out.println("New String: "+new_str);
    }
}