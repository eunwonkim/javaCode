package NewCar.carContent;

public class Engine {
	String name;   //(�ʵ尪 ����)
	// �õ��� �ɷȴ��� ������ üũ�ϴ� �ʵ� ����
	boolean isStrarted = false; //boolean �޼ҵ�� true, fasle
	
	// ������
	Engine(String carName){
	    this.name = carName;
	}
	
	// �õ��ɱ�
	// isStarted �ʵ带 �̿��ؼ�
	
	void satrt() {
	   if(isStrarted) {
		   System.out.println(String.format("%S�� �̹� �õ��� �ɷ�����", name));
		   return;
	   }
	   isStrarted = true;
	   System.out.println("�θ��θ�!");
	}
	
	//���߱�, 
	void off() {
		   if(!isStrarted) {
			   System.out.println(String.format("%S�� �̹� �õ��� ��������", name));
			   return;
		   }
		   isStrarted = false;
		   System.out.println("�õ� off");
	
	}
	
	
	
}
