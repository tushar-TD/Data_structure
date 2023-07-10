package StackPostFixed;

public class PostFixedDemo {

	static char ch;
	static int n1;
	static int n2;
	public static int isCanPop(int n1,int n2,char ch) {
		int ans=-1;
		if(ch=='+')
			ans=n1+n2;
		else if(ch=='-')
			ans=n1-n2;
		else if(ch=='*')
			ans=n1*n2;
		else if(ch=='/')
			ans=n1/n2;
		return ans;
	}
	
	
	public static void main(String[] args) {
		String a=new String("257+-");
		boolean flag=true;
		MyStack m=new MyStack(a.length());
	
		for(int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			if(ch>='0' && ch<='9')
				{
					
					m.push(Character.getNumericValue(ch));
					m.display();
				}
			else if(ch=='+' ||ch=='-' ||ch=='*' ||ch=='/')
			{
				n2=m.pop();
				n1=m.pop();
				int ans =isCanPop(n1,n2,ch);
				
				m.push(ans);
				m.display();
			}
		}
		int k=m.pop();
		System.out.println("Final answer:");
		System.out.println(k);
		System.out.println("Complete");
		
		
	}
}
