import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int num = sc.nextInt();
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < num; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Enter the element to insert:");
        int element = sc.nextInt();
        System.out.println("Enter the index of the element to insert:");
        int index = sc.nextInt();
        arr.set(index, element);
        System.out.println("The updated array elements are:");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}