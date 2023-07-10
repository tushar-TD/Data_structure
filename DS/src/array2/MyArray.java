package array2;

import java.util.Scanner;

public class MyArray {
	public static void accept(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+arr.length+ " Elements");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
	}
	public static void display(int arr[])
	{
		System.out.println("***************");
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
		
	public static boolean isAvailable(int arr[])
	{
		boolean flag=false;
		if(arr[0]!='\n')
			flag=true;
		return flag;
	}
	
	public static int search(int arr[])
	{
		System.out.println("Check Element:");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		byte s=-1;
		for(byte i=0;i<arr.length;i++)
		{
			if(c==arr[i])
			{
				s=i;
				break;
			}
		}
		return s;
	}
	public static int[] reverse(int arr[])
	{
		int res[]=new int[arr.length];
		int k=0;

		for(int i=arr.length-1;i>=0;i--)
		{
			res[k++]=arr[i];
		}
		return res;
	}
	public static int[] rotateLeft(int arr[],int n)
	{
		int res[]=new int[arr.length];
		int k=0;
		for(int i=n;i<arr.length;i++)
			res[k++]=arr[i];
		for(int i=0;i<n;i++)
			res[k++]=arr[i];
		display(res);
		return res;
		
	}
	public static int[] rotateRight(int arr[],int n1)
	{
		int res[]=new int[arr.length];
		for(int i=0;i<n1;i++)
		{
			int temp;
			temp=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
				arr[j]=arr[j-1];
			arr[0]=temp;
		}
		display(arr);
		return arr;
		
	}

	public static void main(String[] args) {
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array:");
		int asize=sc.nextInt();
		a=new int[asize];
		accept(a);
		display(a);
		if(isAvailable(a))
		{
			System.out.println("Available");
		}
		int c=search(a);
		if(c==-1)
		{
			System.out.println("Element Not Available");
		}
		else
		{
			System.out.println("Element Available at position " +c);
		}
		int res[]=reverse(a);
		System.out.println("*****Reverse*****");
		display(res);
		
		System.out.println("Enter from position to rotate left:");
		int n=sc.nextInt();
		rotateLeft(a, n);
		
		System.out.println("Enter from position to rotate right:");
		int n1=sc.nextInt();
		rotateRight(a, n1);
	}

}
