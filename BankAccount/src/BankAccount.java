
public class BankAccount {
	private int accountNumber=12435669;
	private float balance;
	private String ownerName;
	
	public float getBalance() {
		return balance;
	}
	
	public String getOwnerName() {
		
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
    public void depBalance(float credit){
    	balance=balance+credit;	
    }
    public void withdrawBalance(float debit){
    	balance=balance-debit;
    }
	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.setOwnerName("Aashi");
		b1.getOwnerName();
		System.out.println(b1.getOwnerName());
		b1.depBalance(1000);
		b1.depBalance(5000);
		b1.withdrawBalance(2000);
		b1.getBalance();
		System.out.println("$"+b1.getBalance());
	    BankAccount b2=new BankAccount();
	    b2.setOwnerName("Raju");
	    b2.getOwnerName();
	    System.out.println(b2.getOwnerName());
	    b2.depBalance(1000);
	    b2.withdrawBalance(200);
	    b2.depBalance(100);
	    System.out.println("$"+b2.getBalance());
	    
	    
	}
}
 



