package cn.mtianyan.thread;
// 继承Thread，重写run 就是一个线程
class MyThread extends Thread{
	public void run(){
		System.out.println(getName()+"该线程正在执行！");
	}
}
public class ThreadTest {

	public static void main(String[] args) {
	    System.out.println("主线程1");
		MyThread mt=new MyThread();
		mt.start(); // 启动线程
        // 主方法本身主线程 和 My thread
//		mt.start(); // 线程只能启动一次
		System.out.println("主线程2");
	}

}
