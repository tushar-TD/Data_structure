package EmpBubbleSort;

public class Employee {
	int empno;
	String ename;
	int deptno;
	int salary;
	public Employee(int empno, String ename, int deptno, int salary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.deptno = deptno;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + ", salary=" + salary + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
