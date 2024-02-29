package bai9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bai8.Human;

public class Baitap {
	public static void main(String[] args) {
		String path = "C:\\Users\\ADMIN\\eclipse-workspace\\java_jw0124e\\src\\bai9\\";
		File file = new File(path + "baitap.txt");
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
		try (FileWriter fileWriter = new FileWriter(file)) {
			for (Human h : humans) {
				String obj = h.getName() + "," + h.getAge() + "\n";
				fileWriter.write(obj);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static List<Human> read(File file) {
		List<Human> humans = new ArrayList<>();
		try (FileReader fileReader = new FileReader(file)) {
			int a = 0;
			String str = "";
			while ((a = fileReader.read()) != -1) {
				str += (char) a;
			}
			String[] strs = str.split("\n");
			for (String s : strs) {
				String[] strings = s.split(",");
				Human human = new Human(strings[0], Integer.parseInt(strings[1]));
				humans.add(human);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return humans;
	}
}
