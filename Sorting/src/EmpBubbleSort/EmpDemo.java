package EmpBubbleSort;

import java.util.Scanner;

public class EmpDemo {

	public static void BubbleSort(Employee e[])
	{
		int i,j,cnt=0;
		Employee temp;
		int size=e.length;
		for(i=0;i<size-1;i++)
		{
			for(j=0;j<size-1-i;j++)
			{
				if(e[j].getSalary()>e[j+1].getSalary())
				{
					cnt++;
					temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
		
	}
	public static void display(Employee e[])
	{
		System.out.println("---------------->");
		for(int i=0;i<e.length;i++)
			System.out.println("  "+e[i]);
		System.out.println();
		System.out.println("<----------------");
		
	}
		public static void main(String[] args) {
			/*Employee e;
			int empno;
			String ename;
			int deptno;
			int salary;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter empno,ename,deptno,salary");
			empno=sc.nextInt();
			ename=sc.next();
			deptno=sc.nextInt();
			salary=sc.nextInt();
			e=new Employee(empno, ename, deptno, salary);
			System.out.println(e);
			*/
			Employee e[]=new Employee[3];
			e[0]=new Employee(1, "Shivam", 5, 10000);
			e[1]=new Employee(2, "Suraj", 5, 7500);
			e[2]=new Employee(3, "Shri", 5, 8000);
			display(e);
			BubbleSort(e);
			System.out.println("*******************************************************************");
			System.out.println("After Sorting:-");
			display(e);
		}

	}


