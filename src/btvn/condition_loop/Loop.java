package btvn.condition_loop;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		l1(scanner);
		System.out.println("-------------");
		l2();
		System.out.println("-------------");
		l5();
	}

	public static void l1(Scanner scanner) {
		System.out.println("Nhập 1 số bất kỳ:");
		int number = scanner.nextInt();
		int result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		System.out.println("Giai thừa của " + number + " là: " + result);
	}

	public static void l2() {
		int number = 1;
		int count = 1;
		while (count < 21) {
			if (checkPrime(number)) {
				System.out.println(number);
				count++;
			}
			number++;
		}
	}

	public static boolean checkPrime(int number) {
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void l5() {
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println("HelloWorld");
			} else if (i % 3 == 0) {
				System.out.println("Hello");
			} else if (i % 5 == 0) {
				System.out.println("World");
			} else {
				System.out.println(i);
			}
		}
	}
}
