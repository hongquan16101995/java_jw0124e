package bai7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyCanBo qlcb = new QuanLyCanBo(scanner);
		int choice;
		do {
			System.out.println("MENU");
			System.out.println("1. Tạo mới cán bộ");
			System.out.println("2. Tạo mới cán bộ");
			System.out.println("3. Tìm kiếm cán bộ theo tên");
			System.out.println("4. Hiển thị danh sách cán bộ");
			System.out.println("5. Hiển thị vai trò cán bộ");
			System.out.println("0. Thoát");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = QuanLyCanBo.inputNumber(scanner);
			switch (choice) {
			case 1:
				addObject(scanner, qlcb);
				break;
			case 2:
				qlcb.hienThiDanhSach();
				System.out.println("Nhập tên muốn xóa: ");
				String nameDel = scanner.nextLine();
				qlcb.deleteByName(nameDel);
				break;
			case 3:
				System.out.println("Nhập tên muốn tìm kiếm: ");
				String name = scanner.nextLine();
				qlcb.searchByName(name);
				break;
			case 4:
				qlcb.hienThiDanhSach();
				break;
			case 5:
				System.out.println("Chọn vị trí muốn tạo: ");
				System.out.println("1. Kỹ sư");
				System.out.println("2. Công nhân");
				System.out.println("3. Nhân viên");
				int choice1 = QuanLyCanBo.inputNumber(scanner);
				qlcb.hienThiTheoVaiTro(choice1);
				break;
			}
		} while (choice != 0);
	}

	public static void addObject(Scanner scanner, QuanLyCanBo qlcb) {
		System.out.println("Chọn vị trí muốn tạo: ");
		System.out.println("1. Kỹ sư");
		System.out.println("2. Công nhân");
		System.out.println("3. Nhân viên");
		System.out.println("Nhập lựa chọn của bạn: ");
		int choice1 = QuanLyCanBo.inputNumber(scanner);
		qlcb.themCanBo(choice1);
	}
}
