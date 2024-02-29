package bai9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String path = "C:\\Users\\ADMIN\\eclipse-workspace\\java_jw0124e\\src\\bai9\\";
		File file = new File(path + "demo.txt");
		System.out.println("Nhập từ muốn ghi: ");
		String text = new Scanner(System.in).nextLine();
		write(file, text);
		read(file);
	}

	public static void write(File file, String text) {

		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write(text + "\n");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read(File file) {
		try {
			FileReader fileReader = new FileReader(file);
			int a = 0;
			while ((a = fileReader.read()) != -1) {
				System.out.print((char) a);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
