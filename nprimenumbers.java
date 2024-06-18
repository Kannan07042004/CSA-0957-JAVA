import java.util.Scanner;
public class nprimenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = scanner.nextInt();
        int count = 0;  
        int num = 2;  
        System.out.println("The first " + n + " prime numbers are:");
        while (count < n) {
            int factors = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
