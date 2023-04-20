import java.util.Scanner;

public class SearchArrayIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Taking input for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();
        
        // Taking input for the elements of the array
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        
        // Taking input for the number to be searched
        System.out.print("Enter the number to be searched: ");
        int x = input.nextInt();
        
        // Searching for the number in the array
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        
        // Printing the index at which the number occurs
        if (index == -1) {
            System.out.println("The number " + x + " does not occur in the array.");
        } else {
            System.out.println("The number " + x + " occurs at index " + index + " in the array.");
        }
        
        input.close();
    }
}
