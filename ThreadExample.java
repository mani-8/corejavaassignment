package BasicProgram;

public class ThreadExample extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().getName()+ " is running!!!");
	}
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		ThreadExample t3 = new ThreadExample();
      
        
	/*String thread_1 = t1.getName();
	System.out.println("thread 1 is : "+ thread_1);
	
	String thread_2 = t2.getName();
	System.out.println("thread 2 is : "+ thread_2);*/
	
	t1.setName("first thread");
	t2.setName("Second thread");
	t3.setName("third thread");
	
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	
	System.out.println("The priority for thread 1 "+t1.getPriority());
	System.out.println("The priority for thread 2 "+t2.getPriority());
	System.out.println("The priority for thread 3 "+t3.getPriority());
	
	t1.start();
	t2.start();
	t3.start();

	}

}
