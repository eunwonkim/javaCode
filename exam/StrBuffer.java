package exam;

public class StrBuffer {

	public static void main(String[] args) {
		
		//StringBuffer : 문자열을 추가하거나 변경할때 주로 사용하는 자료형
		// 문자 추가시 객체를 따로 생성할 필요가 없기 때문에 메모리 사용에서 이득을 
		// 많이 가져갈수 있음.
		// 메모리를 효과적으로 쓰기위해서
		
		// stringBuffer의 모순점
		// 자료형 크기 자체가 무거운편. (string의 2배) -> 더 큰 바이트를 가져간다.
		// String과 Stringbuffer는 전략적으로 선언이 필요
		
		// StringBuffer : 변경작업이 많을때
		// String : 변경작업이 거의 없을때
		
   // 퀴즈
  //  다음의 문장을 출력해보세요(방법을 자유롭게)
 //  hello 2022 java web devTeam
		//int a = 2022;
	    //System.out.println("hello"+ a );
		//강사님 풀이
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
