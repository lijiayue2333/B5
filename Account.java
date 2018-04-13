package hwday2;

import java.util.Random;

public class Account {
	Random r = new Random();
	private long accNum = r.nextLong();
	private double balance;
	private Person accHolder;
	
	public void deposit(double money) {
		balance += money;
	}
	public boolean withdraw(double money) {
		if(this.getBalance() - money >= 500) {
			this.setBalance(this.getBalance() - money); 
			return false;
		}
		else {
			System.out.println("Balance can not be less than 500!");
			return true;
		}
	}
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder.toString() + "]";
	}
	
}
