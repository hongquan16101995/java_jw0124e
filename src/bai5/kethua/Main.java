package bai5.kethua;

import bai5.Animal;

public class Main {
	public static void main(String[] args) {
		Parent parent = new Parent();
		Child child = new Child("male");
		System.out.println(child.name);
		Animal animal = new Animal();

		Parent p1 = new Parent();
		Parent p2 = new Child(); // IS-A : Child is-a Parent
		p1.m1();
		p2.m1();

		Parent[] parents = new Parent[3];
		parents[0] = p1;
		parents[1] = p2;
		parents[2] = child;

		System.out.println("--------");
		for (Parent p : parents) {
			p.m1();
			if (p instanceof Child) {
				((Child) p).m2();
			}
		}

		// HAS-A
	}
}
