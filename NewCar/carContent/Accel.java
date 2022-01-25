package NewCar.carContent;

class Accel {
    
	String name;
	
	Accel(String carName) {
		this.name = carName; 
	}
	
	void push() {
		System.out.println(String.format("%s°¡ ÀüÁø!", name));
		
	}


}
