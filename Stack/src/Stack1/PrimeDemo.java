package Stack1;

import java.util.Scanner;

public class PrimeDemo {
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i/2;i++)
			{
				if(i%j==0)
					{
						flag=false;
						break;
					}
			}
	}
		return flag;
	
	}
	public static void main(String[] args) {
		int ch;
		IntegerStack arr=new IntegerStack(5);
		Scanner sc=new Scanner(System.in);
		int ele;
		do
		{
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Display");
			System.out.println("0. Exit");
			System.out.println("Enter Your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Enter Element to Enter:");
					ele=sc.nextInt();
					if(isPrime(ele))
						arr.push(ele);
					else
						System.out.println("Not Prime");
					break;
				case 2:
					ele=arr.pop();
					if(ele==-9999)
						System.out.println("Stack Is Empty ");
					else
						System.out.println("Deletd element : "+ele);
					break;
				case 3:
					arr.display();
					break;
			
			}
		}while(ch!=0);
	}


	}


