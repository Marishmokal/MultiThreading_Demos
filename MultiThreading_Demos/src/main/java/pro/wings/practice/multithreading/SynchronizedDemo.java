package pro.wings.practice.multithreading;


class Display
{
	public synchronized void displayn()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("i");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	public synchronized void displayc()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread
{
	Display d;

	public MyThread1(Display d) {
		super();
		this.d = d;
	}
	
	public void run()
	{
		d.displayn();
	}
}
class MyThread2 extends Thread
{
	Display d;

	public MyThread2(Display d) {
		super();
		this.d = d;
	}
	public void run()
	{
		d.displayc();
	}
}
public class SynchronizedDemo {
public static void main(String[] args) {
	Display d=new Display();
	MyThread1 t1=new MyThread1(d);
	MyThread2 t2=new MyThread2(d);
	t1.start();
	t2.start();
}
}
