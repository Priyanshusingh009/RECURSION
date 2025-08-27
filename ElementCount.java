import java.util.Scanner;

public class ElementCount {
    public static int countOccurrences(int[] arr, int index, int target){
        if (index == arr.length) {
            return 0;
        }

        // Check if current element matches the target
        if (arr[index] == target) {
            return 1 + countOccurrences(arr, index + 1, target);
        } else {
            return countOccurrences(arr, index + 1, target);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //take array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to count: ");
        int target = sc.nextInt();
        int result = countOccurrences(numbers, 0, target);

        System.out.println("The number " + target + " occurs " + result + " times.");
        
        sc.close();
    }
    

}
