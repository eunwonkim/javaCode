package firsttTest;

import java.util.Scanner;

public class java_quiz3_������ {

	public static void main(String[] args) {
		
		System.out.println("***��������***");
		System.out.println("1. �ﰢ��\n2. ��\n3. ��ٸ���\n4. ����\n ���� : ");
		Scanner areas = new Scanner(System.in);
	 public void Circle 
	 public void triangle
	 public void trape
	    int menu = menu;
		int area = areas.nextInt();
		int result=0;
		double PI=3.141592;
	    
		if(area==1) {
		
			System.out.println("****�ﰢ���� ����****");
			System.out.println("�� ��");
			int width=areas.nextInt();
			System.out.println("�� ��");
			int height =areas.nextInt();
			result=(width*height)/2;
		}else if(area==2) {
        System.out.println("****��ٸ����� ����****");
        System.out.println("�Ʒ���");
        int width=areas.nextInt();
        System.out.println("���� ");
        int height =areas.nextInt();
        
		}else if(area==3) {
			System.out.println("****���� ������****");
			double width = areas.nextInt();
			result = (int) ((width*width)*3.14);
			
		}else {
			System.out.println("1/2/3������ ���ڸ� �Է��ϼ���.");
		}
		System.out.println("���� : "+ result);
		
	}

}
