package java0119;

 
public class EnumAndSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //enum : �ǹ��ִ� ����� �����ϰ� ���α׷��� �������� ���� ���Ǵ�
		//       singleton�� ����.
		// singleton : �ν��Ͻ� ���� ������ �ϳ�.
		//			   �ν��Ͻ��� �ѹ� �����ϰ� �ν��Ͻ��� ������
		// 			   ���� �޼��忡�� �����Ͽ� ����ϴ� ����				
		// �̱��� ������ new Ű����� �ν��Ͻ��� �������� ���ϰ� �Ѵ�.
		// �׿� ���ÿ� �ν��Ͻ��� �����Ҽ� �ִ� Ư���� ���� �޼��带 ���ؼ���
		// �ν��Ͻ��� �����ϵ��� ó���ϰ� �ν��Ͻ���
		// ���������� �����Ͽ� �ν��Ͻ��� �����Ҽ� �ֵ��� �Ѵ�.
		
		// ���信���� ���ϴ� ������ �����ϴ� ���α׷�
		// ���ĺ��� �ڵ带 �ο��ϰ� 
		// �ش� �ڵ带 ���ý� ������ ���������� 
//		int choice=0;
//		if(choice==0) {
//			System.out.println("Į����");
//		}else if (choice==1) {
//			System.out.println("ġŲ");
//		}else if (choice==2) {
//			System.out.println("������");
//		}else {
//			System.out.println("���� ����");
//		}
	
	
	// �޼��带 ȣ���ؼ� ����� ����ϴºκ��� ������ ����.
	// but �����ε� ��� �μ��� ���޹����� �־ ������ ���� ������
	// �������� �߻��Ҽ� �ִ�.
    
	
		
	Person person = new Person();
	person.choice(FoodCategory.PIZZA);
	
	// ��� ���� �޼���
		//name : enum ����� ���ǵ� �̸��� ����.
	//System.out.println(FoodCategory.KAL.name);
	// ordinal : enum ����� ���ǵ� ������ ����
	//System.out.println(FoodCategory.KAL.ordinal);
	System.out.println(FoodCategory.CHICKEN.price);
	System.out.println(FoodCategory.CHICKEN.name);
	
	// enum�� �����ڴ� �⺻������ private
	
	// �̱��� �������� �ۼ��� Ŭ�������� �ν��Ͻ� �����ϱ�.
	
	// �̱��� ����� ���� : �����Ǵ� �ν��Ͻ����� ������ �������� �����ϱ⶧����
	//                  �޸� ������ �����Ҽ� �ִ�.
	
	// �ν��Ͻ� ������ �����Ͽ� ����ϰų� �޼��带 ������ �Ϲ����� Ŭ����ó��
	// ����Ҽ��� �ִ�.
	
	// �ν��Ͻ��� ������ ���� �����Ѵٸ�
	// ���� ������ ���� �޼���� ���� �������.
	Configuration con1 = Configuration.getInstance();
	Configuration con2 = Configuration.getInstance();
	
	System.out.println(con1.getTest1Name());
	System.out.println(con2.getTest2Name());
	}
	
}
