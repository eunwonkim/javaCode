package makeUpClass;

class Salary{
	String name;
	int salary;
	
	Salary(String name, int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void getInfomation1() {
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("���� : %s\n", salary);
	}
}

class Test34 extends Salary{
	String department;
	
	public Test34(String name, int salary, String department){
		super(name, salary);
		this.department = department;
	}
	
	void getInfomation2() {
		System.out.printf("�μ� : %s\n", department);
	}
}

public class Homework_0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test34 ob = new Test34("��ö����", 85000000, "ö���");
		ob.getInfomation1();
		ob.getInfomation2();

	}

}
