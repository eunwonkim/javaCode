package mission;

class Phone{
	public String kew;
	public String color;
	
	public Phone(String kew, String color) {
		this.kew = kew;
		this.color = color;
	}
	//기능은 전원키기, 끄기
	void power() {
		System.out.println("전원 키키, 끄기");
	}
	//-벨울리기
	 void sound() {
		System.out.println("벨울리기");
	}
	//전화하기
	 void Calling() {
		System.out.println("전화하기");
	}
	
	//-전화종료하기
	 void callout() {
		System.out.println("전화종료하기");
	}
}

class SmartPhone extends Phone{

	public int brow;


	public SmartPhone(String name, String phone, int brow) {
		super(name, phone);
		this.brow = brow;
		 public void() {
	System.out.println("스마트폰 브라우저 실행");
	    
	
}
	}
public class lunCh0118 {

	public static void main(String[] args) {
// 다음의 조건을 만족하는 클래스와 메서드, 필드를 만드세요

//1.Phone 클래스를 상속받는 SmartPhone 클래스 생성

//2. Phone 클래스의 기본 필드는 모델명과 색상
//    - 아래의 기능은 메세지로 처리한다(필드선언이 아닌)
//    - 기능은 전원 키기, 끄기
//    - 벨울리기
//    - 전화하기
//    - 전화종료하기

//3. SmartPhone 클래스(phone 클래스의 필드를 사용해야함)
//    - 스마트폰 브라우저 실행(필드)
//    - 기능은 인터넷 실행하기
//    - 카카오톡 실행하기
		
//위와 같이 클래스와 필드, 메서드를 선언하고
//해당기능들을 main에서 사용해보세요
//파일명 : lunchquiz0118

		
	}

}

