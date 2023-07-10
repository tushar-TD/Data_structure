package BubbleSort;

public class BubbleSort {
	public static void BubbleSort(int a[])
	{
		int i,j,temp,cnt=0;
		int size=a.length;
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					cnt++;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.println("After "+(i+1)+" Passing:");
			display(a);
		}
		System.out.println("Total Swaping Count:"+cnt);
		System.out.println("Number of Passes:"+i);
		
	}
	public static void display(int a[])
	{
		System.out.println("---------------->");
		for(int i=0;i<a.length;i++)
			System.out.print("  "+a[i]);
		System.out.println();
		System.out.println("<----------------");
		
	}
public static void main(String[] args) {
	int arr[]= {8,7,-3,-4,6,17,15};
	display(arr);
	BubbleSort(arr);
	System.out.println("*********************************");
	System.out.println("After Sorting:");
	display(arr);
	

}

}
