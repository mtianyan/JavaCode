package cn.mtianyan.runnable;

class PrintRunnable implements Runnable {

	@Override
	public void run() {
		int i = 1; // 资源
		while (i <= 10)
			System.out.println(Thread.currentThread().getName() + "正在运行" + (i++));
	}

}

public class Test {

	public static void main(String[] args) {
		PrintRunnable pr = new PrintRunnable();
		Thread t1 = new Thread(pr);
		t1.start();
		// PrintRunnable pr1 = new PrintRunnable();
		Thread t2 = new Thread(pr);
		t2.start();

	}

}
