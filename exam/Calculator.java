package exam;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� �����
		// ���� ��� �ּһ��� 
		// 1. �ּ� 2�� �̻��� ���ڸ� �Է¹�����(2���� ok)
		// 2. �Է¹��� 2���� ������ ��Ģ������ �����ؾ��Ѵ�.
		
		//2022/01/13 kew ���� ����߰�
		// �߰����� : ���꺰 ��� ����
		//	- ������ ������ ����ڰ� �Է��ϵ��� ó���ϼ���(��Ģ����)
		//	- �����ڰ� +,-<*, / �̿��� ���ڰ� ������
		// 	  �ش翬���� �����Ҽ� �����ϴ�.
		
		//�� ���
		//Scanner in = new Scanner(System.in);
		//System.out.println("ù��° ���ڸ� �Է����ּ���");
		//int num = in.nextInt();
		//System.out.println("�ι�° ���ڸ� �Է����ּ���");
		//int num2 = in.nextInt();
		//System.out.println("����° ���ڸ� �Է����ּ���");
		//int num3 = in.nextInt();
		
		//int result = 0;
		//System.out.println("������ �� : " + (num+num2+num3));
		//System.out.println("������ �� : " + (num-num2-num3));
		//System.out.println("������ �� : " + (num*num2*num3));
		//System.out.println("������ �� : " + (num/num2/num3));
		
		//����� ���
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �Դϴ�. ������ ��ȣ�� �Է����ּ���.");
		char code = in.next().charAt(0);
		System.out.println("ù��°�� �Է�");
		int a = in.nextInt();
		System.out.println("�ι�°�� �Է�");
		int b = in.nextInt();
		
		
		switch(code) {
		    case '+':
		    	System.out.println("�����");
		    	System.out.println("���� : " + (a+b));
		    	break;
		    case '-':
		    	System.out.println("�����");
		    	System.out.println("���� : " + (a-b));
		    	break;
		    case '*':
		    	System.out.println("�����");
		    	System.out.println("���� : " + (a*b));
		    	break;
		    case '/':
		    	System.out.println("�����");
		    	System.out.println("������ : " + (a/b));
		    	break;
		    default:
		    	System.out.println("�����ȣ�� �߸� �Է��߽��ϴ�.");
		}
		
		
		
		
		
		// ���� ��ɰ��� 1(����)
		// ���� a�� b���� ������ b-a�� �����ϼ���.		
		
	
		// ���� ��ɰ��� 2(����)
		// ���� a�� b���� ������ b/a�� �����ϼ���.

		
		
	}

}
