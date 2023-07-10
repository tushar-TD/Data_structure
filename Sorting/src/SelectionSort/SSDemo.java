package SelectionSort;

public class SSDemo {
	public static void SelectionSort(int a[])
	{
		int i,j,min,index;
		for(i=0;i<a.length;i++)
		{
			min=a[i];
			index=i;
			for(j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					index=j;
				}
			}
			a[index]=a[i];
			a[i]=min;
		}
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
	int a[]= {4,2,-3,14,7};
	display(a);
	SelectionSort(a);
	System.out.println("*********************************");
	System.out.println("After Sorting:");
	display(a);
}
}
