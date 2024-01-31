package bai2.condition;

public class DemoSwitch {
	public static void main(String[] args) {
//		int a = 7;
//		if (a > 10) {
//			System.out.println(a + " lớn hơn 10");
//		} else if (a < 5) {
//			System.out.println(a + " nhỏ hơn 5");
//		} else {
//			System.out.println(a);
//		}		

		// if lồng
		int b = 7;
		if (b > 10) {
			if (b > 20) {
				System.out.println(b + " lớn hơn 20");
			} else {
				System.out.println(b + "nhỏ hơn 20, lớn hơn 10");
			}
		} else {
			System.out.println(b + " nhỏ hơn 10");
		}
	}
}
