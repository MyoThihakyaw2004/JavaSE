package concurrency;

public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread thread1 = new DemoThread();
		thread1.setName("thread 1");
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread1.start(); // Becomes runnable
		System.out.println("Thread 1 is alive? " + thread1.isAlive());
		
		try {
			thread1.join();
			System.out.println("Thread 1 is alive? " + thread1.isAlive());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DemoThread thread2 = new DemoThread();
		thread2.setName("thread 2");
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread2.start();
		
		Task task1 = new Task();
		Thread thread3 = new Thread(task1);
		thread3.setName("Thread3");
		thread3.setPriority(7);
		thread3.start();
		
		Thread thread4 = new Thread(task1);
		thread4.setName("Thread4");
		thread4.setPriority(4);
		thread4.start();
		
		Thread thread5 = new Thread(() -> {
			for (int i = 100; i < 1000; i += 100) {
				System.out.println(Thread.currentThread().getName());
			}
		});
		
		thread5.setName("Thread5");
		thread5.start();
		
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println(Thread.currentThread() + " do main process");
		
		
	}

}
