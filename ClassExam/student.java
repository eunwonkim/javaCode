package ClassExam;

class Test{
	// ��ü�� �Ӽ�(�ɹ�����)
	public String stuName;
	public int stuID;
	//��ü�� ���(�޼���)
	// 1. �л��� ������ ���� �޼���
	public void showStudentInfo() {
		//������(�Լ���) ������ ǥ��� 
		// 1. pascalCase(�Ľ�Į ǥ���) �ڡڡڡڡ�
		//    - �ܾ���̻��� ���� �빮�ڷ� ǥ�������ν� �ܾ ����
		// 2. camelCase(ī��ǥ���) �ڡڡڡڡ�
		//    - ù���� ���� �ܾ� ���̻��̸��� �빮�ڷ� ǥ�������ν� �ܾ ����.
		// 3. snake_Case(������ũǥ���(�����/������ھ� ǥ���)) �ڡڡڡڡ�
		//    - �ܾ� ���̻��̸��� _�� ǥ�������ν� �ܾ ����.
		
		System.out.println(stuName + stuID);
		
	}
	
	public String getStudentName() {
		return stuName;
	}
}



public class student {

	public static void main(String[] args) {
		//������ �����ص� Test Ŭ������ ��ü�� ����.
		Test stuLee = new Test();
		stuLee.stuName = "������";
		stuLee.stuID = 001;
		
		stuLee.showStudentInfo();
		
		
	}
}
