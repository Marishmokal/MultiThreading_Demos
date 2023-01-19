package pro.wings.multithreading;
class MyThreadd extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
public class ThreadYieldDemo {
public static void main(String[] args) {
	MyThreadd t1=new MyThreadd();
	
	t1.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
	}
}
}
