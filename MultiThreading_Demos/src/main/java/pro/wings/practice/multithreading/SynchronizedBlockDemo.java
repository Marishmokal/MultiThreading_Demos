package pro.wings.practice.multithreading;
class Display1
{
	public void wish(String name)
	{
		
		synchronized (this) {
			for(int i=1;i<=2;i++)
			{
				System.out.println("good morning");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(name);
			}
			
		}
	}


}
class MyThread5 extends Thread
{
	Display1 d;
	String name;
	public MyThread5(Display1 d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
	
	
}
public class SynchronizedBlockDemo {
public static void main(String[] args) {
	Display1 d=new Display1();
	MyThread5 t1=new MyThread5(d,"dhoni");
	MyThread5 t2=new MyThread5(d,"Yuvraj");
	t1.start();
	t2.start();
}
}
