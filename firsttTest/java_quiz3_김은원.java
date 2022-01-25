package firsttTest;

import java.util.Scanner;

public class java_quiz3_김은원 {

	public static void main(String[] args) {
		
		System.out.println("***도형선택***");
		System.out.println("1. 삼각형\n2. 원\n3. 사다리꼴\n4. 종료\n 선택 : ");
		Scanner areas = new Scanner(System.in);
	 public void Circle 
	 public void triangle
	 public void trape
	    int menu = menu;
		int area = areas.nextInt();
		int result=0;
		double PI=3.141592;
	    
		if(area==1) {
		
			System.out.println("****삼각형의 넓이****");
			System.out.println("밑 변");
			int width=areas.nextInt();
			System.out.println("높 이");
			int height =areas.nextInt();
			result=(width*height)/2;
		}else if(area==2) {
        System.out.println("****사다리꼴의 넓이****");
        System.out.println("아랫변");
        int width=areas.nextInt();
        System.out.println("윗변 ");
        int height =areas.nextInt();
        
		}else if(area==3) {
			System.out.println("****원의 반지름****");
			double width = areas.nextInt();
			result = (int) ((width*width)*3.14);
			
		}else {
			System.out.println("1/2/3번중의 숫자를 입력하세요.");
		}
		System.out.println("면적 : "+ result);
		
	}

}
