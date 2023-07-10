package array1;

public class ArmsStrong {
	public static int countdigits(int n)
	{
		int c=0;
		while(n>0)
		{
			n=n/10;
			c++;
		}
		return c;
	}
	public static int power(int n,int n2)
	{
		int res=1;
		for(int i=0;i<n2;i++)
		{
			res=res*n;
		}
		return res;
	}
	public static void arms()
	{
		System.out.println("Armsstrong Numbers:");
		for(int n=1;n<=10000;n++)
		{
			int n1=n;
			int n2=n;
			int c=0;
			int arm=0;
			int l=countdigits(n);
			
			while(n2>0)
			{
				int rem=n2%10;
				arm=arm+power(rem,l);
				n2=n2/10;
			}
			if(n==arm)
				System.out.println(n);
		}
		
	}

	public static void main(String[] args) {
		arms();
		

	}

}
