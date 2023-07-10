package BT;

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
class BinaryTree
{
	Node root;
	public BinaryTree()
	{
		root=null;
	}
	public void addNode(int data)
	{
		Scanner sc=new Scanner(System.in);
		Node record=new Node(data);
		if(root==null)
		{
			root=record;
			System.out.println("Root Has Been Created.");
			return;
		}
		Node move=root;
		String ans;
		while(true)
		{
			System.out.println(" Left or right of "+move.data);
			ans=sc.next();
			if(ans.equals("left"))
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
			else if(ans.equals("right"))
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
}
public class BTDemo {

}
