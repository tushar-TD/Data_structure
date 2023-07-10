package InsertionSort;

public class ISDemo {
	public static void InsertionSort(int a[])
	{
		int i,j=0;
		for(i=1;i<a.length;i++)
		{
			int key=a[i];
			j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;   
			
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
		int a[]= {9,7,3,4,2,5,-2};
		display(a);
		InsertionSort(a);
		System.out.println("*********************************");
		System.out.println("After Sorting:");
		display(a);
	}
	
}
