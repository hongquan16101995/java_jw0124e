package bai6.interface_demo;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Bird bird = new Bird();
		bird.canFly("Bird");
		Plain plain = new Plain();
		plain.canFly("Plain");
		cat.m1();
	}
}
