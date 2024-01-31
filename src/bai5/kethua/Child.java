package bai5.kethua;

public class Child extends Parent {
	private String gender;

	public Child() {
		super();
	}

	public Child(String gender) {
		super();
		this.gender = gender;
	}

	public Child(String test, String name, int age, String gender) {
		super(test, name, age);
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void m1() {
		System.out.println("m1 of Child");
	}

	public void m1(int a) {
		System.out.println("m1 overload of Child");
	}

	public void m2() {
		System.out.println("m2 of Child");
	}
}
