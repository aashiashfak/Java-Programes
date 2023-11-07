 class Vehicle {
	
	String vehicleType;
	int rentalRate;
	public void vehicletype(String b) {
		vehicleType=b;
	
		
	}
	public void rentalrate(int a) {
		rentalRate=a*30;
	 
	
	}
	void display() {
        System.out.println("NAME: "+vehicleType+" RENT:" +rentalRate);
	}
}
class Car extends Vehicle{
	
}
class Motorcycle extends Vehicle{
	
}
class Van extends Vehicle{
	
} 
 class Main{
	
	public static void main(String[] args) {
		Car v1=new Car();
		v1.vehicletype("Swift");
		v1.rentalrate(1000);
		v1.display();
		Motorcycle v2=new Motorcycle();
		v2.vehicletype("Ninja");
		v2.rentalrate(2000);
		v2.display();
		Van v3=new Van();
		v3.vehicletype("Van");
		v3.rentalrate(2500);
		v3.display();
		
	}
}

