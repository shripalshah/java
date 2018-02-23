public class MultiThreadingMain {
	public static void main (String [] args) {
	Countdown countdown = new Countdown();
	CountDownThread thread1 = new CountDownThread(countdown);

	thread1.setName("Thread 1");
	CountDownThread thread2 = new CountDownThread(countdown);
	thread2.setName("Thread 2");
	thread1.start();
	thread2.start();
	}
}


class Countdown{
	int i;
	public void doCountDown() {
		String color;

		switch(Thread.currentThread().getName()) {
			case "Thread 1": 
				color = "Blue";
				break;
			case "Thread 2":
				color = "red";
				break;
			default: color= "black";
		}

		for(i = 10; i>0; i--) {
			System.out.println(color +": "+ i);
		}

	}
}


class CountDownThread extends Thread {
	private Countdown countdownthread;
	public CountDownThread(Countdown countdown){
		countdownthread = countdown;
	}
	
	public void run(){
	
			countdownthread.doCountDown();
		}
}