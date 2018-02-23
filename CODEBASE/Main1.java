public class Main1 {
	public static void main (String[] args) {
		// Running code on the main thread
		System.out.println("Hello from the main thread!"); 
	 
		Thread anotherThread = new AnotherThread();
		anotherThread.setName("Shripal");
	// Invoke the run method/ start method
		anotherThread.start();

		System.out.println("After!");
		new Thread() {
			public void run() {
				System.out.println("Hello World!");
			}
		}.start();
		for(int i=0; i<=1; i++)
			if(i==1 )
				System.out.println("It's 10000");


			/*
				Runnable Thread
			*/

			/*	Thread myRunnableThread = new Thread(new MyRunnable());
				myRunnableThread.start();*/

				// now for anonymous class implementrunnable and pass the instance in the thread constructor.

				Thread myRunnableThread = new Thread(new MyRunnable(){
					@Override
					public void run() {
						System.out.println("Will be waiting for another thred");
						try{
							anotherThread.join(5000);
							System.out.println("Waited for Another Thread");
						}catch(InterruptedException e) {
							System.out.println("I couldn't wait after all. I was interrupted");
						}
					}});
				myRunnableThread.start();
				//anotherThread.interrupt();
				
		System.out.println("Hello again frm the main thread");
	}
}    