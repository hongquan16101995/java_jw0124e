package bai8;

public class Human {
	private String name;
	private int age;

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int compareTo(Human o) {
//		if (this.age > o.getAge()) {
//			return -1;
//		} else if (this.age < o.getAge()) {
//			return 1;
//		} else {
//			return 0;
//		}
//
//	}

}
