package MergeSort;

import java.util.Scanner;

class Merge
{
	public void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int left[]=new int[n1];
		int right[]=new int[n2];
		int i=0;int j=0;int k=l;
		for(i=0;i<n1;i++)
			left[i]=arr[l+1];
		for(j=0;j<n2;j++)
			right[j]=arr[m+1+j];
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	public void mergeSort(int arr[],int l,int r)
	{
		if(l>=r)
			return;
		int m=(l+r)/2;
		mergeSort(arr, l, m);
		mergeSort(arr, m+1, r);
		merge(arr, l, m, r);
		
	}
	public void display(int a[],int size)
	{
		System.out.println("Array----->");
		for(int i=0;i<size;i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}
}
public class MSDemo {
	public static void main(String[] args) {

		int arr[]={92,68,2,5,12,17,58,23,-2,38};
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 Elements ");
		/*for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();*/
		display(arr, 10);
		mergeSort(arr, 0,10);
		display(arr, 10);
	}

	public static void mergeSort(int arr[],int l,int r)
	{
		if(l>=r)
			return;
		int m=(l+r-1)/2;
		mergeSort(arr, l, m);
		mergeSort(arr, m+1, r);
		merge(arr, l, m, r);
	}
	public static void merge(int arr[],int l,int m,int r)
	{
		int n1=m-l+1;
		int n2=r-m;
		int left[]=new int[n1];
		int right[]=new int[n2];
		int i=0;int j=0;int k=l;
		for(i=0;i<n1;i++)
			left[i]=arr[l+1];
		for(j=0;j<n2;j++)
			right[j]=arr[m+1+j];
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				i++;
			}
			else
			{
				arr[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=right[j];
			j++;
			k++;
		}
	}
	public static void display(int a[],int size)
	{
		System.out.println("Array----->");
		for(int i=0;i<size;i++)
			System.out.print(" "+a[i]);
		System.out.println();
	}
}
