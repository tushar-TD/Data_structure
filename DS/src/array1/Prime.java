package array1;

public class Prime
{
	public static void display()
	{
		System.out.println("Prime Numbers:");
		for(int n=1;n<=100;n++)
		{
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					{
						flag=false;
						break;
					}
			}
			if(flag==true)
				System.out.println(n);
			}
	}
	public static void main(String[] args)
	{
		display();
	}

}
