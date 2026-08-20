import java.util.Scanner;

public class SortedArray {
    public static boolean sort(int[] arr,int index){
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return sort(arr, index + 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = sort(arr,0);
        if(found){
            System.out.println("The array has been sorted");
        }else{
            System.out.println("The array has NOT been sorted");
        }
    }
}