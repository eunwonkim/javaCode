package exam;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// for + �迭 -> ���� �Է¹޾� ����ϱ�
		
		// �ʿ��� ������
		// 1. �Է¹��� ������ ���� ����
		int count=0;        //���� �����ڵ�� ��� ex) CNT�ε� �����
		// 2. �Է¹��� �迭
		int[] num;
		// 3. �˻��� ����
		int findNum=0;
		
		Scanner scn = new Scanner(System.in);
		// 1. �迭�� ũ�⸦ ����ڿ��� �Է�
		System.out.println("���� �� �迭�� ũ�⸦ �Է��ϼ���.");
		count = scn.nextInt();
		num = new int[count];
		// 2. �迭�� ũ�⸸ŭ ���ڸ� �迭�� ����
		System.out.println(count + "���� ���ڸ� �Է��ϼ���");
		for(int a = 0; a<num.length; a++) {
			num[a] = scn.nextInt();
		}
		
	
		
			// 3. �迭�� ����ִ� ���ڸ� �˻�.
		boolean chk = false;
		System.out.println("�˻��� ���� ?");
		findNum = scn.nextInt();
		for(int a = 0; a<num.length; a++) {
			if (findNum == num[a]) {
				chk = true;
		      	System.out.println(findNum+"�� ��ġ��" +a+ "��° �Դϴ�.");
	       }
 
       }//for end
		
	   if(!chk) {
		   System.out.println(findNum+"�� �������� �ʽ��ϴ�.");
	   }
 
	
	
	}
}