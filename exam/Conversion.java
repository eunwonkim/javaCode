package exam;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ������(����ȯ)
		// ���� �ٸ� �ڷ����� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ°�
		
		// ������ �� ��ȯ(�ڵ� �� ��ȯ)
		//String test = "result :";
		
		//int a = 10;
		//int b = 20;
		
		//System.out.println(test+(a+b));
		
	
		// ����� �� ��ȯ(���� �� ��ȯ)
		String num = "1234";
		//int tset = num; // ������ ����ȯ�� ����ϰ� �ٷ� �����ǰ��� �־������ ����.
	    int test = Integer.parseInt(num);
		System.out.println(test);

		
		
		//������ �����͸� ���������� �ٲٱ�
        int n = 123;
        String a = String.valueOf(n);
        String b = Integer.toString(n);
        System.out.println(a);
        System.out.println(b); 
        
        // �Ǽ��� �߰����� & Ÿ�Ժ�ȯ
        // �ֱ� �Ǽ�Ÿ���� ������ ����Ҷ��� float ���� double�� ���� ���
        // ���� : �ֱٿ��� �⺻������ ��ǻ���� �޸� �뷮�� ������ ū���̶�
        //       double�� ����ϴ°��� �δ��� ����.
        float c = 123.45f; // -> �ǹ����� �������� ��ɾ�
        System.out.println(c);
        
        double d = 123.45; // -> �� �ǹ����� ���̾��� ��ɾ� 
        System.out.println(d);
        
        // double���� ����� Ÿ�� ��ȯ
        int testDb = 11;
        int testDb2 = 3;
        
        // ������ 3.0 : ���� (java���� int�� ������ ������� ���� int������ ���)
        double result2 = (double) testDb / testDb2;
        System.out.println(result2);
    
        
	}

}
