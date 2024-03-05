package bai10;

public class Main {
	public static void main(String[] args) {
		Thread thread1 = new Demo("Thread1");
		Thread thread2 = new Demo("Thread2");
		// phương thức để luồng bắt đầu hoạt động
		// luồng sẽ thực thi phương thức run()
		thread1.start();
		thread2.start();
//		thread1.run();
//		thread2.run();
	}
}
