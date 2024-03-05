package bai10;

public class Test {
	public void m1(String name) {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + ": " + i);
		}
	}

	public synchronized void m2(String name) {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + ": " + name + i);
		}
	}
}
