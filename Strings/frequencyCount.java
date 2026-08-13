import java.util.Scanner;
public class frequencyCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            boolean already_counted = false;
            for(int j = 0; j<i;j++){
                if (str.charAt(j) == ch){
                    already_counted = true;
                    break;
                }
            }
            if(already_counted){
                continue;
            }
            int count = 0;
            for(int k = 0; k<str.length();k++){
                if(str.charAt(k) == ch){
                    count++;
                }
            }
            System.out.println(ch +" = "+count);
        }
        sc.close();
    }
}
