package basic;

public class Firstprogram {
	String CustomerName ="krishna";
	int balance = 10000;

	
	void debit(int withdraw) {
		int remainingbalance  = balance - withdraw;
	}
	
	void credit(int added) {
		int remainingbalance = balance + added;
	}
	
	void displaybalance() {
		//System.out.println(balance);
		System.out.println(CustomerName.length());
	}
	
	public static void main(String[] args) {
		Firstprogram test = new Firstprogram();
		test.debit(4000);
		test.credit(5445);
		test.displaybalance();
	}
}
