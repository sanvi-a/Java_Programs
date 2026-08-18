import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int column = sc.nextInt();
        int[][] Matrix = new int[row][column];
        System.out.println("Enter the Matrix elements:");
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }

        int even =0;
        int odd =0;

        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                if((Matrix[i][j])%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("\nEven Elements: "+even);
        System.out.println("Odd Elements: "+odd);
    }
}