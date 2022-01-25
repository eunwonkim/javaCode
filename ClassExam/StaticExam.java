package ClassExam;

class MenberCall{
	int iv = 100; // �ν��Ͻ� ���� ����
	static int cv = 250; // Ŭ���� ���� ����
	
	//�ν��Ͻ� �ɹ��� �����ϴ� �������� Ŭ���� �ɹ��� �׻� �����Ѵ�.
	// Ŭ���� �ɹ��� �����ϴ� ������ �ν��Ͻ� �ɹ��� �����Ѵٴ� ������ ����.
	
	int iv2 = cv; // Ŭ���� �ʵ��� ���� �ν��Ͻ� �ʵ忡 ����.
	//static int cv2 = iv; // Ŭ���� �ʵ忡 �ν��Ͻ� �ʵ��ǰ��� �����ϴ°��� �Ұ�
	static int cv2 = new MenberCall().iv; //��ü ���� ������� ��ȸ�ϴ� ����� ������.
	
	void instanceMethod1() {                //�ν��Ͻ� �ʵ�
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod1() {          //Ŭ���� �ʵ�
		System.out.println(iv);
		System.out.println(cv);
	}
}


public class StaticExam {
    public static void main(String[] args) {
    	MenberCall me = new MenberCall();
    	System.out.println(me.cv);
    	System.out.println(me.iv);
    	System.out.println(me.iv2);
    }
}
