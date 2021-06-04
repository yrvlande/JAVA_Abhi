package ThreadStudy;

public class Notifier implements Runnable {
	
	public Message msg;
	public Notifier(Message msg){
		this.msg=msg;
	}
	
	@Override
	public void run(){
		System.out.println("Thread Started " +Thread.currentThread().getName()+ " On " + System.currentTimeMillis());
		
	    msg.setMessage("I am From Notifier");
	    
	    synchronized(msg){
	    	msg.notify();
	    }
		
	}

}
