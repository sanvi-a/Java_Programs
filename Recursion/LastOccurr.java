import java.util.Scanner;
public class LastOccurr {
    public static int LastOcc(int[] arr,int index,int target) {
        if(index==arr.length){
            return -1;
        }
        int result = LastOcc(arr,index+1,target);
        if(result!=-1){
            return result;
        }
        if(arr[index]==target){
            return index;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array:");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = sc.nextInt();
        int position = LastOcc(arr,0,target);
        if(position==-1){
            System.out.print("The target element is not in the array");
        }else{
            System.out.println("The target element is "+position);
        }
        sc.close();
    }
}