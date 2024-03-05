package concurrency;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		doProcess();
	}
	
	private void doProcess() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread()+" do process "+i);
		}
	}
}
