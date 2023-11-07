
public interface Payment {
	
	void processPayment();
	void generaterecipt();

}
class CreditCardPayment implements Payment{

	public void processPayment() {
		System.out.println("done");
		
	}

	
	public void generaterecipt() {
		System.out.println("generating...");
		
		
	}
	
}
class PayPalpayment implements Payment{
	public void processPayment() {
		System.out.println("done");
		
	}

	
	public void generaterecipt() {
		System.out.println("genarating...");
		
		
	}
	
}
