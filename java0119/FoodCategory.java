package java0119;

 enum FoodCategory{
	 KAL("Į����", 7500), CHICKEN("ġŲ", 18000), PIZZA("����", 20000);
	 
	 int price;
	 String name;
	 
	 FoodCategory(String name, int price){
		 this.name = name;
		 this.price = price;
		 
	 }
 }
