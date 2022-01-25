package exam;

import java.util.Scanner;

public class Choice {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
         // 제어문
	     // 프로그램의 순차적인 흐름을 제어하는 방법
		 // -> 순차적 흐름을 제어하고 이때 명령문을 통해 제어.
		 // 제어문 : 조건문, 반복문,
		
		// 제어문에 속하는 명령문들은 중괄호로 둘러쌓여져 있음 [규칙]
		// 중괄호 영역을 블록이라 칭함.
		
		// 조건문
		// 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 하는 제어문.
		// if~ else / switch
		
		// if문
        // if (조건식) {
        // 조건이 참일때 실행하는 코드.
        //	}
		
		// 조건 생성.
		
		// 새벽까지 술을 마시고 택시를 타고 집에 가려하는데
		 //int money = 15000;
		 //잔액이 3만원 이상이면 택시를 타고 
        //if (30000<=money) {
        	//System.out.println("택시타고 집에 가는중!");
        
		 //그렇지 않으면 걸어간다.
        //else {
        	//System.out.println("돈없어서 걸어 가는중 ㅜㅜ");
         //}
		// 문제 
        // 재산에따라 세금을 부여하는 프로그램을 작성하세요.
        // 1. 재산이 100만원 이상이면 세금을 10만원을 납부
        // 2. 그렇지 않으면 세금을 2만원을 납부.
        // 3. 납부는 메세지로만 처리 ("세금 10만원을 납부해주세요")
//        Scanner sc = new Scanner(System.in);
//        int tax = sc.nextInt(); // 재산 내용 저장 100
//        if (1000000<tax) {
//        	System.out.println("세금 10만원을 납부해주세요");
//        	   }
//        else {
//    	System.out.println("세금 2만원을 납부해주세요");
    
       
		// 조건을 문자로 처리
        // 
//        String stu1 = "대학생";
//        
//        if(stu1=="고등학생") {
//         System.out.println("청담고등학교로 가고 있습니다.");
//        }
        
	
		// 여러개의 조건을 가지는 조건문(else if)
		// 나이별 요금계산 프로그램
		// 코드에서 필요한것들
		// 정수형 변수(나이, 요금)
//		int age, charge;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("강남식당에 오신것을 환영합니다. 나이가 어떻게 되세요?");
//		age = sc.nextInt(); //sc.nextInt는 정수형만 받아온다.
//		// 조건 
//		// 1. 0~6세 요금을 받지 않는다.
//		
//		if(age>0 && age<7) {
//			System.out.println("6세까지는 요금을 받지 않습니다");
//		}// 조건문 종료 블록
//		// 2. 7~12세는 미취학 아동으로 분류. 요금은 5000을 받는다.
//		else if(age<=12) {                       //else는 조건을 만족할수 없다.
//			System.out.println("미취학 아동입니다 요금은 5천원 입니다.");
//		}//미취학아동 조건 종료 블록
//		// 3. 13세~19세는 청소년으로 분류. 요금은 10000원을 받는다.
//		else if(age<=19) {
//			System.out.println("청소년 입니다. 요금은 10000원 입니다.");
//			
//		}
//		// 4. 20세 부터는 성인으로 분류 요금은 15000원을 받는다.
//		else if(age>=20) {
//			System.out.println("성인 입니다. 요금은 15000원 입니다.");
//		}
//		else {
//			System.out.println("잘못된 값 입니다.");
//		}
		
		// 실습문제
		// 값을 입력받고 0~100 사이면 
		// 입력한 값은 "입력받은값" 입니다.를 출력하시고 
		// 100보다 큰 경우는 너무 큰 값을 입력하셨습니다.를 출력
		// 0보다 작은값을 입력했다면 음수는 입력받을수 없습니다를 출력해주세요.
		
		// 내 문제풀이
//		int number ;
//		Scanner sc = new Scanner(System.in);
//		number = sc.nextInt();
//		
//		if(number<=100) {
//			System.out.println("");
//		}
//		else if(number>=100) {
//			System.out.println("너무 큰 값을 입력하셨습니다.");
//		}
//		else if(number>=0) {
//			System.out.println("음수는 입력받을수 없습니다.");
//			
//		}
		// 문제해결 ROADMAP (강사님 풀이)
		// 0을 기준으로 움직인다.
		// - 0보다 작은경우, 0~100사이, 100 이상
		
		// 값을 입력받을 변수 설정(입력받을 값이 정수)
//		int num;
//		Scanner scn = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요");
//		num = scn.nextInt();
//		// 1. 0보다 작은경우
//		if(num<0) {
//			System.out.println("음수는 입력하실수 없습니다.");
//		}// if end
//		// 2. 0~100 사이
//		else if(num>=0 && num <=100) {
//			System.out.printf("입력받은 값은 %d입니다." , num);  // %d 사용
//		}
//		// 3. 100이상
//		else if(num>=101) {
//			System.out.println("너무 큰 값을 입력하였습니다");
			
		
		
		// 순서도 
		// 어떠한 일을 처리하는 과정.
		// 프로그래밍 뿐만 아니라 문제의 분석, 디자인설계에서도 사용.
		
		
		//		1. 콜라 자판기 만들기
		
		//		금액을 입력받고 금액에 따라 결과를 출력
		        int num;
		        Scanner scn = new Scanner(System.in) ;
		        num = scn.nextInt();
				// 콜라의 가격보다 입력한 금액이 적다면
                // 잔액이 부족하여 콜라를 뽑을수 없습니다. 라는 메세지 출력
		        if(num>=0 && num <=1000) {
		        	System.out.println("잔액이 부족하여 콜라를 뽑을 수 없습니다.");
		        }	
		        else if(num>1000) {
	            	System.out.println("잔액이 없습니다.");
		//		그 외에는 콜라를 뽑고 남은 잔액을 계산하되
		//		투입한 금액과 가격이 같다면 잔액이 없습니다를 추가로 출력하세요.
	    //        else if(num==1000) {
	            		//System.out.println("잔액이 없습니다.");
	    //        	 }
		//		콜라의 가격은 1000원입니다.
		
		
	            }
	}
}





		
		


 	


