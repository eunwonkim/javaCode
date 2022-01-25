package NewCar.carContent;

public class Engine {
	String name;   //(필드값 생성)
	// 시동이 걸렸는지 유무를 체크하는 필드 생성
	boolean isStrarted = false; //boolean 메소드는 true, fasle
	
	// 생성자
	Engine(String carName){
	    this.name = carName;
	}
	
	// 시동걸기
	// isStarted 필드를 이용해서
	
	void satrt() {
	   if(isStrarted) {
		   System.out.println(String.format("%S는 이미 시동이 걸려있음", name));
		   return;
	   }
	   isStrarted = true;
	   System.out.println("부릉부릉!");
	}
	
	//멈추기, 
	void off() {
		   if(!isStrarted) {
			   System.out.println(String.format("%S는 이미 시동이 꺼져있음", name));
			   return;
		   }
		   isStrarted = false;
		   System.out.println("시동 off");
	
	}
	
	
	
}
