package StackBook;

import java.util.Scanner;

public class BookDemo {

	public static void main(String[] args) {
			  Book ele=null;
			  MyStack s1=new MyStack(5);
			  int bno;
			  String name;
			  double price;
			  int ch=1;
			  Scanner sc=new Scanner(System.in);
			  do
			  {
				  System.out.println("1. Push");
				  System.out.println("2. Pop");
				  System.out.println("3. Display");
				  System.out.println("0. Exit");
				  System.out.println("Enter your chocie ");
				  ch=sc.nextInt();
				  switch(ch)
				  {
				  case 1:
					  System.out.println("Enter Book No Name and Price ");
					  bno=sc.nextInt();
					  name=sc.next();
					  price=sc.nextInt();
					  ele=new Book();
					 // s1.push(ele);
					  s1.push(new Book(bno,name,price));
					  break;
				  case 2:
					  ele=s1.pop();
					  if(ele==null)
						  System.out.println("Stack Is Empty ");
					  else
						 System.out.println(ele);
					  break;
				  case 3:
					  s1.display();
					  break;
					  
					  
				  }
				  
			  }while(ch!=0);
			  
				
			}





}
