package InterFaceExam;

//implements�� ���߻���� ��ü�Ҽ� ����
public class Samoade implements Doggy2{
	
	private String name;
	
	public Samoade(String name) {
		//�������̽��� super Ű���尡 �ʼ��� �ƴϴ�.
		this.setName(name);
	}

	@Override
	public void palying() {
		// TODO Auto-generated method stub
		System.out.println("�پ�����");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("zzzzzzzZZZZZZ");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�ͱ��ͱ�");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
