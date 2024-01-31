package bai7.string_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		// java cung cấp 2 lớp thao tác check String
		// Pattern: chuyển từ 1 bộ REGEX thành 1 mẫu pattern
		// Matches: kiểm tra chuỗi đầu vào có phù hợp vs yêu cầu của pattern hay không
		// REGEX: biểu thức chính quy, đưa 1 số quy tắc về yêu cầu vs chuỗi đầu vào
		// ví dụ: không cho nhập số vào, không chứa ký tự đặc biệt:%
		// check REGEX bằng 1 số trang web online
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập gì đó: ");
		String name = scanner.nextLine();
		scanner.close();
		Pattern pattern = Pattern.compile("[0-9]{10}");
		Matcher matcher = pattern.matcher(name);
		System.out.println(matcher.matches());
	}
}
