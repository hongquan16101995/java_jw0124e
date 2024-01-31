package bai6;

public class Circle extends Shape {
	@Override
	public double getArea() {
		return this.size * this.size * Math.PI;
	}

}
