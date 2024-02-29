package bai9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bai8.Human;

public class MainIOObject {
	public static void main(String[] args) {
		String path = "C:\\Users\\ADMIN\\eclipse-workspace\\java_jw0124e\\src\\bai9\\";
		File file = new File(path + "object");
		List<Human> humans = read(file);
		write(file, humans);
		add(humans);
		write(file, humans);
		for (Human h : read(file)) {
			System.out.println(h.toString());
		}
	}

	public static void add(List<Human> humans) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = Integer.parseInt(scanner.nextLine());
		humans.add(new Human(name, age));
	}

	public static void write(File file, List<Human> humans) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(file));) {
			os.writeObject(humans);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Human> read(File file) {
		List<Human> humans = new ArrayList<>();
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));) {
			humans = (List<Human>) is.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return humans;
	}
}
