package exam;

public class strMethods {

	public static void main(String[] args) {
	// strMethods
	// indexOf : 문자열에서 특정 문자가 시작되는 위치를 리턴하는 메서드
	//            01234 
	//String idx = "happy lunch time";
	//System.out.println(idx.indexOf("time"));
	// 만약 찾는 문자가 없다면 -1을 출력.
	//System.out.println(idx.indexOf("hungry"));
	
	// contains : 문자열에서 특정 문자열이 포함되어 있는가의 여뷰를 리턴하는 메서드
	//System.out.println(idx.contains("time"));
	// 만약 찾는 문자가 없다면 -1을 출력.
	//System.out.println(idx.contains("nch"));
	
	//equals : 두개의 문자열이 동일한지를 비교해 결과값을 리턴.
	
    //String equ1 = "hello";
    //String equ2 = "lunch";
    //String equ3 = "hello";
    //String equ4 = new String("hello");
    
    //System.out.println(equ1.equals(equ3));
    //System.out.println(equ1.equals(equ2));
    //System.out.println(equ1==equ4);
    // ==<< 값이 똑같은지 확인표시
    String idx = "happy lunch time";
    String idx2 = "hello everybody";
    
    // charAt, substring
    // charAt : 문자열에서 특정한 위치의 문자를 뽑아낼때 사용
    // ex) y
    System.out.println(idx.charAt(4));
    
    // substring : 문자열중에 특정 부분을 뽑아낼 경우 사용
    // ex) hell
    System.out.println(idx2.substring(0, 4));
    
    // replace(char타입), replaceAll(String타입)
    // replaceAll은 정규표현식이 사용 가능하다.
    String repl1 = "test";
    System.out.println(repl1.replaceAll("st", "ji"));
    // ex) teji로 결과물이 나옴
    
    //toUpperCase(모두 대문자), toLowerCase(모두 소문자)
    // ex) FUNNY JAVA / funny java
   String case1 = "Funny Java";
    String result1 = case1.toUpperCase();
    String result2 = case1.toLowerCase();
    
    System.out.println(case1.toUpperCase());
    System.out.println(case1.toLowerCase());
    
    //split ★★★★★★
    // 문자열을 특정 구분자로 분리.
    
    String case2 = "q:w:e:r";
    String[] resilt = case2.split(":");
    System.out.println(resilt[0]);

    
    
    }
}
    
