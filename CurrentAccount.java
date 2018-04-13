package hwday2;

public class CurrentAccount extends Account {
	final private double OVERDRAFTLIMIT = 500;
	
	public boolean withdraw(double money) {
		if(getBalance() - money >= OVERDRAFTLIMIT) {
			setBalance(this.getBalance() - money);
			return false;
		}
		else {
			return true;
		}
	}
}
