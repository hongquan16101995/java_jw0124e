package bai5;

import java.util.Scanner;

public class Test extends Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int a = 10;
		final Demo demo = new Demo();
		System.out.println(demo.name);
		demo.name = "abc";
		System.out.println(demo.name);
	}

	@Override
	public void m1() {
		System.out.println("xyz");
	}
}
