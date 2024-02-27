package bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Human> humans = new ArrayList<>();
		humans.add(new Human("A", 20));
		humans.add(new Human("B", 24));
		humans.add(new Human("C", 22));
		for (Human h : humans) {
			System.out.println(h);
		}
		Collections.sort(humans, new Comparator<Human>() {
			@Override
			public int compare(Human o1, Human o2) {
				if (o1.getAge() > o2.getAge()) {
					return -1;
				} else if (o1.getAge() < o2.getAge()) {
					return 1;
				} else {
					return 0;
				}
			}

		});
		for (Human h : humans) {
			System.out.println(h);
		}
	}
}
