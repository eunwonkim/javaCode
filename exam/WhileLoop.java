package exam;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ݺ���
		// ���α׷������� �Ȱ��� ����� ���� Ƚ�� �ݺ��Ͽ� �����ϵ���
		// �����ϴ� ��ɹ��̴�.
		// ���α׷��� ó���ϴ� ��κ��� �ڵ�� �ݺ����� ���°� ����
		// ���� ���� ����ϴ� ���
		// 1. while��
		// 2. do/while��
		// 3. for��
		// 4. Enhanced for��
		
		// �ݺ��� ��¥ �ʿ��ұ�?
		// �ݺ����� ���� ���ʿ��� �۾��� �ּ�ȭ �Ҽ� ����
		
		// while
		// Ư���� ������ �����Ҷ����� ����ؼ� �־��� ��ɹ��� �ݺ� ����.
		
		//			���ǽ��� ����� ���ε��� �ݺ������� �����ϰ��� �ϴ� ��ɹ�.
		//		while(���ǽ�) {
		//		}
		
		// while�� ���� ���ǻ���
		// while���� ������ ���ε��� ��� �����ϴ� �ݺ��� �̱� ������
		// ���� ���������� ��Ȯ���� �ʴٸ� ���� ���� �ݺ��Ѵ�.
		// while�� ���ÿ��� �ݵ�� ���������� �� �޾��־�� �Ѵ�.
//		int a = 0;
//		while(a<10) {
//			System.out.println("���� ��� �������̾�~");
//		}
		
		// while���� �������� �ο���� 1
		// while���� ��Ʈ���� ������ �����ϰ�
		// �� ������ ���� �ݺ����� �������Ѽ� �ᱹ���� false ������ 
		// ������ �� �ֵ��� ó���Ѵ�.
//		int a = 0;
//		while(true) {
//			if(a==10) 
//			a++;
//			System.out.printf("���� ��� �������̾�~ %d", a);
//			System.out.println();
//			
//			
//		}
//		
//	}
		
// while���� ����
// ������ �Ϸ����!(Ŀ�� Ÿ����)
// �Ϸ��� Ŀ�Ǽ����� 5���� �����ϰ�
// ���� Ŀ�ǰ� �� �ȸ��� ���α׷��� ����.
// Ŀ�Ǹ� �� �Ⱦ����� �׳��� ���� ���� ����� ���.
   Scanner s = new Scanner(System.in);
   int coffee = 5;
   int money = 0;
   int result = 0;
   while(coffee > 0) {
	   System.out.println("�մ��� �Խ��ϴ�. Ŀ�Ǹ� �󸶿� �Ľðڽ��ϱ�?");
	   money = s.nextInt();
	   coffee--;
	   System.out.println("���� Ŀ���� ����"+coffee+"�� �Դϴ�.");
	   money +=money;
	 }
    	
     System.out.printf("���� ���� �ݾ� : %d " , money);
    
		
		
	}
}

