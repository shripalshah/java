public class AnotherThread extends Thread {
	@Override
	public void run(){
		System.out.println("Hello from another thread!"+ currentThread().getName());
		try{
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {
			System.out.println("Another thread woke me up"+ e);
			return;
		}
		System.out.println("TEN seconds have passed and I'm awake");
	}
} 