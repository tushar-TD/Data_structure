package Book;

import java.util.Scanner;

public class BookDemo {
	
	
	static int count =0;
	static Book b[]=new Book[25];
	
	
public static void add() { 
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	int price;
	
	//for(int i=0;i<b.length;i++)
	//{
		System.out.println("Enter book's id,name,price:");
		id=sc.nextInt();
		name=sc.next();
		price=sc.nextInt();
		b[count]=new Book(id,name,price);
		//count++;
//	}
	}
	public static void display() {
	for(int i=0;i<b.length;i++)
		if(b[i]!=null)
		System.out.println(b[i]);

	}
	public static void search(String str)
	{
		for(int i=0;i<b.length;i++) {
			if(str.equalsIgnoreCase(b[i].getName()))
			{
				System.out.println("Book Found");
				System.out.println(b[i]);
			}
		}
	}



	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		 int id,id1;
		  int price,price1;
		  String name,name1;
		int choice=1;
		do
		{
			System.out.println(" 1.Add ");
			System.out.println(" 2.Display ");
			System.out.println(" 3.Modify ");
			System.out.println(" 4.Search ");
			System.out.println(" 5.Count ");
			System.out.println(" 0.Exit ");
			System.out.println(" Enter Your Choice ");
			Scanner sc1=new Scanner(System.in);
			choice=sc1.nextInt();
			Book b[]=new Book[5];
			switch(choice)
			{
			case 1:
				add();
				break;
			case 2:
				display();
				break;
			case 3:
				 System.out.println("Enter book id want to modify");
	  			 id=sc.nextInt();
	  			 System.out.println("which details want to modify");
	  			 System.out.println("1.Id of book 2.Book name 3.Price of book");
	  			 choice=sc.nextInt();
	  			 for(int i=0;i<b.length;i++)
	  			 {
	  				if(id==b[i].getId())
	  				{
	  					if(choice==1)
	  					{
	  						System.out.println("Enter the new book id");
	  						id1=sc.nextInt();
	  						b[i].setId(id1);
	  					}
	  					if(choice==2)
	  					{
	  						System.out.println("Enter the new book Name");
	  						name1=sc.next();
	  						b[i].setName(name1);
	  					}
	  					if(choice==3)
	  					{
	  						System.out.println("Enter the new book Price");
	  						price1=sc.nextInt();
	  						b[i].setPrice(price1);
	  					}
	  				}
	  			 }
				
			case 4:
				System.out.println("What to search:");
				name=sc.next();
				search(name);
				break;
			case 5:
				System.out.println("Total Books:" +count);
				break;
				
			}
		}while(choice!=0);
		}
	}
		
		
		
