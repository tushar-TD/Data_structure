package Integer;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.createLinkedList(9);
		l1.display();
		
		int no,ch,pos;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("*************************************");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Count");
			System.out.println("4.Modify");
			System.out.println("5.Split In Even And Odd");
			System.out.println("6.Display");
			System.out.println("0.Exit");
			System.out.println("Enter Choice:");
			ch=sc.nextInt();
			//System.out.println("After Exceuting The Choice--->");
			switch(ch)
			{
			case 2:
				System.out.println("Data To Deleted:");
				no=sc.nextInt();
				l1.deleteNode(no);
				break;
			case 6:
				l1.display();
				break;
			case 1:
				System.out.println("Position To Enter:");
				pos=sc.nextInt();
				System.out.println("Data To Enter:");
				no=sc.nextInt();
				l1.insert(pos,no);
				break;
			case 3:
				System.out.println("Count="+l1.count());
				break;
			case 4:
				System.out.println("Position To Modify:");
				pos=sc.nextInt();
				System.out.println("New Data:");
				no=sc.nextInt();
				l1.modify(pos, no);
				break;
			case 5:
				l1.split();
				break;
			}
		}while(ch!=0);
		
	}

}
