package ClassExam;


// abstract Ŭ���� : �߻�Ŭ����
// �߻�ȭ�� �� �� ��ü������ �����ִ� Ű����
public abstract class Doggy{
	//�ʵ� : ����
    public String color;
    
    public Doggy(String color) {
    	this.color = color;
    }
     
    // �߻�޼��� ->�̸� ���ҹڱ�
    // �߻�޼���� �޼��� ��, ����Ÿ��(void), �Ķ���͸� �����ϰ� ������ �������� ����.
    // �������Ǵ� ���� Ŭ�������� �������Ͽ� ���.
    public abstract void bite(); 
    public abstract void eat();
    
    public void bowwow(){
    	System.out.println("�п�");
    }
}

// �߻�Ŭ������ ��ӹ޴´ٸ�
//�߻�Ŭ������ �߻�޼��带 �ݵ�� �������̵� �ؾ��Ѵ�.
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
		System.out.println("���ġ��!");
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
//		 ��ü�� ����ȯ -> �ٲ� �ڷ������� ����ϰڴ�.
//		 - �ν��Ͻ��� ���ϴ� ���� �ƴϴ�.
//		
//		 Dog d1 = new Dog();
//		 GoldenRetriever d2 = new GoldenRetriever();
//		 �Ʒ��� �ڵ�� ���� ��Ʈ������ ��� ����ϴ°Ͱ� ����
//		 GoldenRetriever d2 = (GoldenRetriever)d1;
//		
//		 ����� ���� ��� ����ϴ°Ͱ� ����.
//		 ��ü�� ����ȯ
//		Dog dd = new Viggle();
//		Viggle v1 = (Viggle)dd;
		
//		 ��Ʈ������ ����
//		 ���� ��Ʈ������
//		
//		 ������ 
//		 ��ü���� ����� Ư���� �ϳ�
//		 �������� ���¿� ���Ҽ� �ִ� �����̶� ������
//		 �ϳ��� ��ü �ν��Ͻ��� �������� �ڷ����� ������ �ִ°�.
		
		// is-a
		// 1. ��Ҵ� ��ü�̴�
		// 2. ��𿡵�� ����
		// 3. �ڸ��ȼ����� ����̴�.
		// 4. ���α׷��� ���� JAVA��. --x
		
		// ����
		// �θ�Ŭ���� DOG�� ��ӹ޴� 
		// Viggle Ŭ������ GoldenRetriver Ŭ������ �����Ͻð�
		// ���� GoldenRetriver Ŭ������ ������ �Ҽ� �ִ� �����ϰ�
		// swim �޼��带 �߰��ϼ���
		
		// Dog Ŭ������ �⺻���
		// �ʵ� : ����
		// �⺻ �ൿ : ������, ��Ա�, ¢��, ->sysout���� "�޼��������"
		
		// instanceof
		// �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ����� Ȯ���ϴ� ������
		// (������or �ν��Ͻ���) instanceof (Ŭ������)
//		Dog dog = new GoldenRetriever();
//		
//		System.out.println(dog instanceof GoldenRetriever); //true
//		System.out.println(dog instanceof Dog); // true
//		System.out.println(dog instanceof Viggle); // false
//      }
		
	Huskey dog1 = new Huskey("������");	
	dog1.bite();
	
	Sibardog dog2 = new Sibardog("����");
	dog2.eat();
	
	Doggy dog3 = new Huskey("���");
	dog3.bite();
	
}
