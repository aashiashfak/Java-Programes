import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("choose 1.creditcardpayment 2.paypalpayment");
		Scanner sc=new Scanner(System.in);
		int payment=sc.nextInt();
		switch (payment) {
		case 1:
			CreditCardPayment c=new CreditCardPayment();
			c.processPayment();
			c.generaterecipt();
			break;
		case 2:
			PayPalpayment p=new PayPalpayment();
			p.processPayment();
			p.generaterecipt();	
			break;
		default:
			System.out.println("Invalid entry");
			
			
		}
	}

}
