package exam;

import java.util.Scanner;

public class lunchQuiz0112 {

	public static void main(String[] args) {

        // ���� �Ż��� �Է¹޴� ���α׷��� �ۼ����ּ���.
		//�Է¹޴� ������ ������ �����ϴ�.
		// �̸�, ����, Ű(�Ҽ��� ����1�ڸ�����), ��ȭ��ȣ, ������
		// �������� ������ ���� ������ּ���.
		// �̸� : / ���� : / Ű : / ��ȭ��ȣ :  / ������ : /
		
		//kew Ÿ��
		//int a =33; //����
		//double b = 176.6; //Ű
		//double d = 54.7; //������
		
		
		//System.out.println("�̸� : kew");
		//System.out.println("���� : "+a);
		//System.out.println("Ű : "+b);
		//System.out.println("��ȭ��ȣ :");
		//System.out.println("������ :"+d);
	    
		//����� Ÿ��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �Է� ���α׷��Դϴ�.");
		System.out.println("������� �̸��� �Է����ּ���");
		String name = sc.nextLine();
		System.out.println("������� ���̸� �Է����ּ���. : ");
		int age = sc.nextInt();
		System.out.println("������� Ű�� �Է����ּ���. : ");
		float height = sc.nextFloat();
		sc.nextLine();
		System.out.println("������� ����ȣ �Է����ּ���.: ");
		String phone = sc.nextLine();
		System.out.println("������� ������ �Է����ּ���. : ");
		float weight = sc.nextFloat();
		
		System.out.println("�̸� : " +name);
		System.out.println("���� : " +age);
		System.out.println("Ű : " +height);
		System.out.println("����ȣ : " +phone);
		System.out.println("���� : " +weight);
		

		
		
	}
}

