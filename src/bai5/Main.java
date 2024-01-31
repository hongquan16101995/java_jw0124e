package bai5;

public class Main {
	static {
		System.out.println("HelloWorld");
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal1 = new Animal();
//		animal.m1();
//		System.out.println(animal.name);
//		System.out.println(animal1.name);
//		System.out.println(Animal.name);
//		animal.name = "Dog";
//		System.out.println(animal.name);
//		System.out.println(animal1.name);
//		System.out.println(Animal.name);

		// Student
		Student s1 = new Student("Tiến", 20);
		Student s2 = new Student("Minh", 22);
		Student s3 = new Student("Tuấn", 24);
		Student s4 = new Student("Tú", 21);
		System.out.println(s1.getClassName());
		System.out.println(s2.getClassName());
		System.out.println(s3.getClassName());
		System.out.println(s4.getClassName());
		// PĐT đổi tên lớp => JW0124D1
		Student.setClassName("JW0124D1");
		System.out.println(s1.getClassName());
		System.out.println(s2.getClassName());
		System.out.println(s3.getClassName());
		System.out.println(s4.getClassName());

		// Nested Class: tìm hiểu về static class
	}
}
