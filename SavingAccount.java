package hwday2;

public class SavingAccount extends Account {
	private final double MINBALANCE = 500;
	public boolean withdraw(double money) {
		if(getBalance() - money >= MINBALANCE) {
			setBalance(getBalance() - money);
			return true;
		}
		else {
			System.out.println("Balance can not be less than 500!");
			return false;
		}
	}
}
