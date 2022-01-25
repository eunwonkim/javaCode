package mission;

class Phone{
	
	String model;
	String color;
	SmartPhone(String model, String color);{
		this.model = model;
		this.color = color;
	}
	void switchOn() {
		System.out.println("전원ON 하이 빅스비");
	}
	void switchOFF() {
		System.out.println("전원 OFF ㅂㅂ");
	}
	void ringdingdong() {
		System.out.println("띠리리리리리리리리리");
	}
	void call() {
		System.out.println("여보세요 중국집이죠?");
	}
	void calloff() {
		System.out.println("아 아니에요 ㅈㅅ");
	}
}
class SmartPhone extends Phone{
	String browser;
	SmartPhone(String model, String color,String browser){
		super(model, color);
		this.browser = browser;
		
	}
	
	
}
public class lunchquiz0118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
