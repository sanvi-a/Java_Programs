import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creates an empty ArrayList.
        // It manages its internal array automatically.
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of the array list:");
        int n = sc.nextInt();
        // Elements are added dynamically.
        // We do not specify a fixed array length here.
        System.out.println("Enter the elements of the array list:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            // Adds the element to the ArrayList.
            // If more internal capacity is required,
            // ArrayList automatically resizes its internal storage.
            arr.add(value);
        }

        // size() gives the number of elements currently stored.
        System.out.println("Size: " + arr.size());

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}