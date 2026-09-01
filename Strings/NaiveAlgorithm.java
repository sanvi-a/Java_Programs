import java.util.ArrayList;
import java.util.Scanner;
/*   Input:  text =  "aabaacaadaabaaba", pattern = "aaba"
      Output: [0, 9,  12]
 */
public class NaiveAlgorithm {
    public static ArrayList<Integer> search(String pattern, String str) {
       ArrayList<Integer> result = new ArrayList<>();
       for(int i =0;i<= str.length()-pattern.length();i++){
           for(int j =0;j<pattern.length();j++){
               if(str.charAt(i+j)!=pattern.charAt(j)){
                   break;
               }
               if(j==pattern.length()-1){
                   result.add(i);
               }
           }
       }
       return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Enter a pattern: ");
        String pattern = input.nextLine();
        ArrayList<Integer> result = search(pattern, str);
        for(int item : result){
            System.out.print(item+" ");
        }
    }
}