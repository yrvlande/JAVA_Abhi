package ThreadStudy.recentPractive;

public class NotifierClass implements Runnable {
	public Message msg;
	
	public NotifierClass(Message msg) {
		this.msg = msg;
	}
	@Override
	public void run() {
		System.out.println("Thread Name Started " + Thread.currentThread().getName());
		this.msg.setMessage("Messeging done");
		System.out.println("Notifier");
		synchronized(msg) {
			msg.notify();
		}
		}
	
	
	

}
