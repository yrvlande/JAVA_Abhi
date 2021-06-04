package ThreadStudy;

public class TestWaiterNotify {
	
	public static void main(String args[]){

		Message msg = new Message("That Perfect");
		System.out.println("aaa");
		Waiter waiter = new Waiter(msg);
		Thread threadWaiter = new Thread(waiter, "WaiterThread");
		threadWaiter.start();
		
//		Notifier notifier = new Notifier(msg);
//		
//		Thread threadNotifier = new Thread(notifier,"NotifierThread");
//		
//		threadNotifier.start();
//		
		System.out.println("From Main");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized(msg){
			msg.notify();
		}
		
	}
	

}
