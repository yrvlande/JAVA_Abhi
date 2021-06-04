package ThreadStudy.recentPractive;

public class TestMessaging {
	
	public static void main(String[] args) throws InterruptedException {
		
		Message message = new Message();
		
		NotifierClass notifier = new NotifierClass(message);
		WaiterClass waiter = new WaiterClass(message);
		
		Thread thread1 = new Thread(waiter, "Waiter Thread");
		thread1.start();
		thread1.join(10000);
		Thread thread2 = new Thread(notifier,"Notifier Thread");
	     thread2.start();
	}

}
