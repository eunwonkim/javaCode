package exam;

import java.util.Scanner;

public class QuizAns0113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. �ݶ� ���Ǳ� ����� (����Դ��)
		// �����ذ� ROADMAP
		// - �ݶ��� ������ 1000��
		int cola = 1000;
		// ���Ǳ⿡ �ݾ� ����
		// - �ݾ����� = ����ڰ� ���� ���� �Է�
		//            (Scanner Ŭ���� ȣ��)
		int charge;
		Scanner sc = new Scanner(System.in);
		System.out.println("�ݶ����Ǳ� �Դϴ�. �ݾ��� ������ �ּ���!");
		charge = sc.nextInt();
		System.out.println(charge);
		// ������ �ݾ׺��� �ݶ��� ������ Ŭ ��
		// �ܵ��� ����(�󸶳��ҳ�) ��°��� �ʿ�.(�ܵ� ����� �ʿ�)
		if(charge > cola) {
		   System.out.printf("�ݶ� �̾ҽ��ϴ�. �ܾ��� %d�� ���ҽ��ϴ�.", 
				   (charge-cola));
		}
		// ������ �ݾװ� �ݶ��� ������ ���� ��
		else if(charge==cola) {
			System.out.println("�ݶ� �̾ҽ��ϴ�. �ܾ��� �����ϴ�.");
		}
		
		
		// ������ �ݾ��� �ݶ��� ���ݺ��� Ŭ��
		else if(charge<cola) {
			System.out.println("������ �ݾ��� �۾� �ݶ� ������ �����ϴ�.");
		}
		else {
			System.out.println("???????? �����Դϴ�.");
		}
	}

	

}
