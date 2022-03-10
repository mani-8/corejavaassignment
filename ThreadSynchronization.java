package BasicProgram;

class NumberTable{
 synchronized static void printTable(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " :"+n*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

/*class Thread1 extends Thread{
	NumberTable number_Table;
	public Thread1(NumberTable nt) {
		number_Table=nt;
	}
	public void run() {
		number_Table.printTable(5);
	}
}

class Thread2 extends Thread{
	NumberTable number_Table;
	public Thread2(NumberTable nt) {
		number_Table=nt;
	}
	public void run() {
		number_Table.printTable(10);
	}
}
*/

public class ThreadSynchronization {
 public static void main(String[] args) {
	 //Anonymous class
	 Thread t1=new Thread() {
		 public void run() {
			 NumberTable.printTable(5);
		 }
	 };
	 Thread t2=new Thread() {
		 public void run() {
			 NumberTable.printTable(10);
		 }
	 };
	 
	 Thread t3=new Thread("Thread 3") {
		 public void run() {
			 NumberTable.printTable(20);
		 }
	 };
	 Thread t4=new Thread("Thread 4") {
		 public void run() {
			 NumberTable.printTable(30);
		 }
	 };
	 
	 t1.setName("Thread 1");
	 t2.setName("Thread 2");
	 
	 t3.getPriority();
	 
	 t1.setPriority(Thread.MAX_PRIORITY);
	 t2.setPriority(Thread.NORM_PRIORITY);
	 t3.setPriority(2);
	 t4.setPriority(Thread.MIN_PRIORITY);
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 t4.start();
 }
}

