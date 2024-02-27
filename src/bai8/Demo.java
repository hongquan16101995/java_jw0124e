package bai8;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> listIntegers = new ArrayList<>();
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(2);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(1);
		listIntegers.add(100);
		listIntegers.add(1000);
		listIntegers.add(6, 1111);
		System.out.println("Số lượng phần tử: " + listIntegers.size());
		System.out.println("Phần tử ở vị trí số 10: " + listIntegers.get(10));
		for (int i = 0; i < listIntegers.size(); i++) {
			System.out.println(listIntegers.get(i));
		}

		System.out.println("-------------");
		ArrayList<String> strs = new ArrayList<>();
		strs.add("a");
		strs.add("b");
		strs.add("a");
		strs.add("a");
		strs.add("b");
		strs.add("a");
		strs.add("b");

		strs.remove("b");
		strs.remove(2);
		for (int i = 0; i < strs.size(); i++) {
			System.out.println(strs.get(i));
		}

		System.out.println("-------------");
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		ints.add(5);
		ints.add(3);
		ints.add(8);
		ints.add(4);
		ints.add(6);
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));
		}
		System.out.println("-------------");
		Collections.sort(ints);
		ints.addAll(listIntegers);
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));
		}
	}
}
