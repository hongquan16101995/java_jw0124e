package bai10;

public class Demo extends Thread {
	String name;
	Test test = new Test();

	public Demo(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		this.test.m1(this.name);
		this.test.m2(this.name);
	}

}
