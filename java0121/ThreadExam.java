package java0121;


public class ThreadExam{


	public static void useThread() {
		
		try {
			long startTime = System.currentTimeMillis();
			// ����ؾ� �� �۾� �и�
			ThreadCore task1 = new ThreadCore(0, 500000000);
			Thread thread1 = new Thread(task1);
			ThreadCore task2 = new ThreadCore(500000001, 1000000000);
			Thread thread2 = new Thread(task2);
			// �����尡 �ϴ��� : ���μ����� �������� �����尡 ������ �۾� 
			//���� �����带 ����.
			thread1.start();
			thread2.start();
			
			// ���� ������ �۾��� ������ ���� ���.
			thread1.join();
			thread2.join();
			
			System.out.println(task1.getsum() + task2.getsum());
			
			long endTime = System.currentTimeMillis();
			System.out.println("�ɸ��ð�:" +(endTime - startTime));
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void notUseThread() {
//		long startTime = System.currentTimeMillis();
//		long sum = 0;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// ������ : ���μ������� �ڿ��� ����� ����Ǵ� �帧�� ����
		
		// ���μ��� : ���α׷��� ����� ����

		// ���α׷��� �ϳ� �Ǵ� �� �̻��� ���μ����� ��Ҽ� �ִ�.
		// �Ϲ����� �ڹ����α׷��� �ϳ��� ���μ����� �ϳ��� ������� �
		
		// �ֱ� ����Ʈ������߿� ��Ƽ�����带 ����ϴ� ��쵵 ��������.
		
		//�ϳ��� �����带 ����ؼ� 0���� ~ 10������� ¦���� ���ϴ� ���α׷�
		useThread();
		
		// ������
		// ���� �۾��� ���� �� ������ ��ٸ� ��
		// ���� �۾��� �����ϴ°�.
		
		// �񵿱���
		// ���� ��ɸ� ������ ���� �۾��� ���� �ϴ°�.
		
		// �ǽ������� ��
		// ���� �����尡 �� �����带 �����ϰ� �� �����带 �����Ų �� 
		// �ٷ� �ؿ� �ִ� ������� ����ϴ� ���¿���.
		
		// ������
		// �ش� ������ �����帧�� ���ÿ� ����ǰ� �ִ°�.
		
		
		// ��ǻ�ʹ� �������� CPU�� ������ �� �ִ�.
		// CPU�� �������� �����ϴ� ��츦 ��Ƽ���μ��� ��� �θ�.
		// �ټ��� ���μ����� ���������� ���� ó���ϴ� ���� ��Ƽ ���μ����̶� �Ѵ�.
		
		// core -> �����ϴ� ���� -> 0, 1�� ��� ����Ī�ؼ� ������ ����.
		                         //-> Ŭ�� Ŭ���� �������� Hz
		// 2.8Ghz (1�ʴ� 28��)
		
		// �ϵ���� ������ 
		// cpu�� core ������ thread�� ���Ѵ�.
		// 1core -> 1thread -> (SMT) �Ϲݽ����� + ���󽺷��� 1core 2thread
		
		// ����Ʈ���� ������
		// Ŀ�η��� ������
		// �������� ������
		
		// �ڹٿ��� ������ ���
		// java8���������� ����� ���� ������� �Ⱦ�.
		// jvm�� ���� OS�� ���� �ý��� ���� ȣ��
		// -> �� �� Ŀ�� �����带 �Ҵ����
		Thread thread1 = new Thread(runnable);
		// start �޼��尡 ȣ��Ǹ� �������� Ŀ�ν����� ��û.
		thread1.start();
		
	}

	

}
