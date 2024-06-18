import java.util.Scanner;
class insertelement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements :");
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("Enter the element to be inserted :");
		int a=sc.nextInt();
		System.out.println("Enter the position to be inserted :");
		int b=sc.nextInt();
		arr[b]=a;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
		