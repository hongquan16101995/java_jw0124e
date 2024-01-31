package bai4.baitap;

public class Product {
	private String name;
	private long price;
	private String type;
	private int quantity;

	public Product() {
	}

	public Product(String name, long price, String type, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override // đánh dấu cho phương thức ghi đề từ lớp cha
	public String toString() {
		return "Product [name=" + this.name + ", price=" + price + ", type=" + type + ", quantity=" + quantity + "]";
	}
}
