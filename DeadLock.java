package BasicProgram;

public class DeadLock {
	public static void main(String[] args) {  
	    String resource1 = "paper";  
	    String resource2 = "pen";  
	   
	Thread t1 = new Thread() {  
	public void run() {  
	synchronized (resource1) {  
	  System.out.println("Andrew has paper");  
	  
	  try { 
		  Thread.sleep(100);
		  } catch (Exception e) {
			  
		  }  
	  
	synchronized (resource2) {  
	  System.out.println("Mani has pen");  
	 }  
  }  
 }  
};  
	  
	 Thread t2 = new Thread() {  
	 public void run() {  
	 synchronized (resource2) {  
	   System.out.println("Mani has pen");  
	   try { 
		   Thread.sleep(100);
		   } catch (Exception e) {
			   
		   }  
	 synchronized (resource1) {  
	            System.out.println("Andrew has paper");  
	          }  
  }  
  }  
 }; 	      
	 t1.start();  
	 t2.start();  
}  
}       