package ThreadStudy.recentPractive;

public class WaiterClass implements Runnable {
	
	public Message msg=null;
	
	public WaiterClass(Message msg) {
		this.msg = msg;
	}
	
	public void run() {
		System.out.println("Thread Name Started " + Thread.currentThread().getName());
		
		synchronized(msg) {
			try {
				msg.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String txtMessage = msg.getMessage();
		System.out.println("Waiter");
        if(txtMessage.equals(null))  
		System.out.println("The Message has not yet set");
        
        else
        	System.out.println(txtMessage);

}
}