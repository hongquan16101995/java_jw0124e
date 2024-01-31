package bai5.kethua;

public class Parent {
	private String test;
	protected String name = "Parent";
	protected int age;

	public Parent() {
		super();
	}

	public Parent(String test, String name, int age) {
		super();
		this.test = test;
		this.name = name;
		this.age = age;
	}

	public void m1() {
		System.out.println("m1 of Parent");
	}
}
