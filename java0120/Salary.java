package java0120;

public class Salary {
   String name;
   int salary;
   
   Salary(String n, int s){
	   this.name = n;
	   this.salary =s;
   }
   void getInfomation1() {
	   System.out.println("�̸� : " + name);
	   System.out.println("���� : " + salary + "��");
   }
}
