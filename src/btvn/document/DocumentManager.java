package btvn.document;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocumentManager {
	private List<Document> documents;

	public DocumentManager() {
		this.documents = new ArrayList<>();
	}

	public void addDocument(Scanner scanner) {
		System.out.println("Nhập tên nhà SX: ");
		String nxb = scanner.nextLine();
		System.out.println("Nhập số lượng: ");
		long quantity = Long.parseLong(scanner.nextLine());
		Document document = new Document(nxb, quantity);
		documents.add(document);
	}

	public void addBook(Scanner scanner) {
		System.out.println("Nhập tên nhà SX: ");
		String nxb = scanner.nextLine();
		System.out.println("Nhập số lượng: ");
		long quantity = Long.parseLong(scanner.nextLine());
		System.out.println("Nhập tên tác giả: ");
		String author = scanner.nextLine();
		System.out.println("Nhập số trang sách: ");
		long page = Long.parseLong(scanner.nextLine());
		Document document = new Book(nxb, quantity, author, page);
		documents.add(document);
	}

	public void addNewspaper(Scanner scanner) {
		System.out.println("Nhập tên nhà SX: ");
		String nxb = scanner.nextLine();
		System.out.println("Nhập số lượng: ");
		long quantity = Long.parseLong(scanner.nextLine());
		System.out.println("Nhập ngày phát hành: ");
		String date = scanner.nextLine();
		Document document = new Newpaper(nxb, quantity, date);
		documents.add(document);
	}

	public void displayAll() {
		for (Document d : documents) {
			System.out.println(d);
		}
	}
}
