package NewCar.carContent;

public class Handle {

	// ��ȸ��
	void left() {
		// ��ȸ���� �Ҷ� �����̸� Ű�� ������.
		// �ܼ��� �޼���ó���� �ƴ�
		// �޼��� ȣ���� ���� ó��
		leftLight();
		System.out.println("��ȸ�� �ؿ�!");
		leftLightOff();
		
}
	void leftLight() {
		System.out.println("���� ������ on");
	}
	void leftLightOff() {
		System.out.println("���� ������ off");
	}
	
		
	// ��ȸ��
	void right() {
		reftLight();
		System.out.println("��ȸ�� �ؿ�!");
		reftLightOff();
	}
	void reftLight() {
		System.out.println("���� ������ on");
	}
	void reftLightOff() {
		System.out.println("���� ������ off");
	}
}
