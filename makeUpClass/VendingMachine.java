package makeUpClass;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���Ǳ� �����ϱ�
		
		// 1. ���� ����Ʈ ���
		// ���� ����Ʈ�� ���� �迭,
		String[] beverageNames =  {"ȯŸ", "��Ű��", "���"};
		// ������ ������ ���� �迭
		int[] beverageCost = {1100,1500, 1000};
		// ������ ������ ���� �迭
		int[] beverageStock = {10, 0, 3};
		// �Ա��ҵ�
		int money = 0;
		// ���Ǳ� ����� ���� �ڵ�
		int select = 0;
		
		int isExit = 0;
		//--------------------------------------------------
		//����� ����Ʈ�� ���
		do {
		System.out.println("================================");
		System.out.println("�̰���� ������� �����ϼ���!");
		System.out.println("================================");
		for(int i=0; i<beverageNames.length; i++) {
			System.out.printf("%d %s: %d �������� : %d\n", 
					i+1, beverageNames[i], beverageCost[i], beverageStock[i]); 
		}
		
		//2. ������
		do {
			System.out.println("���� �Ա����ּ���");
			Scanner sc = new Scanner(System.in);
			money = money + sc.nextInt();
		//3. ���ἱ��
		//4. ���Ȯ��(�б�)
		// ��� ���Ҵ��� ���� �ʾҴ����� �Ǵ��ϴ� ����
			do {
				System.out.println("������� ������ �ּ���");
				select = sc.nextInt();
				if(beverageStock[select-1] < 1) {
					System.out.println("�ش� ����� �������� �ʽ��ϴ�.");
				}
			}while(beverageStock[select-1] <1);
		//  -��� ��������
		//    5���������� �̵�
		//  -��� ������
		//    ���ᰡ �����ϴ� ��� �޼��� ����� �ٽ� �������� ����
		
		//5. ��Ȯ��
		// - �Է��ѵ�(�����ѵ�) : money
		//   �񱳴��....? : ������ �����[beverageCost[select-1]
		//  - ������ݾ׺��� ���� Ŭ��
			if(money<beverageCost[select-1]) {
				System.out.println("�ܾ��� �����մϴ�.");
			//  - ������ݾ׺��� ���� ������
				//	    ������ �ݾ��� �����ϴ� ��� �޼��� ����� �� ����(2��)���� ����
			}
		}while(money<beverageCost[select-1]);
		
		
		
		if(money >= beverageCost[select-1]) {
			money = money-beverageCost[select-1];
			beverageStock[select-1] -=1; 
			//6. ���� ��� ���� �� �޼��� ���
			//  - ���� ���� �Ϸ�.
			//7. ���� �ݾ� ���.
			System.out.printf("%s ����� ���� �Ϸ�\n", beverageNames[select-1]);
			System.out.printf("���� �ݾ��� %d�� �Դϴ� \n",money);
			//8. �Ž������� ���������� ���� ����������?
			System.out.println("�Ž������� �ްڽ��ϱ�? Y��1�� N��0��");
			//   - �Ž������� �޴°��
			Scanner sc1 = new Scanner(System.in);
			isExit = sc1.nextInt();
			//      ���Ǳ� �̿� ����
			//   - �Ž������� ���� �ʴ°��
			//      1������ ����
		}
		
	
		
		}while(isExit == 0);
		
		
		System.out.println("���Ǳ⸦ �̿����ּż� �����մϴ� ����");
		
		
	}

}
