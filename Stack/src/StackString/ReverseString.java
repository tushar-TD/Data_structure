package StackString;

public class ReverseString {
	public static void main(String[] args) {
	String a="";
	String str=new String("Hello");
	MyStack str1=new MyStack(str.length());
	for(int i=0;i<=str.length();i++)
	{
		str1.push(str.charAt(i));
	}
	/*for(int i=0;i<=str.length();i++)
	{
		a=str1.pop(str.charAt(i));
	}*/
}
}