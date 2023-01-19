package pro.wings.multithreading;

public class ThreadDemo {
public static void main(String[] args) {
	MyThread m1=new MyThread();
	m1.start();
	
	for(int i=0;i<3;i++)
	{
		System.out.println("main thread");
	}
}
}
