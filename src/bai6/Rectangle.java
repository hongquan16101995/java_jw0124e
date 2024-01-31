package bai6;

public class Rectangle extends Shape {

	private int height;

	@Override
	public double getArea() {
		return this.size * this.height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
