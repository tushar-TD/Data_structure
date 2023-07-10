package SortedLinkedList;

import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		int no;
		int pos;
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		/*while(true)
		{
			System.out.println("Enter Integer Value:");
			no=sc.nextInt();
			if(no<0)
			{
				System.out.println(" Not Valid Entry.");
				break;
			}
			l.addNode(no);
		}
		l.display();*/
		
		LinkedList l2=new LinkedList();
		
			System.out.println("Enter Length Of Linked List:");
			pos=sc.nextInt();
			for(int i=0;i<pos;i++)
			{
			System.out.println("Enter Data:");
			no=sc.nextInt();
			l2.addNode(pos,no);
			}
			l2.display();
		
		
			/* LinkedList l3=new LinkedList();
			l3.createLinledList(5);
			l3.display();
			l3.sort();
			l3.display();*/
		
		
		
	}
	

}
