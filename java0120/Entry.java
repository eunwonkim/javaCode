package java0120;

//(1)선조클래스 : Entry
 class Entry {
// 필드명 : String word;
 public String word;
//메소드 : Entry() //***약어사전***  (출력)
 public Entry() {    //Entry()호출 
	System.out.println("***약어사전***"); //sysout으로 약어출력
 }
	public Entry(String w) {  
		this();
		word=w;
	}
		public void writenView() {
			System.out.println("약어출력:"+this.word);
		}
 }


                           
                    
             
