package exam;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		// input
		// ���ݱ��� �����͸� ����Ϸ���?
		// ������ �Է¹޾� �ش� ������ ���뿡�� ó��.
	    // ������ scanner Ŭ������ �̿��ؼ� ���α׷� ����ڷκ��� �����͸�
		// �Է¹޴°͵� �����ϴ�.
		
		// Scanner �޼��� ���� 
		// boolean : nextBoolean()
		// byte : nextByte()
		// short : nextShort()
		// int : nextInt()
		// long : nextLong()
		// float : nextFloat()
		// double : nextDouble()
		// String : next(), nextLine()
		
		//�����͸� �Է¹ޱ����� Scanner ��ü ����
		Scanner in = new Scanner(System.in);
		
		// next, netLine �޼��带 �̿��ؼ� ����ڷκ��� �����͸� �Է¹���
		// next() : ������������ ���ڸ� �Է¹���
		// nextLine() : �Է��� ���� ��ü�� �Է¹���(����(Enter)�� �������� ó��)
		//String test = in.next();
		//String test2 = in.nextLine();
		
		// ���� �Է�
		System.out.println("�μ��� ���� ����ϴ� ���α׷��Դϴ�.");
		System.out.println("ù��° ���ڸ� �Է����ּ���");
		int num = in.nextInt();
		System.out.println("�ι�° ���ڸ� �Է����ּ���");
		int num2 = in.nextInt();
		//System.out.println(test);
	    //System.out.println(test2);
		
		// �� ���� �Է¹޾Ƽ� ��� ���ϱ�?
	    //int a = 10;
	    //int b = 20;
	    //System.out.println(a+b);
		
	    //System.out.println(num + num2);
	    int result = 0;
	    //System.out.printf("�μ��� ��: ");
	    //System.out.println(num+num2);
		// ex) 50, 60�� console�� Ÿ�����ϸ� �μ��� �� : 110�� ���´�.
	    
	    System.out.println("�μ��� �� : " + (num+num2));
		// ex) �̰� �� ����� ��� 
	    
	}

}
