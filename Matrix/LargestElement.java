import java.util.Scanner;

public class LargestElement{
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
        System.out.println("The matrix: ");
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                System.out.print(Matrix[i][j]+" ");
            }
        }
        int largest = Matrix[0][0];

        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                if(Matrix[i][j]>largest){
                    largest = Matrix[i][j];
                }
            }
        }
        System.out.println("\nLargest Element:"+largest);
    }
}