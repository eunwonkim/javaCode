package exam;

import java.util.Scanner;

public class lunchQuiz0112 {

	public static void main(String[] args) {

        // 개인 신상을 입력받는 프로그램을 작성해주세요.
		//입력받는 정보는 다음과 같습니다.
		// 이름, 나이, 키(소수점 단위1자리까지), 전화번호, 몸무게
		// 실행결과는 다음과 같이 출력해주세요.
		// 이름 : / 나이 : / 키 : / 전화번호 :  / 몸무게 : /
		
		//kew 타입
		//int a =33; //나이
		//double b = 176.6; //키
		//double d = 54.7; //몸무게
		
		
		//System.out.println("이름 : kew");
		//System.out.println("나이 : "+a);
		//System.out.println("키 : "+b);
		//System.out.println("전화번호 :");
		//System.out.println("몸무게 :"+d);
	    
		//강사님 타입
		Scanner sc = new Scanner(System.in);
		
		System.out.println("개인정보 입력 프로그램입니다.");
		System.out.println("사용자의 이름을 입력해주세요");
		String name = sc.nextLine();
		System.out.println("사용자의 나이를 입력해주세요. : ");
		int age = sc.nextInt();
		System.out.println("사용자의 키를 입력해주세요. : ");
		float height = sc.nextFloat();
		sc.nextLine();
		System.out.println("사용자의 폰번호 입력해주세요.: ");
		String phone = sc.nextLine();
		System.out.println("사용자의 신장을 입력해주세요. : ");
		float weight = sc.nextFloat();
		
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
		System.out.println("키 : " +height);
		System.out.println("폰번호 : " +phone);
		System.out.println("신장 : " +weight);
		

		
		
	}
}

