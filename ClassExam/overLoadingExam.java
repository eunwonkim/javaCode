package ClassExam;

class OverLoadingTest{
	
     int add(int a, int b) {
    	 return a + b;
       }
     long add(int a, long b) {
    	 System.out.println();
    	 return a + b;
     }
     
     // 2. �Ķ������ Ÿ���� �ٸ����
     double add(double a, double b) {
    	 return a + b;
     }
     //2. �Ķ������ Ÿ���� �ٸ����
     int add(int a , int b , int c) {
    	 return a + b +c;
     }
     int add(int[] a) {
    	 // �Ѿ�� ������ ���� ����Ұ�
    	 int resilt = 0;
    	 int result = 0;
		for(int i=0; i < a.length; i++){
    		 result += a[i];
    	 }
    	 return result;
     }
     
}
    	



public class overLoadingExam {

	public static void main(String[] args) {
		OverLoadingTest ov = new OverLoadingTest();
		
		System.out.println(ov.add(10, 20));
		System.out.println(ov.add(20, 40));
		System.out.println(ov.add(1.5,3.8 ));
		System.out.println(ov.add(10, 20, 30));
		
		int[] test = {300, 350, 400};
		System.out.println(ov.add(test));
		// �޼��� �����ε� �ڡڡڡڡڡ�
		// �� Ŭ���� ���� �̹� ����Ϸ��� �̸��� ���� �̸��� ���� �޼��尡 �ִ��� 
		// �Ķ������ ������ Ÿ���� �ٸ���, ���� �̸��� ����ؼ� �޼��带 �����Ҽ� �ִ�.
		// �̰��� �޼��� �����ε��̶�� �Ѵ�.
		// ��������, �ٸ�����(����ؼ�) �ڡڡڡ�
		
		// �����ε��� �� �ʿ��Ѱɱ�?
		// ������ : ���Ĺ��� ���� �پ��ϰ� �޾Ƽ� ó���ϱ� ���ؼ�.
		
		// �����ε��� ���� 
		// 1. �޼������ ���ƾ��Ѵ�.
		// 2. �Ķ������ ����, Ÿ���� �޶���Ѵ�.
		// 3. �Ķ���ʹ� ������ ����Ÿ���� �ٸ� ���� �����ε��� �ƴϴ�.
		// 4. �����ε��� �޼������ �Ķ���ͷθ� �����ɼ� �ִ�.
						
	}

}
