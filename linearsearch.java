import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] elements = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();
        int index = linearSearch(elements, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }

        scanner.close();
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; 
    }
}
