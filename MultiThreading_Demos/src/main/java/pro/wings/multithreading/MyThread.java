package pro.wings.multithreading;

public class MyThread extends Thread{

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("child thread");
		}
	}
}
