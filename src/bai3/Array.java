package bai3;

public class Array {
	public static void main(String[] args) {
		// 2 cách khai báo mảng
		// khai báo trực tiếp bằng ngoặc nhọn
		int[] ints = {}; // khai báo 1 mảng rỗng
		int[] ints1 = {5,6,7,10,12};
		// 5,6,7 là các phần tử trong mảng
		// vị trí tương ứng: 5 là 0; 6 là 1; 7 là 2
		// vị trí này giúp truy xuất giá trị tương ứng hoặc là gán giá trị mới
		// độ dài mảng (length) = 3
		// truy xuất phần tử ở vị trí 2
		System.out.println(ints1[2]);
		System.out.println(ints1.length);
		
		for (int i = 0; i < ints1.length; i++) {
			System.out.println("Vị trí: " + i  + "; giá trị: " + ints1[i]);
		}
		
		// for each: truy xuất nhanh giá trị của mảng
		for (int value : ints1) {
			System.out.println(value);
		}
		
		// thêm giá trị 100 vào vị trí số 2
		System.out.println("----");
		int[] newArr = new int[ints1.length + 1];
		
		for (int i = 0; i < ints1.length; i++) {
			if (i < 2) {
				newArr[i] = ints1[i];
			} else {
				newArr[i + 1] = ints1[i];
			}
		}
		newArr[2] = 100;
		
		for (int value : newArr) {
			System.out.println(value);
		}
		
		// khai báo bằng từ khóa new
		System.out.println("----");
		int[] ints2 = new int[5];
		System.out.println(ints2.length);
		System.out.println(ints2[2]);
		System.out.println(ints2[4]);
	}
}
