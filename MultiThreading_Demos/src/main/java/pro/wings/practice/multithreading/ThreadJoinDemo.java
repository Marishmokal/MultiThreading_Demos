package pro.wings.practice.multithreading;
class MyThread extends Thread
{
	static Thread mt;
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int j=0;i<10;i++)
			{
				System.out.println("child thread");
			}
		}
	}
}
public class ThreadJoinDemo {
public static void main(String[] args) throws InterruptedException {
	MyThread.mt= Thread.currentThread();
	MyThread t=new MyThread();
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
		Thread.sleep(2000);
	}
	
	
}
}
