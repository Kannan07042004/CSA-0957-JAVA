import java.util.Scanner;
class compute{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n :");
		int n=sc.nextInt();
		double sum=0;
		for(int i=1;i<=3;i++){
			double a=Math.pow(n,i);
			sum+=a;
		}
		System.out.println(+sum);
	}
}	