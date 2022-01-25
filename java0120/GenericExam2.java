package java0120;

import java.util.ArrayList;

class Box<T>{
	T boxItem;
	T[] itemArr; // T�� �迭�� ���� �ʵ�
	
	ArrayList<T> list1 = new ArrayList<T>();
	
	
	void setItem(T item) {
		this.boxItem = item;
		
	}
	void add(T item) {
		list1.add(item);
	}
	int size() {
		return list1.size();
		
	}
	T get(int i) {
		return list1.get(i);
	}
	
//	T getItem() {
//		return boxItem;
//	}
	ArrayList<T> getList(){
		return list1;
	}
	
	public String toString() {
		return list1.toString();
		
	}
}

class Fruit{
	public String toString() {
		return "Apple";
		}
	
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

public class GenericExam2 {
    public static void main(String[] args) {
    	Box<Apple> appleBox = new Box<Apple>();// Ÿ���� ��ġ���Ѿ� �Ѵ�.
    	
    	appleBox.add(new Apple()); // Ÿ���� ��ġ���Ѿ� �Ѵ�.
    	
    	System.out.println(appleBox.get(0));
		
        Box<Integer> b = new Box<>();
        
        b.setItem(1236789);
        //System.out.println(b.getItem());
	}

}
