package ClassExam;

    class Person{
	//final String nation = "대한민국";
    	final String nation;
	static final String SSN = "884445-1255548"; //주민번호를 상수방식으로 선언.
	String name;
	
	public Person(String nation, String name) {
		this.nation =nation;
	   this.name = name;
		
	}
}

public class FinalExample {

	public static void main(String[] args) {
		Person p1 = new Person("김코딩","이집트");
	    Person p2 = new Person("박코딩","수단");
	    
        System.out.println(p2.nation);
	
		//상수는 클래스명, 필드명 형식으로 호출
        System.out.println();
		
		System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
		System.out.println(p1.name);
		//System.out.println(p1.ssn);
		System.out.println(p1.nation);
		
	}

}
