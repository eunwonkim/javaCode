package NewCar.carContent;

public class MyCar {

	// �ʵ����
	// �� �̸�
	String name;
	Accel accel;
	Engine engine;
	Handle handle;
	Wheel wheel;
	
	public MyCar(String name) {
		this.name = name;
		this.accel = new Accel(name);
		this.engine = new Engine(name);
		this.handle = new Handle();
		this.wheel = new Wheel("�ſ� ���� ����");
		
	}
	
	// �޼������
	// �� �޸���,
    public void letsGo() {
    // accel Ŭ�������� ���� �P�� Ŭ������
    	accel.push();
    // wheel Ŭ�������� ���� �����̱� Ŭ���� ȣ��
    	wheel.go();
    }
	//�õ��ɱ�, 
	public void ready() {
	//engine Ŭ�������� ���� �õ��ɱ� �޼��� ȣ��
		engine.satrt();
	}
	// 
	//���߱�, 
	public void stop() {
	//engine Ŭ�������� ���߱� �޼��� ȣ��
		engine.off();
	}
	//�������� ����, 
	public void turnLeft() {
    // handle Ŭ�������� �������� ���� �޼��� ȣ��
		handle.left();
	}
	//���������� ����
	public void turnRight() {
		//handleŬ�������� ���������� ���� �޼��� ȣ��
		handle.right();
	}
	
	
	
}
