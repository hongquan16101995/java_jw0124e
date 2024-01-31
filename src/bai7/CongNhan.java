package bai7;

public class CongNhan extends CanBo {
	private String level;

	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CongNhan(String fullName, int age, String gender, String address, String level) {
		super(fullName, age, gender, address);
		this.level = level;
		// TODO Auto-generated constructor stub
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "CongNhan [level=" + level + ", toString()=" + super.toString() + "]";
	}
}
