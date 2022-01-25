package java0120;

public class Entrysub extends Entry{
public String definition;
int year;
 public Entrysub(String W) {
	 super(W);
 }
 public Entrysub(String w,String d, int y) {
 this(w);
 definition = d;
 year = y;
 }
 public void printview() {
	 System.out.println("원어:" +this.definition);
	 System.out.println("시기출력:"+this.year);
 }
}
