import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		int n,rem,c=0;
		int b[]=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number:");
		n=sc.nextInt();
		while(n>0)
		{
			rem=n%2;
			b[c++]=rem;
			n=n/2;
		}
		System.out.println("Converted Decimal Number:");
		for(int i=c-1;i>=0;i--)
			System.out.print(" "+b[i]);
		
	}

}
