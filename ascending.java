import java.util.Scanner;
public class ascending{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] elements = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }
        int temp;
        int swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (elements[j] > elements[j + 1]) {
                    temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(elements[i] + " ");
        }
        scanner.close();
    }
}
