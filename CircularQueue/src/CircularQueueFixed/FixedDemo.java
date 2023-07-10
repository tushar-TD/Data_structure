package CircularQueueFixed;

import java.util.Scanner;


public class FixedDemo {

	public static void main(String[] args) {
		int ele;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Queue:");
		int size=sc.nextInt();
		MyQueue q1=new MyQueue(size);
		System.out.println("Enter no of Elements:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element:");
			ele=sc.nextInt();
			q1.enQueue(ele);
			if(i>size-1)
			{
				q1.deQueue();
				q1.enQueue(ele);
			}
			q1.display();
		}

	}

}
