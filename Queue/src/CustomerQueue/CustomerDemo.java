package CustomerQueue;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		int ch;
		int id;
		String name;
		String city;
		MyQueue q1=new MyQueue(5);
		CustomerQueue ele;
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
				System.out.println("Enter Elements ");
				id=sc.nextInt();
				name=sc.next();
				city=sc.next();
				ele=new CustomerQueue(id, name, city);
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
				System.out.println("Deleted element :"+ele);
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
