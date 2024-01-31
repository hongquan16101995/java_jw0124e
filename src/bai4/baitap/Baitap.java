package bai4.baitap;

public class Baitap {
	// Bài tập: xây dựng lớp Product (sản phẩm tự chọn).
	// viết 1 phương thức tạo 1 đối tượng Product vs
	// các dữ liệu nhập từ bàn phím.
	// sau đó thêm 3 đối tượng của lớp trên vào mảng
	// và hiển thị chúng.
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		pm.addProduct();
		pm.addProduct();
		pm.display();
	}
}
