package bai1;

public class Operator {
	public static void main(String[] args) {
		int number = 123;
		String str = "45";
		System.out.println(number + str);
		System.out.println((number + str) instanceof String);
		// cộng chuỗi: khi mà 1 trong 2 toán hạng của biểu thức là chuỗi
		// tất cả sẽ quy về thành chuỗi hết: "123" + "45"
		boolean boo = true;
		System.out.println(boo + str);
		System.out.println("--------------");

		// logic
		// AND - &&
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);

		// OR - ||
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
	}
}
