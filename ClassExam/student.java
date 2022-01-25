package ClassExam;

class Test{
	// 객체의 속성(맴버변수)
	public String stuName;
	public int stuID;
	//객체의 기능(메서드)
	// 1. 학생의 정보를 보는 메서드
	public void showStudentInfo() {
		//변수명(함수명) 사용시의 표기법 
		// 1. pascalCase(파스칼 표기법) ★★★★★
		//    - 단어사이사이 마다 대문자로 표기함으로써 단어를 구분
		// 2. camelCase(카멜표기법) ★★★★★
		//    - 첫글자 제외 단어 사이사이마다 대문자로 표기함으로써 단어를 구분.
		// 3. snake_Case(스네이크표기법(언더바/언더스코어 표기법)) ★★★★★
		//    - 단어 사이사이마다 _로 표기함으로써 단어를 구분.
		
		System.out.println(stuName + stuID);
		
	}
	
	public String getStudentName() {
		return stuName;
	}
}



public class student {

	public static void main(String[] args) {
		//위에서 생성해둔 Test 클래스의 객체를 생성.
		Test stuLee = new Test();
		stuLee.stuName = "이지은";
		stuLee.stuID = 001;
		
		stuLee.showStudentInfo();
		
		
	}
}
