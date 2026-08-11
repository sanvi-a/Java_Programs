import java.util.Scanner;
public class Stringcharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str =sc.nextLine();
        System.out.println("The Entered string is : "+str);
        System.out.println("Each char: ");
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
                }
            }
        }

