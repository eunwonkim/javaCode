package ClassExam;

class Cat{
	String color = "����";
	
    public void sleep() {
    	System.out.println("zzzzzzzZZZZZZZZZ");
    }
	
    public void bite() {
    	System.out.println("�V");
    }
	
    public void eat() {
    	System.out.println("����� ��� �Դ���");
    }
    
}

class Lion extends Cat{
     String color = "����";
	//cat�� bite �޼��� �������̵�
	public void bite() {
		super.bite();
		System.out.println("�������� ���� ����");
	}
	
	public void eat() {
		System.out.println("�罿��Ƹ��� ����");
	}
}

public class OverridingExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �������̵� -> �켱���ϴ�
		// �θ� Ŭ������ ���ǵ� ���뺸�� �ڽ�Ŭ�������� ���ǵ� ������ �� �켱���Ѵ�.
		// ������ ������ ������ �١١١�
		
		
		// Lion cunsik = new Lion();
		// Cat streetCat = new Cat();
		// �������� �������̵�
		// �������̵�� �޼��尡 �����Ѵٸ� ������ �ν��Ͻ��� ���� ȣ��Ǵ�
		// ������ �޶�����.
		Lion cunsik = new Lion();
		Cat streetCat = new Lion();
		Cat strCat2 = new Cat();
		//Lion Ŭ������ ���ǵ� �޼��� eat ȣ��
		cunsik.eat();
		cunsik.bite();
		// Cat Ŭ������ eat ȣ��
		streetCat.eat();
		streetCat.bite();
		// �׷��ٸ� �θ�Ŭ������ �޼��带 ȣ���ϴ� ����� ���°�?
		// super.�޼����()
		
		// �޼����� �������̵� -> �ʵ嵵 �������̵� ����?
		System.out.println(cunsik.color); // ���� ->�ʵ尪 : Lion
		System.out.println(streetCat.color); // ����
		System.out.println(strCat2.color); // ����
	}

}
