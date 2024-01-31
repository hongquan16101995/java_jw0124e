package btvn.condition_loop;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		c1(scanner);
//		c2(scanner);
		c3(scanner);
	}

	public static void c1(Scanner scanner) {
		System.out.println("Nhập vào số thứ 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Nhập vào số thứ 2: ");
		int number2 = scanner.nextInt();
		System.out.println("Nhập vào số thứ 3: ");
		int number3 = scanner.nextInt();
		int maxNumber;

		if (number1 > number2 && number1 > number3) {
			maxNumber = number1;
		} else if (number2 < number3) {
			maxNumber = number3;
		} else {
			maxNumber = number2;
		}

		System.out.println("Số lớn nhất là: " + maxNumber);
	}

	public static void c2(Scanner scanner) {
		System.out.println("Nhập vào điểm số cần xếp loại: ");
		int point = scanner.nextInt();
		String rank;

		if (point > 8) {
			rank = "Giỏi";
		} else if (point > 6.5) {
			rank = "Khá";
		} else if (point > 5) {
			rank = "Trung bình";
		} else {
			rank = "Yếu";
		}
		System.out.println("Xếp loại của sinh viên trên là: " + rank);
	}

	public static void c3(Scanner scanner) {
		System.out.println("Nhập vào 1 số bất kỳ: ");
		int number = scanner.nextInt();
		String str;

		if (number < 0) {
			str = "Nagetive";
		} else if (number > 0) {
			str = "Positive";
		} else {
			str = "0";
		}
		System.out.println("Giá trị của số là: " + str);

		// toán tử 3 ngôi; cú pháp: điều kiện ? khi điều kiện đúng : khi điều kiện sai
		// thường dùng để gán giá trị cho 1 biến theo 1 điều kiện nào đó
		String str1 = (number > 0 ? "Positive" : (number < 0 ? "Negative" : "0"));
		System.out.println("Giá trị là: " + str1);
	}
}
