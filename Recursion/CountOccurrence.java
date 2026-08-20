import java.util.Scanner;
public class CountOccurrence {
    public static int Count(int[] arr,int target,int index){
        if(index==arr.length){
            return 0;
        }
        int count = 0;
        if(arr[index]==target){
            count =1;
        }
        return count + Count(arr,target,index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        int total = Count(arr,target,0);
        System.out.print("Count: "+total);

    }
}