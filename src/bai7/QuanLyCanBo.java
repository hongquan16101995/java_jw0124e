package bai7;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyCanBo {
	private CanBo[] cbs;
	private Scanner scanner;
	private int INDEX = 0;

	public QuanLyCanBo(Scanner scanner) {
		super();
		cbs = new CanBo[0];
		this.scanner = scanner;
	}

	public void themCanBo(int choice) {
		CanBo[] newCbs = Arrays.copyOf(cbs, cbs.length + 1);
		newCbs[INDEX] = taoCanBo(choice);
		cbs = newCbs;
		INDEX++;
	}

	public void hienThiDanhSach() {
		for (CanBo cb : cbs) {
			System.out.println(cb.toString());
		}
	}

	public void hienThiTheoVaiTro(int choice) {
		for (CanBo cb : cbs) {
			if (choice == 1) {
				if (cb instanceof KySu) {
					System.out.println(cb.toString());
				}
			} else if (choice == 2) {
				if (cb instanceof CongNhan) {
					System.out.println(cb.toString());
				}
			} else {
				if (cb instanceof NhanVien) {
					System.out.println(cb.toString());
				}
			}
		}
	}

	public void deleteByName(String name) {
		CanBo[] newCbs = new CanBo[cbs.length - 1];
		for (int i = 0, j = 0; i < cbs.length - 1; i++, j++) {
			if (!cbs[i].getFullName().equals(name)) {
				newCbs[i] = cbs[j];
			} else {
				j++;
				newCbs[i] = cbs[j];
			}
		}
		cbs = newCbs;
		INDEX--;
	}

	public static int inputNumber(Scanner scanner) {
		int number = -1;
		do {
			try {
				number = Integer.parseInt(scanner.nextLine());
			} catch (RuntimeException e) {
				System.out.println("Sai định dạng, mời nhập lại:");
			}
		} while (number == -1);
		return number;
	}

	public CanBo taoCanBo(int choice) {
		CanBo cb;
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = inputNumber(scanner);
		String gender = choiceGender();
		System.out.println("Nhập địa chỉ: ");
		String address = scanner.nextLine();
		if (choice == 1) {
			System.out.println("Nhập ngành đào tạo: ");
			String special = scanner.nextLine();
			cb = new KySu(name, age, gender, address, special);
		} else if (choice == 2) {
			System.out.println("Nhập bậc: ");
			String level = scanner.nextLine();
			cb = new CongNhan(name, age, gender, address, level);
		} else {
			System.out.println("Nhập công việc: ");
			String work = scanner.nextLine();
			cb = new NhanVien(name, age, gender, address, work);
		}
		return cb;
	}

	public void searchByName(String name) {
		for (CanBo cb : cbs) {
			if (cb.getFullName().contains(name)) {
				System.out.println(cb.toString());
			}
		}
	}

	private String choiceGender() {
		System.out.println("Chọn giới tính: ");
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. Khác");
		System.out.println("Nhập lựa chọn: ");
		int choiceGender = inputNumber(scanner);
		if (choiceGender == 1) {
			return "Nam";
		} else if (choiceGender == 2) {
			return "Nữ";
		} else {
			return "Khác";
		}
	}
}
