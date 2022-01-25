package java0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExam {

	public static void main(String[] args) {
        // ����Ʈ : �ߺ��� ���ǰ� ��������� �����Ǵ� ����
		// -> ���� Ŭ���� : ArrayList, LinkedList
		// add, addAII
		// get(): ������ ��ġ�� �ִ� ��ü ����
		// indexOf() : ��ü�� ��ġ ��ȯ
		// lastIndexOf() : List�� ������ ��Һ��� ���������� ��ġ ����
		// listIterator() : List ��ü�� ������ ListIterator�� ����
		// remove() : ������ ��ġ�� �ִ� ��ü�� �����ϰ� ������ ��ü ��ü�� ����.
		// set() : ������ ��ġ�� ��ü�� ����
		// sort() : ������ ������ List ��� ����
		// subList() : ������ ������ �ִ� ��ü�� ���ο� List�� ����.
		
		// ArrayList vs LinkedList 
		// ������
		// ���뵵���� ����� ����, ����ϴ� �޼��嵵 �Ȱ���
		
		// ������
		// �������� �߰��� ������ ����� ��� ó���ӵ� ���̰� ����
		
		// LinkedList�� �������� �߰� ������ �������̸� ��� ex) �Խ��ǵ�� �����ϸ� ��
		// ArrayList�� �������� ������ �������϶� ���
		// ArrayList ���� : �ε��� ����
		
		// ArrayList
		List<String> l1 = new ArrayList<>();
		List<String> l2 = Arrays.asList("��", "��", "ĥ");
		//List<String> l3 = List.of("����", "��");
		
		l1.addAll(l2);
		l1.add("��");
		System.out.println(l1);
		
		
		// LinkedList
		LinkedList<String> Llist1 = new LinkedList<>();
		
		Llist1.addAll(l2);
		Llist1.add("��ũ�帮��Ʈ");
		
		//get�� ���� ����Ʈ�� ��ġ ��������
		System.out.println(Llist1.get(3));
		// indexOf�� �̿��ؼ� ����� ��ġ�� Ȯ��
		// ���� ���� ��Ҹ� -1���
		System.out.println(Llist1.indexOf("��"));
		System.out.println(Llist1.indexOf("ĥ"));
		
		//lastIndexOf
		System.out.println(Llist1.lastIndexOf("��"));
		
		// listIterator : Iterator �������̽��� ��ӹ޾�
		//               ����� �߰��� �������̽�
		// Iterator �������̽��� ������ �����ϱ����� �������̽�
		// -> �÷����� ��� ���ٽ� �ѹ��� �̵��� ���������� ����.
		//    - ����� ��ü, �߰�, �˻�
		System.out.println(Llist1.listIterator());
		
		LinkedList<Integer> lList1 = new LinkedList<Integer>();
		lList1.add(10);
		lList1.add(40);
		lList1.add(30);
		lList1.add(20);
		ListIterator<Integer> iter = lList1.listIterator();
		// hasNext() : ����Ʈ �ݺ��ڰ� �ش縮��Ʈ�� ���������� ��ȸ�Ҷ�
		// ������Ұ� ������ True ������ False
//		while(iter.hasNext()) {
//			//next() ����Ʈ�� ���� ��Ҹ� �����ϰ� ������ �̵� ����.
//			System.out.println(iter.next());
//		}
		// hasPrevious() : ����Ʈ�ݺ��ڰ� �ش� ����Ʈ�� ���������� ��ȸ�Ҷ� 
		// ������Ұ� ������ True ������ False
//		while(iter.hasPrevious()){
//			// ����Ʈ�� ���� ��Ҹ� �����ϰ� ������ �̵� ����
//			System.out.println(iter.previous());
//		}
		
//		String test = "abcabc";
//		System.out.println(test.lastIndexOf("c"));
//		System.out.println(test.lastIndexOf("c", 2));
	
		//remove : �ش� ����Ʈ�� ����� �������� ��� �ش� ������ ���Ϲް�
		//
		
		System.out.println(Llist1.remove(2));
		System.out.println(Llist1);
		Llist1.set(0, "five");
		System.out.println(Llist1);
		
		//sort
		Llist1.clear();
		
		List<Integer> test1 = Arrays.asList(1,2,3,4,5);
		
		//sort : �⺻�����δ� �������� ����
		Collections.sort(Llist1);
		//System.out.println(test1);
		
		//sort�� �̿��� �������� ����
//		test1.sort(new Comparator<Object>() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//	           return o2.toString().compareTo(o1.toString());
//			}
//			
//		});
		Collections.sort(test1, Collections.reverseOrder());
		
		System.out.println(test1);
	}

}
