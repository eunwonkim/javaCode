package java0120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class CollectionExam {

	public static void main(String[] args) {
		// collection : 
		// ������ �޸� �������� �����͸� ��� �� �����ϰ� �����ϰ� ������ �ִ°���
		// �ذ��ϱ� ���� ���Ǵ� ���̺귯��(�ڷᱸ�� ���̺귯��)
        // �ڹٿ��� �����͸� �����ϴ� Ŭ�������� ǥ��ȭ�� ���豸��
		
		// Map, Collection, List, set
		// List : ������ �ִ� �������� ����
		//  -> �������� �ߺ��� ����Ѵ�. (ArrayList, LinkedList)
		// Set : ������ �������� �ʴ� �������� ����
		//  -> ��.��.��.��(HashSet, LinkedHashSet)
		// Map : Ű�� ���� ������ �̷���� �������� ����. ex)���ѻ����̶� �����ϸ� ����, Ű�� �ߺ��Ǹ� �ȵ� ���������
		// 										     Ű�� ã���� �ȴ� point!!
		// Collection �������̽�
		// List, Set�� ���� �������̽�
		// List�� Set�� ������ ��� Ŭ�������� Collection �������̽��� 
		// ����Ҽ� �����Ƿ� ���� Ŭ������ ������� ������ ������� �����͸�
		// �ٸ��� ����
		
		// �÷��� �ȿ� ���� �����͵��� ��� Ÿ���� �����ϴ� ������
		// Ÿ���� �ٸ���� �ϰ��� ó���� ������� Ÿ�� �Ķ���Ͷ�°��� ���.
		// ex) Collection<String> c = new HashSet<>();
		//    -> ������ ���� �ߺ��� ������� �ʴ� �ڷᱸ���� HashSet ��ü�� ����.
		//    -> ����Ǵ� �����ʹ� ���ڿ��� �����Ѵ�.
		//    -> new HashSet<String>(); -> �������� -> Ÿ�� �߷�
		//Collection<String> c = new HashSet<>();
		
		// �÷��� ��ü�� ����
		// �÷��� Ŭ�������� java.util ��Ű���� �����ϰ� ����
		// �÷��� ��ü ��������� �������� ����� ���� �������̽� Ÿ���� �ۼ�
		// ��ü������ �ʿ信���� ��ü���� Ŭ�������� ����ϴ� ����.
		
		ArrayList<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		//����ִ� HashEst �ν��Ͻ� ���� �����ʹ� ���� add() �޼��带 ���� ����.
		Collection<String> test2 = new HashSet<>();
		// �ΰ��� �����͸� ������ List ��ü�� ����
		Collection<String> test1 = Arrays.asList("��", "��");
		// �����Ͱ� �ϳ��� ������ �ν��Ͻ��� �����ϴ� Set ��ü ����.
		Collection<String> test = Collections.singleton("��");
		
		// �÷��ǿ� �����͸� �߰�, ���� �ڡڡڡ�
		// add : ������ Ÿ���� �����͸� �ϳ��� �߰��Ҷ�
		// addAll : �÷���Ÿ���� �߰�. addall �޼��带 �̿��� ���� ��Ҹ� ������ �߰� 
		test2.add("��");
		test2.add("��");
		test2.add("��");
        //test2.addAll(test1);
        // remove : ��� ����
		// ���� �����͸� ������ ��ȭ�� ������ �ƹ��͵� �ٲ��� �ʴ´�.
		//test2.remove("����");
		//System.out.println(test2);
        // removeall : �ν��Ͻ� ���� ���� ����.
        // retainAll : �μ��� �����͸� ������ ������ �����͸� ��� ����.
		// - ���ǻ���  : �μ��� ���� �ν��Ͻ����¿��� �Ѵ�.
		//test2.retainAll(test);
        // clear : ��� ������ ����
		
		// size : �÷��� �������� ũ�⸦ ���ϴ� �޼���
		//System.out.println(test2.size());

		//toArray : �÷����� �迭�� �ٲٴ� �޼���
	    //Object[] con1 = test2.toArray();
	    //Ư���� Ÿ���� ���Ѵٸ� �ش� ��ü ���� �ڵ带 �־� �־�� �Ѵ�.
	    //String[] con2 = test2.toArray(new String[test2.size()]);
	    //System.out.println(con1[0]);
	    //System.out.println(con2[1]);
		
		//���������� ��� �����͸� ����ϴ°��
//	    for(String a : test2) {
//	    	System.out.println(a);
//	    }
	    
	    //Ư����ġ �����͸� �ٷ�Ÿ� ���?
	    // -> �迭�� ġȯ�� ����.
	    
	    // forEach() �޼��� ���
	    //test2.forEach(a -> System.out.println(a));
	    test2.forEach(System.out::println);
	    
		// Iterator -> Collection �������̽��� ��ӹ޴� �������̽�
	    // Iterlator() �޼��� Ȱ��
	    // Iterator : �÷��ǿ� ����� ��Ҹ� �о���� �����
	    //            �������̽��� ǥ��ȭ
	    // Iterator �������̽��� ������ Ŭ������ �ν��Ͻ��� �����ϴ�
	    // (Collection, list, set���� ������� �ν��Ͻ�)
	    // iterator �޼��带 ������ �� ��ҿ� �����ϴ� �����
	    // ����.
	    Iterator iter = test2.iterator();
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	    
	}

}

