package exam;

public class StrBuffer {

	public static void main(String[] args) {
		
		//StringBuffer : ���ڿ��� �߰��ϰų� �����Ҷ� �ַ� ����ϴ� �ڷ���
		// ���� �߰��� ��ü�� ���� ������ �ʿ䰡 ���� ������ �޸� ��뿡�� �̵��� 
		// ���� �������� ����.
		// �޸𸮸� ȿ�������� �������ؼ�
		
		// stringBuffer�� �����
		// �ڷ��� ũ�� ��ü�� ���ſ���. (string�� 2��) -> �� ū ����Ʈ�� ��������.
		// String�� Stringbuffer�� ���������� ������ �ʿ�
		
		// StringBuffer : �����۾��� ������
		// String : �����۾��� ���� ������
		
   // ����
  //  ������ ������ ����غ�����(����� �����Ӱ�)
 //  hello 2022 java web devTeam
		//int a = 2022;
	    //System.out.println("hello"+ a );
		//����� Ǯ��
       StringBuffer sb = new StringBuffer();
       sb.append("hello");
       sb.append(" ");
       sb.append("2022");
       sb.append(" ");
       sb.append("java");
       sb.insert(5, "everybody");
       
       
       String result = sb.toString();
       System.out.println(result);
	}

}
