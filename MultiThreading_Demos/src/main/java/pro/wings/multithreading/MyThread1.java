package pro.wings.multithreading;

public class MyThread1 {

}
class Test
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread t1=new MyThread();
		System.out.println(t1.getName());
		Thread.currentThread().setName("Pawan Kalyan");
		System.out.println(Thread.currentThread().getName());
	}
}