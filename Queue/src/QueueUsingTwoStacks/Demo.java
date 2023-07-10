package QueueUsingTwoStacks;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int ch;
		MyStack q1=new MyStack(5);
		MyStack q2=new MyStack(5);
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
				System.out.println("Enter Element ");
				ele=sc.nextInt();
				try
				{
					q1.push(ele);
				}catch(QueueException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try
				{
					while(!q1.isEmpty())
						q2.push(q1.pop());
					ele=q2.pop();
					System.out.println("Deleted Element:"+ele);
					while(!q2.isEmpty())
						q1.push(q2.pop());
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


