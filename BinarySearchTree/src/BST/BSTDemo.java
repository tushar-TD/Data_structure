package BST;

import java.util.Scanner;

class Node
{
	Node left,right;
	int data;
	public Node(int data)
	{
		left=right=null;
		this.data=data;
	}
	@Override
	public String toString() {
		return " "+data;
	}
}
class BinarySearchTree
{
	Node root;
	public BinarySearchTree()
	{
		root=null;
	}
	public void addNode(int data)
	{
		Node record=new Node(data);
		if(root==null)
		{
			root=record;
			System.out.println("Root Has Been Created.");
			return;
		}
		Node move=root;
		while(true)
		{
			if(record.data<move.data)
			{
				if(move.left==null)
				{
					move.left=record;
					System.out.println("Added At Left of "+move.data);
					break;
				}
				else 
					move=move.left;
			}
			else if(record.data>move.data)
			{
				if(move.right==null)
				{
					move.right=record;
					System.out.println("Added At Right of "+move.data);
					break;
				}
				else
					move=move.right;
			}
			else
			{
				System.out.println("Not Valid.");
				break;
			}
		}
	}
	public void inorder(Node move)
	{
		if(move!=null)
		{
			inorder(move.left);
			System.out.print(" "+move.data);
			inorder(move.right);
		}
	}
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(" "+move.data);
			preorder(move.left);
			preorder(move.right);
		}
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.left);
			postorder(move.right);
			System.out.print(" "+move.data);
		}
	}
	public void display()
	{
		System.out.println("Inorder Binary Search Tree:-");
		System.out.print("----->  ");
		inorder(root);
		System.out.println();
		System.out.println("Preorder Binary Search Tree:-");
		System.out.print("----->  ");
		preorder(root);
		System.out.println();
		System.out.println("Postorder Binary Search Tree:-");
		System.out.print("----->  ");
		postorder(root);
		System.out.println();
	}
	public int findLargest()
	{
		Node move=root;
		while(move.right!=null)
			move=move.right;
		int max=move.data;
		return max;
	}
	public int findSmallest()
	{
		Node move=root;
		while(move.left!=null)
			move=move.left;
		int min=move.data;
		return min;
	}
	public void delNode(int data)
	{
		Node temp,tag=root;
		for(temp=root;temp!=null && temp.data!=data; )
		{
			tag=temp;
			if(data>temp.data)
				temp=temp.right;
			else
				temp=temp.left;
		}
		if(temp.right==null)
		{
			if(temp.data>tag.data)
				tag.right=temp.left;
			else
				tag.left=temp.left;
		}
		if(temp.left!=null)
		{
			if(temp.right!=null)
			{
				Node t;
				for(t=temp.right;t.left!=null;t=t.left);
				t.left=temp.left;
			}
			if(temp.data<tag.data)
				tag.left=temp.right;
			else
				tag.right=temp.right;
		}
	}
	public boolean search(int data)
	{
		boolean flag=false;
		Node temp;
		for(temp=root;temp!=null;)
		{
			if(temp.data==data)
			{
				flag=true;
				break;
			}
			if(temp.data>data)
				temp=temp.left;
			else
				temp=temp.right;
		}
		if(temp==null)
			flag=false;;
		return flag;
	}
	
}
public class BSTDemo {
	public static void main(String[] args) {
		int data,ch;
		BinarySearchTree t=new BinarySearchTree();
		BinarySearchTree t1=new BinarySearchTree();
		Scanner sc=new Scanner(System.in);
		int arr[]= {100,125,150,175,25,60,90,10,8};
		for(int i=0;i<arr.length;i++)
		{
			t1.addNode(arr[i]);
		}
		t1.display();
		do
		{
			System.out.println("1.Add Node");
			System.out.println("2.Largest Value");
			System.out.println("3.Smallest Value");
			System.out.println("4.Delete");
			System.out.println("5.Search");
			System.out.println("6.Display");
			System.out.println("0.EXIT");
			System.out.println(" Enter Your choice ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Data ");
				data=sc.nextInt();
				t.addNode(data);
				break;
			case 2:
				System.out.println("Largest Value In BST:"+t1.findLargest());
				break;
			case 3:
				System.out.println("Smallest Value In BST:"+t1.findSmallest());
				break;
			case 4:
				System.out.println("Data To Deleted:");
				data=sc.nextInt();
				//t.delNode(data);*/
				t1.delNode(data);
				break;
			case 5:
				System.out.println("Data To Search:");
				data=sc.nextInt();
				System.out.println(""+t1.search(data));;
				break;
			case 6:
				//t.display();
				t1.display();
				break;
			}
		}while(ch!=0);
		
	}
}
