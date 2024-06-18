import java.util.Scanner;
public class sumofodd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
	int sum=0;
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
 	    if(arr[i] % 2 != 0){
		sum+=arr[i];
		}
	}
	System.out.println(+`sum);
	scanner.close();
    }	
}
			
	
