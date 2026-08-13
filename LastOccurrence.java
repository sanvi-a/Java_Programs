import java.util.Scanner;
public class LastOccurrence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:");
        String str = sc.nextLine();
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int lastindex = -1;
        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == ch){
                lastindex = i;


            }
        }
        if(lastindex!= -1){
            System.out.println("Lat Occurrence at index: "+lastindex);
        }else{
            System.out.println("Character not found!!");
        }
        sc.close();
    }
}