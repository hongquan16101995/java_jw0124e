package bai5;

public class Student {
	private String name;
	private int age;
	private static String className = "JW0124E1";
	private Rank rank;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.rank = new Rank("abc");
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Student.className = className;
	}

	class Rank {
		private String name;

		public Rank(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
