package ClassExam;

    class Person{
	//final String nation = "���ѹα�";
    	final String nation;
	static final String SSN = "884445-1255548"; //�ֹι�ȣ�� ���������� ����.
	String name;
	
	public Person(String nation, String name) {
		this.nation =nation;
	   this.name = name;
		
	}
}

public class FinalExample {

	public static void main(String[] args) {
		Person p1 = new Person("���ڵ�","����Ʈ");
	    Person p2 = new Person("���ڵ�","����");
	    
        System.out.println(p2.nation);
	
		//����� Ŭ������, �ʵ�� �������� ȣ��
        System.out.println();
		
		System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
		System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
	}

}
