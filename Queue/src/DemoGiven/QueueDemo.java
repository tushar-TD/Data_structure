package DemoGiven;

import java.util.Scanner;

public class QueueDemo {
	public static void main(String[] args) {
		int ch;
		MyQueue q1=new MyQueue(5);
		int ele;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Enqueue ");
			System.out.println("2. Dequeue ");
			System.out.println("3. Display ");
			System.out.println("0. Exit ");
			System.out.println("Enter Your Choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Etner Element ");
				ele=sc.nextInt();
				try
				{
					q1.enQueue(ele);
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
				ele=q1.deQueue();
				System.out.println("Delete element Is "+ele);
				}
				catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
				q1.display();
				}catch(QueueException e) {
				System.out.println(e.getMessage());}
				break;
			}
			
		}while(ch!=0);
	}

}
