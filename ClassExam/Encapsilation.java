package ClassExam;

 class Test1{
	 String name;
	
	Test1(String name){
		this.setName(name);
	}
	
	private void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	private void mTest() {
		System.out.println("private �׽�Ʈ");
		}


}


public class Encapsilation {

	public static void main(String[] args) {
		// ĸ��ȭ
		// ĸ���ȿ� �� ���빰�� ��ȣ�ϰ� ��������� ó���ϴ� ���.
		
		// ĸ��ȭ�� ����
		// �������� -> ���ο��� ����ϴ� Ŭ������ �������� �ʰų�
		//           Ŭ���� ���ο����� ����ϴ� �޼��尡 �ܺο� ������� �ʵ���
		//           ����� ������ ����� ���� �ܺο� ������ �ʵ��� ��ȣ�ϱ� ����.

		Test1 t = new Test1("tset");
		System.out.println(t.name); // ���������ڰ� private�� ���� ȣ�� �Ұ�.�١�
		
	}

}
