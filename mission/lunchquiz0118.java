package mission;

class Phone{
	
	String model;
	String color;
	SmartPhone(String model, String color);{
		this.model = model;
		this.color = color;
	}
	void switchOn() {
		System.out.println("����ON ���� �򽺺�");
	}
	void switchOFF() {
		System.out.println("���� OFF ����");
	}
	void ringdingdong() {
		System.out.println("�츮����������������");
	}
	void call() {
		System.out.println("�������� �߱�������?");
	}
	void calloff() {
		System.out.println("�� �ƴϿ��� ����");
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
