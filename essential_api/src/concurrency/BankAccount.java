package concurrency;

public class BankAccount implements Runnable {
	private int balance;
		
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
			
	@Override
	public void run() {
		// TODO Auto-generated method stub
		withdraw(80000);
	}

	// bank account object -> unique single key
	// The faster thread will get the key
	// Other thread will have to wait, until the first thread
	// dies and releases the key
	private synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+ " is about to withdraw money");
		if (balance >= amount) {
			balance -= amount;
			System.out.println(Thread.currentThread().getName()+" withdraw "+amount);
		} else {
			System.out.println("Sorry "+Thread.currentThread().getName()+". Insufficient balance");
		}
	}
	
	public synchronized int getBalance() {
		return balance;
	}
}
