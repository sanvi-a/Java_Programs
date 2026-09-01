import java.util.Scanner;
// Skips unnecessary comparisons by shifting the pattern based on matched characters
// If a mismatch occurs, skip positions that cannot contain the pattern

public class ModifiedNaiveAlgorithm {
    public static void search(String pat, String str) {
        int i = 0;
        while (i <= str.length() - pat.length()) {
            int j;
            for (j = 0; j < pat.length(); j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == pat.length()) {
                System.out.println("Pattern found at index " + i);
                i = i + pat.length();
            }
            else if (j == 0) {
                i = i + 1;
            }
            else {
                i = i + j;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.print("Enter pattern: ");
        String pat = input.nextLine();
        search(pat, str);
    }
}