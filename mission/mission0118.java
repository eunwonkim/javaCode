package mission;

class Salary{
	String name = "��ö����";
	int salary = 85000000;
      public Salary(String name, int s, int salary) {
	    	this.name = name;
	    	this.salary = salary;
	    }
      public void name() {
	}
      public void salary() {
  	}
	
      
class Test34 extends Salary{

	public Test34(String name, int s, int salary) {
		super(name, s, salary);
	}
	public void name(){
    	System.out.println("��ö����");
}     
	

}
      
}





