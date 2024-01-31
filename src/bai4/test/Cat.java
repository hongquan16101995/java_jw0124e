package bai4.test;

import bai4.oop.Animal;

public class Cat extends Animal {
	private String color;

	public String getGender() {
		return this.gender;
	}

	public void display(String a) {
		System.out.println(a);
	}

	public void display() {
		System.out.println("abc");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
