package cn.mtianyan.queue;

public class Queue {
	private int n;
	boolean flag=false; // false表示容器中没有数据了
	
	public synchronized int get() {
		if(!flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("消费："+n);
		flag=false; // 消费完毕，容器中没有数据
		notifyAll();
		return n;
	}

	public synchronized void set(int n) {
		if(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("生产："+n);
		this.n = n;
		flag=true; // 生产完毕，容器中已经有数据
		notifyAll();
	}
}
