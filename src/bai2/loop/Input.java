package bai2.loop;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		int number = 0;
//		while (number != 100) {
//			System.out.println("Nhập số gì đó: ");
//			number = scanner.nextInt();
//		}
//		System.out.println(number);
//		
//		// do while
//		int number1;
//		do {
//			System.out.println("Nhập số gì đó: ");
//			number1 = scanner.nextInt();
//		} while (number1 != 100);
//		System.out.println(number1);
		scanner.close();

		// break - continue
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}

		System.out.println("----------");
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
