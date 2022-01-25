package java0120;

public class Test34 extends Salary{

       String department;

       
       
       public Test34(String name, int salary, String department) {
           super(name, salary);
           this.department = department;
    }
	
	public void getInfomation2() {
		System.out.println("ºÎ¼­ : " + department);
		
	}

}


