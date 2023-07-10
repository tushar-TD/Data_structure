package array2;

import java.util.Scanner;

public class Array1D {
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
		
	}
	public static int max(int arr[])
	{
		int max=0;
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];	
		}
		return max;
	}
	public static int maxEven(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			if(max<arr[i])
				max=arr[i];
		}
		return max;
			
	}
	public static int minEven(int arr[])
	{
		int max=0;
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			if(max>arr[i])
				max=arr[i];	
		}
		return max;
	}
	public static int sumElements(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		return sum;
	}
	/*public static int[] commonElements(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			int k=0;
			int res[]=new int[count];
			for(int j=1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
					flag=false;
				break;
			}
			if(flag==true)
				res[k++]=arr[i];
		}
		display(res);
		return res;
		
	}*/


	public static void main(String[] args) {
		int arr[]= {12,13,14,15,16,17,18,19,20};
		display(arr);
		System.out.println("Max:"+max(arr));
		System.out.println("MaxEven:"+maxEven(arr));
		System.out.println("MinEven:"+minEven(arr));
		System.out.println("SumOfElements:"+sumElements(arr));
		
	}

}
