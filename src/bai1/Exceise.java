package bai1;

public class Exceise {
	public static void main(String[] args) {
		int a = 6; // a = 6; b,c,d = undefined
		int b = ++a; // a = 7; b = 7; c,d = undefined
		int c = b++; // a = 7; b = 8; c = 7; d = undefined
		int d = ++b; // a = 7; b = 9; c = 7; d = 9
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println("------------");

		int num1 = 6;
		int num2 = 7;
		int num3 = 6;
		int num4 = 7;
		System.out.println((num1 < num2) && (num1++ > num2));
		System.out.println((num3 > num4) && (num3++ > num4));
		System.out.println(num1);
		System.out.println(num3);
		// kết quả: false false 7 6
		// lý do num3 = 6 là do toán tử logic && còn được gọi là
		// toán tử đoản mạch.
		// vế trái của && đã sai, thì vế phải sẽ không được thực thi nữa
		// vế trái của || đã đúng, thì vế phải sẽ không được thực thi nữa
	}
	// Sơn, Việt: 6 7 7 9
	// Kiệt, Trung, Duy: 6 7 7 8
	// Minh: 7 8 7 8
	// Hoàng: 7 8 8 9
	// Hải: 7 7 7 9
	// Hưng: 7 9 7 9 => true
}
