package btvn.document;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DocumentManager manager = new DocumentManager();

		do {
			System.out.println("1. Tạo tài liệu");
			System.out.println("2. Tạo sách");
			System.out.println("3. Tạo tạp chí");
			System.out.println("4. Hiển thị");
			System.out.println("0. Thoát");
			System.out.println("Mời chọn: 0");
			int choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				manager.addDocument(scanner);
				break;
			case 2:
				manager.addBook(scanner);
				break;
			case 3:
				manager.addNewspaper(scanner);
				break;
			case 4:
				manager.displayAll();
				break;
			case 5:
				System.exit(0);
			}
		} while (true);
	}
}
