package ThreadStudy;

public class Waiter implements Runnable {
	
	public Message msg;
	
	public Waiter(Message msg){
		this.msg = msg;
	}

	@Override
	public void run(){
		System.out.println("Thread started - " + Thread.currentThread().getName()+ " On " +System.currentTimeMillis());
		
		synchronized (msg) {
			try {
				
				msg.wait();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println(msg.getMessage());
	}
	
}
