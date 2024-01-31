package bai4.oop;

public class Main {
	public static void main(String[] args) {
		// khởi tạo 1 đối tượng Animal từ lớp Animal
		Animal animal = new Animal();
		System.out.println(animal.age);
		System.out.println(animal.gender);

		Animal animal1 = new Animal(20.5, 0.6, "male", 2);
		System.out.println(animal1.age);
		System.out.println(animal1.gender);
		System.out.println(animal1.height);
//		System.out.println(animal1.weight);
	}
}
