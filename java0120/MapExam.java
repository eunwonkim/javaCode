package java0120;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		//MAP : key, value ������ ������ ���� �������̽�
		// Collection �������̽��� ��ӹ��� �ʰ�
		// �� ��ü�� �������̽��� �������� Map ����Ŭ������ ������ ����.
		// HashMap

		//Map ��뿹��
		//����� �̸��� ��������� �Է¹޴� ��
		Map<String, String> map1 = new HashMap<>();
		//put : ���ο� ��Ҹ� �߰��Ҷ� ���
		map1.put("����", "20121015");
		map1.put("�Ƿη�", "20120144");
		map1.put("���ù�", "19800102");
		map1.put("������", "19810102");
			//get : Ư�� key�� �ش��ϴ� ���� �����ö� 
//		System.out.println(map1.get("�Ƿη�"));
//		System.out.println(map1);
//		//remove : Map ��� ����.
//	    System.out.println(map1.remove("�Ƿη�"));
//	    System.out.println(map1);
		
		//entrySet : key�� value�� ��θ� entry ��ü�� ��ȯ
		
		for(Map.Entry<String, String> ent: map1.entrySet()) {
			System.out.printf("%s:%s\n", ent.getKey(), ent.getValue());
		}
			
		System.out.println("===========���뼱============");
		System.out.println(map1.values());
		
		for(String s : map1.keySet()) {
			System.out.println(s);
		}
		for(String s : map1.values()) {
			System.out.println(s);
		}
		 
		//�������� ���α׷� �ٲٱ�
		// ��������� ������ List�� �л��̸��� Ű���ϴ� Map
		// �������
		List<Integer> result1 = Arrays.asList(80, 90, 55, 60, 75);
		
		Map<String, List<Integer>> student = new HashMap<>();
		student.put("������", result1);
		
		int total = 0;       
		for (int i : student.get("������")) {
		    total += i;
		}
		System.out.println("���� : " + total);
	}

}
