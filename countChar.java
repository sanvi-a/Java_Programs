import java.util.Scanner;
public class countChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        int vowels=0,consonants=0,digits=0,space = 0,special_char=0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            else if(Character.isDigit(ch)){
                digits++;
            }
            else if(Character.isWhitespace(ch)){
                space++;
            }
            else{
                special_char++;
            }


        }
        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonants);
        System.out.println("White space: "+space);
        System.out.println("Digits: "+digits);
        System.out.println("Special Characters: "+special_char);
    }

}