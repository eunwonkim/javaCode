package exam;

import java.util.Random;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// for��
		// �ݺ����� ����, while���� �ٸ���
		// �ݺ��� ���۽� ������ ���������� ������ �����ϴ� ����
		
		//for (�ʱ��; ���ǽ�; ������){
		//
		//}
		
		//10���� �ȳѾ�� ���� ����.
//		int tree = 0;
//		for (int i=1; i<11; i++){
//			System.out.println("������ ������ "+i+"��° ������ϴ�.");
//		}
		//while vs do-while vs for
		//���� ������� ���̸� �����Ѱ�?
		//while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
		//do-while : ���� ����� ��/���� �̰ų�, ����ڰ� ���ϴ� ��Ȳ������ ���α׷��� �����Ҷ�
		//for : Ư�� ���� ����, Ƚ���� �����Ͽ� �ݺ��ɶ� ���, �迭�� ������ ����.
		
		//for���� �ʱ��, ���ǽ�, �������� ������ ����.
		//������ ��Ʈ������ Ǫ�� �����
//		int i=0;
//		for(;;) {
//			i++;
//			System.out.println("������ ������ "+i+"��° ������ϴ�.");
//		}

		//for�� ��뿹��2
		//1~10���� ���� ���ϵ� ¦���� ����
//		int result = 0;
//		for(int i=0; i<10; i++) {
//			if(i%2!=0) {
//				result = result + i;// result +=i
//			}
//			if(i%2==0) {
//				//continue : �ش� Ű���带 ������ �ݺ����� ó������ �ǵ��ư��� Ű����
//				// ��Ȳ������ �ݺ��� �����ϰ� ���� �ʴٸ� ����ϴ� Ű����
//				continue;
//			}
//			result = result + i;
//		}
//		System.out.println(result);
		
	    // for���� ����
		// ������.
		// ������ 3���� ����ϼ���
		// ex) 3 * 1 = 3
		//	   3 * 2 = 6
		//     3 * 9 = 27
		
		// 3�����
		// 1. 3�̶�� ���ڰ� �ϳ� �����Ǿ�� �ϰ�
		// 2. 1~9���� �ݺ�.
//	    Scanner sc = new Scanner(System.in);
//		int gugu = 3;
//	    for(int i=1; i<10; i++) {
//	    	System.out.println(gugu+" * " + i +" = " + gugu * i);
//	    }
		
	    // for���� ��ø(���� for��)
	    // for�� �ȿ� for���� �ѹ� �� ����Ҽ� ����.
//	    // 2�ܺ��� 9�ܱ��� ���� ���
//	    for(int i=2; i<10; i++) {
//	        
//	    	for(int j=1; j<10; j++) {
//	    		System.out.println(i+" * " + j +" = " + i * j);
//	    	}// for end
//	    }// for end
//		
	    
	    
	
	


//���� �� �ܸ��� ǥ���غ�����.
// ex) --------2��-----------


		//���� 1 for���� �̿��Ͽ� �������� ���Ͻÿ�
		//x�� ���� �Է��Ͻÿ� : 3
		//y�� ���� �Է��Ͻÿ� : 3
		//3�� 3���� 27
//		Scanner sc = new Scanner(System.in);
//		
//		int num1;
//		int num2;
//	    System.out.println("x�� ���� �Է��Ͻÿ� : ");
//	    num1 = sc.nextInt();
//	    System.out.println("y�� ���� �Է��Ͻÿ� :");
//		num2 = sc.nextInt();
//		
//        int result = num1;
//        
//        for (int i=0; i<num2-1;i++) {
//        	
//        	result *= num1;
//        	
//        }
//        System.out.println(result);
		
        
        //����2 50���� ������ ���� ������ ���� ����Ͻÿ�
 		//����1) 0 - 100 ������ �� �ϰ�
		//����2) 1�ٿ� 6���� ǥ���Ͻÿ�
        Random random = new Random();
        
        random.setSeed(0);
        for(int i =0; i <5; i++) {
        	System.out.println(random.nextInt(100) + " ");
        }
        
        System.out.println();
        
        random.setSeed(0);
        for(int i = 0; i < 5; i++) {
        	System.out.println(random.nextInt(100) + " ");
        }
       
        
}
}
