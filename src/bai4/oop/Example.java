package bai4.oop;

public class Example {
	// overloading
	public String m1(String a) {
		return a;
	}

	// khác số lượng
	public String m1(String a, String b) {
		return "HelloWorld";
	}

	// khác kiểu dữ liệu
	protected int m1(String a, int b) {
		return 123;
	}

	// khác về vị trí
	String m1(int b, String a) {
		return "HelloWorld";
	}
}
