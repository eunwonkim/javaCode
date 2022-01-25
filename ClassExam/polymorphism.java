package ClassExam;


// abstract 클래스 : 추상클래스
// 추상화를 좀 더 구체적으로 도와주는 키워드
public abstract class Doggy{
	//필드 : 색깔
    public String color;
    
    public Doggy(String color) {
    	this.color = color;
    }
     
    // 추상메서드 ->이름 말뚝박기
    // 추상메서드는 메서드 명, 리턴타입(void), 파라미터만 선언하고 내용은 정의하지 않음.
    // 내용정의는 하위 클래스에서 재정의하여 사용.
    public abstract void bite(); 
    public abstract void eat();
    
    public void bowwow(){
    	System.out.println("왈왈");
    }
}

// 추상클래스를 상속받는다면
//추상클래스의 추상메서드를 반드시 오버라이딩 해야한다.
class Huskey extends Doggy{
	public Huskey(String color) {
	  super(color);
	
}

 public void bite() {
	 
 }

 
class Sibardog extends Doggy{
	public Sibardog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("헤엄치기!");
	}

	public void bite() {
		// TODO Auto-generated method stub
		
	}

	public void eat() {
		// TODO Auto-generated method stub
		
	}
}


@Override
public void eat() {
	// TODO Auto-generated method stub
	
}
		

    

//public class polymorphism {
//
//	public static void main(String[] args) {
//		
//		 객체의 형변환 -> 바꾼 자료형으로 사용하겠다.
//		 - 인스턴스가 변하는 것은 아니다.
//		
//		 Dog d1 = new Dog();
//		 GoldenRetriever d2 = new GoldenRetriever();
//		 아래의 코드는 개는 리트리버다 라고 얘기하는것과 같음
//		 GoldenRetriever d2 = (GoldenRetriever)d1;
//		
//		 비글은 개다 라고 얘기하는것과 같음.
//		 객체의 형변환
//		Dog dd = new Viggle();
//		Viggle v1 = (Viggle)dd;
		
//		 리트리버는 개다
//		 개는 리트리버다
//		
//		 다형성 
//		 객체지향 언어의 특성중 하나
//		 여러가지 형태에 속할수 있는 성질이란 뜻으로
//		 하나의 객체 인스턴스가 여러가지 자료형을 가질수 있는것.
		
		// is-a
		// 1. 산소는 기체이다
		// 2. 사모에드는 개다
		// 3. 코리안숏헤어는 고양이다.
		// 4. 프로그래밍 언어는 JAVA다. --x
		
		// 문제
		// 부모클래스 DOG를 상속받는 
		// Viggle 클래스와 GoldenRetriver 클래스를 생성하시고
		// 이중 GoldenRetriver 클래스는 수영을 할수 있다 가정하고
		// swim 메서드를 추가하세요
		
		// Dog 클래스의 기본기능
		// 필드 : 색깔
		// 기본 행동 : 깨물기, 밥먹기, 짖기, ->sysout으로 "메세지만찍기"
		
		// instanceof
		// 해당 인스턴스가 특정 클래스의 인스턴스인지 확인하는 연산자
		// (변수명or 인스턴스명) instanceof (클래스명)
//		Dog dog = new GoldenRetriever();
//		
//		System.out.println(dog instanceof GoldenRetriever); //true
//		System.out.println(dog instanceof Dog); // true
//		System.out.println(dog instanceof Viggle); // false
//      }
		
	Huskey dog1 = new Huskey("검정색");	
	dog1.bite();
	
	Sibardog dog2 = new Sibardog("갈색");
	dog2.eat();
	
	Doggy dog3 = new Huskey("흰색");
	dog3.bite();
	
}
