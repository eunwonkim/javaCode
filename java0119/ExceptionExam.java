package java0119;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� : ���α׷� ������ �߻��ϴ� ����ġ ���� ��Ȳ. 
		// �ڹٿ��� ��� ����, ���ܴ� Throwable Ŭ������ ���� ó��
		// Throwable Ŭ������ ���� �̿������� ���� �幰��.
		
		// ���� �� �� �ִ� ���� ����
		// 1. OutOfMemoryError
		//  - �ڹ� ����ӽ� �޸𸮰� �����Ͽ� �ν��Ͻ� �Ҵ��� �Ұ����ϰ�
		//    ������ �÷��Ͱ� �޸𸮸� ����Ҽ� ������ �߻�.
		
		// Exception
		// ���α׷� ������ ����� �� �ִ� ������ �����Ǿ� ����ó���� ����������
		// �����ϰų� �� �ؾ��ϴ� Ŭ�������� ���� Ŭ����()
		// Exception���� Checked Exception�� Unchecked Exception�� �ְ�
		// Checked Exception���� �ݵ�� ����ó���� �ؾ� �������� �����ϴ�.
		
		// Checked Exception - ���������� ExceptionŬ������ ��ӹ޴� ���.
		// UnChecked Exception - RuntimeException Ŭ������ ��ӹ޴� ���.
		
		// Checked Exception - try catch ������ ����ؼ� �ۼ�.
//		try {
//			����, ������ �߻����� ������� ����� �ڵ�
//		}catch(Exception e) {
//			try ���ȿ��� ���ܰ� �߻��� ����� �ڵ�.
//		}
		// ����ó���� ��Ʈ���Ҽ� ���� ����
	    // Syntax Error
		
		//������ ����
		// Checked Exception
		// 1. IOException
		// ����°� ���õ� ����
		// 2. InterruptedException
		// ������ ���� ����
		
		// Unchecked Exception
		// 1. RuntimeException
		// Exception Ŭ������ ���� ��� ������ ����.
		// RuntimeException -> �� Ŭ������ ��ӹ����� try-catch�� ������
		// �������� �ʾƵ� �ȴ�.
		
		// 2. NullPointerException
		// �ڷ��� ������ �ν��Ͻ��� ����Ǿ� ���� �ʰ� null�� �ִٸ�
		// �ν��Ͻ� �޼��� ȣ��, ���� ���ٽ� �߻��ϴ� ����.
//		String text = null;
//		System.out.println(text.isEmpty());
			
		// 3. ClassCastException
		// ��ü Ÿ�� ��ȯ�� �ùٸ��� ���� ��ü�� Ÿ�Ժ�ȯ�Ұ�� �߻��ϴ� ����
		
		
		// ���� �߻� Ȯ�ι�
		int num = -1;
		int[] array = new int[3];
		//System.out.println(array[num]);
//		try {
//			System.out.println(array[num]);
//		} catch (ArrayIndexOutOfBoundsException ea) {
//			System.out.println("���� ������ ������ �޼���!");
//			
//		}
//	     Scanner sc = new Scanner(System.in);
//	     int a=0;
//	     while(a <2) {
//	    	 
//	     
//	     try {
//	    	 int value = sc.nextInt();
//		} catch (InputMismatchException e) {
//			  System.out.println("���ڸ� ���߽��ϴ� �ٽ� �Է����ּ���.");
//	          
//		}
//	     a+=1;
//	     
//	    }
	     
		// ����ó���� ����ؾ��� ����
		// ��� ���ܸ� üũ�ϴ°��� �����.
		
		// ������ ���ܰ� �߻��� ���ɼ��� ���ٰ� �����ȴٸ�
		// RuntimeException Ŭ������ ���� ���ܿ� �����ϴ� ����� ����.
		// -> ������ �������̸� ���� �������� ������ Exception�� ã�°��� ���� ����.
		
		// Ŀ���� ���� throw
//	     ExceptionTest ext = new ExceptionTest();
//	     ext.setName("test");
		
		//�ڹٿ��� ������0�� �ϸ� ��� �ɱ�?
		//�����߻�
		//System.out.println(4/0);
		
		//������ ������ִ� ���α׷�
		while(true) {
			Scanner sc = new Scanner(System.in);
			int firDiv;
			int secDiv;
			
			try {
			System.out.println("������(��������)�� �Է����ּ���");
			firDiv = sc.nextInt();
			System.out.println("����(��������)�� �Է����ּ���");
			secDiv = sc.nextInt();
			int result = firDiv/ secDiv;
			System.out.printf("%d/ %d = %d\n", firDiv, secDiv, result);
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ������ ������!");
				continue;
				
			}
					
		}
		
		
	 }
	
}
