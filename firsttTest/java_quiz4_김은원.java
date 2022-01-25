package firsttTest;


import java.util.Scanner;

interface Stack {
   int length(); 
   int capacity(); 
   String pop(); 
   boolean push(String val); 
}
public class java_quiz4_������ {

	interface Stack {
		   int length(); 
		   int capacity(); 
		   String pop(); 
		   boolean push(String val); 
		}
	class StringStack implements Stack {
		   private int num; 
		   private int set; 
		   private String[] stack;
		   public StringStack(int num) {
		      this.num = num;
		      this.set = 0;
		      stack = new String[num];
		   }
		   public int length() {
		      return set;
		   }
		   public int capacity() {
		      return stack.length;
		   }
		   public String pop() {
		      if(set-1 < 0)  
		         return null;
		      set--; 
		      String s = stack[set]; 
		      return s;
		   }
		   public boolean push(String val) {
		      if(set < num) {
		         stack[set] = val; 
		         set++; 
		         return true;
		      }
		      else
		         return false;
		   }
		}

		public class StackApp {

		   public void main(String[] args) {
		      // TODO Auto-generated method stub
		      Scanner sc = new Scanner(System.in);
		      System.out.print("�� ���� ���� ������ ũ�� �Է� >> ");
		      int num = sc.nextInt();
		      StringStack stack = new StringStack(num);
		      while(true) {
		         System.out.print("���ڿ� �Է� >> ");
		         String val = sc.next();
		         if(val.equals("�׸�"))
		            break;
		         if(!stack.push(val)) {
		            System.out.println("������ �� ���� Ǫ�� �Ұ�!");
		         }
		      }
		      System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
		      int len = stack.length();
		      for(int i=0; i<len; i++) {
		         String s = stack.pop();
		         System.out.print(s+" ");
		      }
		      sc.close();
		   }

		}

	}

