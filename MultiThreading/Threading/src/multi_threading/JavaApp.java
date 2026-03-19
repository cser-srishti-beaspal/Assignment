package multi_threading;

public class JavaApp {
	public static void execution() {
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2);
		thread.start();
		
		for(int i = 1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("pre defined thread: "+i);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
//		MyThread1 myThread1 = new MyThread1();
		
	}
}
