package makeUpClass;

public class ArrayTest {

	public static void main(String[] args) {
		// �迭 : �����͸� �����ϴ� ����?
		// �迭�� Ÿ�Ժ��� �����͸� �����Ѵ�.
		// �ε���, ���
		// �ε��� : ����� ������(��ġ)
		// ��� : �迭�ȿ� ���� �ִ� ������ ��
		
		// �迭�� ����� Ÿ�� �� [] ���¸� �ο�
		//         
		int[] a = {23,12,76,34,15};
		
		// �迭�� ���� -> �ε���
		//System.out.println(a[4]);
		
		// �迭�� ����� ��� 
		// 1. ������ ���� �Ҵ��ϴ¹�
		// -> ���� �ڵ� ����
		// 2. �ν��Ͻ�(��ü)�� �����Ͽ� �Ҵ��ϴ¹�
		int[] intArr = new int[] {1,3,5,7};
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		// 3. ������ �Ҵ��ϰ� ���� �� �ֱ�
	    int[] intArr2 = new int[6];
	    
	    intArr2[0] = 1;
	    intArr2[3] = 5;
	    
	    // �迭������ ũ�� Ȯ��
	    //System.out.println(intArr2.length);
	    
	    //�������迭
	    
	    //������ �迭�� ����
	    char[][] test = new char[5][5];
	    test[0][0] = '1';
	    
	    char[][] test2 = {
	    		{'1', '2', '3'},
	    		{'4', '6', '8'},
	    		{'5', '7', '9'},
	    };
	    System.out.println(test2[1][2]);
	    
	}

}
