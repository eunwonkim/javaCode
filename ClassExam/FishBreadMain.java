package ClassExam;

public class FishBreadMain {
	
	public String fishCode;//�ؾ��ȣ
	public String inside;//�ؾ�� ��(���)
	public String flourCode;//�а��� ������.
	
	public void showFish(){
		System.out.println("��ȣ : "+fishCode+ "��� : "
	     + inside+ "������ : "+flourCode);
	}
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FishBreadMain fi = new FishBreadMain();
		
		fi.fishCode = "001";
		fi.inside = "��";
		fi.flourCode = "�̱���";
		
		fi.showFish();
		
		FishBreadMain fi2 = new FishBreadMain();
		
		fi2.fishCode ="002";
		fi2.inside = "��ũ��";
		fi2.flourCode = "�߱���";
		
		fi2.showFish();
		
		// AvanteBulid��� ������ �����ϰ�
		// NewAvante ��� Ŭ������ ������
		// ������ ������ �����ϵ��� �������ּ���
		
		// Ŭ������ ���� �ɹ����� 
		// 1. ���͸�
		// 2. �ӵ�
		// 3. �⸧(�⸧�� �ִ� 50L)
		
		// Ŭ������ �޼���
		// speedUp 
		// �� �޼��带 ȣ���Ҷ����� �ش� �ν��Ͻ��� �ӵ� ������ ���� ����.
		// showCar
		// �� �޼��� ȣ��� �ش� �ν��Ͻ� �ɹ������� ���� Ȯ��
			
	}

}
