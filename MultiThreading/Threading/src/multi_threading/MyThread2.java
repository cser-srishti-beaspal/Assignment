package multi_threading;

public class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 1;i<=5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("user defined thread: "+i);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
