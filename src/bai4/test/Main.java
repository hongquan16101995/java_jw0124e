package bai4.test;

import bai4.oop.Animal;

public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Animal(20.5, 0.6, "male", 2);
		System.out.println(animal1.age);
//		System.out.println(animal1.gender);
//		System.out.println(animal1.height);

		Cat cat = new Cat();
		cat.getGender();
		cat.display("abc");

		Animal obj1 = new Animal();
		Animal obj2 = new Cat();
		obj1.display();
		obj2.display();
	}

	// phương thức trong Java:
	// access modifier non_access data_type_return name_method(parameters) {
	// method_body
	// nếu có data_type_return bắt buộc có từ khóa return
	// }
}
