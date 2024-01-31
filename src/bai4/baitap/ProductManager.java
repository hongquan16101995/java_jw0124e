package bai4.baitap;

import java.util.Scanner;

public class ProductManager {
	private Product[] products;
	private Scanner scanner;
	private int index = 0;

	public ProductManager() {
		scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng sản phẩm muốn tạo: ");
		int length = Integer.parseInt(scanner.nextLine());
		products = new Product[length];
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public Product createProduct() {
		System.out.println("Nhập tên sản phẩm: ");
		String name = scanner.nextLine();
		System.out.println("Nhập giá sản phẩm: ");
		long price = Long.parseLong(scanner.nextLine());
		;
		System.out.println("Nhập loại sản phẩm: ");
		String type = scanner.nextLine();
		System.out.println("Nhập số lượng sản phẩm: ");
		int quantity = Integer.parseInt(scanner.nextLine());
		;
		Product p = new Product(name, price, type, quantity);
		return p;
	}

	public void addProduct() {
		Product product = createProduct();
		products[index] = product;
		this.index++;
	}

	public void display() {
		for (Product value : products) {
			if (value != null) {
				System.out.println(value.toString());
			}
		}
	}
}
