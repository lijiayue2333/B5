package hwday2;

public class Test {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setBalance(2000);
		Person p1 = new Person();
		p1.setName("Smith");
		acc1.setAccHolder(p1);
		
		Account acc2 = new Account();
		Person p2 = new Person();
		p2.setName("Kathy");
		acc2.setBalance(3000);
		
		acc1.deposit(2000);
		acc2.withdraw(2000);
		System.out.println(acc1.getBalance());
		System.out.println(acc2.getBalance());

	}
}
