package concurrency;

public class BanlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bankAccount = new BankAccount(100000);
		
		Thread boy = new Thread(bankAccount);
		boy.setName("boy");
		
		Thread girl = new Thread(bankAccount);
		girl.setName("girl");
		
		boy.start();
		girl.start();
		
		try {
			boy.join();
			girl.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Final Balance : "+ bankAccount.getBalance());
	
	}

}
