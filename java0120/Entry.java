package java0120;

//(1)����Ŭ���� : Entry
 class Entry {
// �ʵ�� : String word;
 public String word;
//�޼ҵ� : Entry() //***������***  (���)
 public Entry() {    //Entry()ȣ�� 
	System.out.println("***������***"); //sysout���� ������
 }
	public Entry(String w) {  
		this();
		word=w;
	}
		public void writenView() {
			System.out.println("������:"+this.word);
		}
 }


                           
                    
             
