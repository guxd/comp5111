package hk.ust.cse.comp5111;

public class Task implements Runnable{

	static int shared;
	static int shared_protected;
	int not_shared;
		
	public void run() {
		 System.out.println(shared++);
		 synchronized(Task.class) {
		     System.out.println(shared_protected++);
		 }
	     System.out.println(not_shared++);
	}
		
	public static void main(String[] args) {
		 Task task1 = new Task();
		 Task task2 = new Task();
		 Thread thread1 = new Thread(task1);
		 Thread thread2 = new Thread(task2);
		 thread1.start ();
		 thread2.start ();
	}
 }

