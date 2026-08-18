import java.util.Scanner;

public class RowSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows:");
        int row = sc.nextInt();
        System.out.print("Enter the column:");
        int column = sc.nextInt();
        int[][] Matrix = new int[row][column];

        System.out.print("Enter the Matrix elements:");
        for(int i =0;i<row;i++){
            for(int j = 0;j<column;j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i =0;i<row;i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i =0;i<row;i++) {
            int Sum =0;
            for (int j = 0; j < column; j++) {
                Sum += Matrix[i][j];
            }
            System.out.println("The Sum of row "+ i+" is"+Sum);
        }


        sc.close();
    }
}

