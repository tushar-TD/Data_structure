package IntegerDoubly;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.createLinkedList(7);
		l1.display();
		int no,ch,pos;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("*************************************");
			System.out.println("1.Insert Node");
			System.out.println("2.Print Reverse");
			System.out.println("3.Delete");
			System.out.println("4.Count");
			System.out.println("5.Split");
			System.out.println("6.Display");
			System.out.println("Enter Choice:");
			ch=sc.nextInt();
			System.out.println("After Exceuting The Choice--->");
			switch(ch)
			{
			case 1:
				System.out.println("Enter Position:");
				pos=sc.nextInt();
				System.out.println("Enter Data:");
				no=sc.nextInt();
				l1.insert(pos, no);
				break;
			case 2:
				l1.printReverse();
				break;
			case 3:
				System.out.println("Data To Delete:");
				no=sc.nextInt();
				l1.delete(no);
				break;
				/*System.out.println("Position:");
				pos=sc.nextInt();
				l1.delete(pos);
				break;*/
			case 4:
				System.out.println("Count="+l1.count());
				break;
			case 5:
				l1.split();
				break;
			case 6:
				l1.display();
				break;
			}
		}while(ch!=0);
	}
}
