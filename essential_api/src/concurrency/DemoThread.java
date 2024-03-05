package concurrency;

public class DemoThread extends Thread {
	
	public void run() {
		doProcess();
	}

	private void doProcess() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(currentThread() + " do process " + i);
		
		}
	}
}
