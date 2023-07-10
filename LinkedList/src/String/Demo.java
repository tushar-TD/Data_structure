package String;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int no,newno,ch,pos;
		String str = null;
		Scanner sc=new Scanner(System.in);
		LinkedList list1=new LinkedList();
		do
		{
			System.out.println("0.Exit");
			System.out.println("1.Add Beggining");
			System.out.println("2.Add End");
			System.out.println("3.Add Middle");
			System.out.println("4.Delete Beggening");
			System.out.println("5.Delete End");
			System.out.println("6.Delete Mid");
			System.out.println("7.Display Beggening");
			System.out.println("8.Display End");
			System.out.println("9.Display n th Node");
			System.out.println("10.Count");
			System.out.println("11.Modify");
			System.out.println("12.Search");
			System.out.println("13.Print Reverse");
			System.out.println("14.Reverse");
			System.out.println("15.Display");
			System.out.println("Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter String:");
				str=sc.next();
				list1.addNodeBeg(str);
				break;
			case 2:
				System.out.println("Enter String:");
				str=sc.next();
				list1.addNodeEnd(str);
				break;
			case 3:
				System.out.println("Enter String:");
				str=sc.next();
				System.out.println("Enter Position to Enter:");
				pos=sc.nextInt();
				list1.addNodeMid(str,pos);
				break;
			case 4:
				System.out.println("Deleted String:"+list1.deleteBeg());
				//list1.deleteBeg();
				break;
			case 5:
				System.out.println("Deleted String:"+list1.deleteEnd());;
				break;
			case 7:
				System.out.println("First Node:"+list1.showFirstNode());
				break;
			case 6:
				System.out.println("Enter String To Delete");
				str=sc.next();
				list1.deleteMid(str);
				break;
			case 8:
				System.out.println("End Node:"+list1.showLastNode());
				break;
			case 9:
				System.out.println("Enter Position to Shown:");
				pos=sc.nextInt();
				//list1.showNthData(pos);
				System.out.println("Data at "+pos+":"+list1.showNthData(pos));
				break;
			case 10:
				System.out.println("Count of Nodes:"+list1.countNode());
				break;
			case 11:
				System.out.println("Position to be Modified:");
				pos=sc.nextInt();
				System.out.println("New String to Add:");
				str=sc.next();
				list1.modify(pos, str);
				break;
			case 12:
				System.out.println("String To Search:");
				str=sc.next();
				list1.search(str);
				break;
			case 13:
				list1.printReverse(list1.head);
				break;
			case 14:
				list1.reverse();
				list1.display();
				break;
			case 15:
				list1.display();
				break;
			}
		}while(ch!=0);
	}
}
