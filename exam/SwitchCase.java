package exam;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // switch문
		// 주어진 조건값의 결과에 따라 프로그램이 다른 명령을 수행하도록 하는 조건문
		
		// switch문의 장점
		// 1. 가독성이 if문보다 뛰어나다.
		// 2. 컴파일러 입장에서 최적화가 쉬워서 속도가 빠르다.
		
		//		switch(조건값) {
		//		case 값1: 
		//			조건에 맞다면 실행하는 명령문;
		//			break;
		//		default;
		//		    조건값이 어디에도 해당하지 않으면 실행하는 명령문;
		//		    break;
		//		}
		// 알파벳이 자음인지 모음인지 체크
		// break : 코드의 실행을 중단시키는 키워드
		// 만약 switch case에서 break를 쓰지 않는다면 그 이후 등장하는
		// 모든 case 절과 defalut 절을 실행하게된다.
        
//		char c = 'e';
//		
//		switch(c) {
//		    case 'a': 
//                 System.out.println("해당 문자는 a입니다.");
//				break;
//			  
//			  case 'e': 
//	                 System.out.println("해당 문자는 e입니다.");
//					break;
//			  case 'i': 
//	                 System.out.println("해당 문자는 i입니다.");
//					break;		
//			  case 'o': 
//	                 System.out.println("해당 문자는 o입니다.");
//					break;
//			  case 'u': 
//	                 System.out.println("해당 문자는 u입니다.");
//					break;
//			  default:

				  
					char c = 'A';
					// 대소문자까지 구분하는 자음 모음 판단 프로그램
					switch(c) {
					    case 'a': 
			            case 'e': 
				        case 'i': 
				        case 'o':  
				        case 'u': 
				                 System.out.printf("해당 문자는 %c입니다.", c);
								break;
					    case 'A': 
			            case 'E': 
				        case 'I': 
				        case 'O': 
				        case 'U': 
				                 System.out.printf("해당 문자는 %c입니다.", c);
								break;
							default:
					             System.out.println("해당 문자는 자음 입니다.");
							  break;
						  
		} 
		// switch~case문은 if문에 비해 굉장히 직관적이다.
		// 하지만 단점으로는
		// 1. 조건으로 줄수 있는 값에 대한 범위가 한정적이다.
		
	}

}
