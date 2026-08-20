import java.util.Scanner;

public class LinearSearch {
    public static boolean search(int[] arr,int index,int target){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        return search(arr, index + 1, target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        boolean found = search(arr, 0, target);
        if(found){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}