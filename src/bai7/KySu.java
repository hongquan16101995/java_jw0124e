package bai7;

public class KySu extends CanBo {
	private String specialTraning;

	public KySu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KySu(String fullName, int age, String gender, String address, String special) {
		super(fullName, age, gender, address);
		this.specialTraning = special;
		// TODO Auto-generated constructor stub
	}

	public String getSpecialTraning() {
		return specialTraning;
	}

	public void setSpecialTraning(String specialTraning) {
		this.specialTraning = specialTraning;
	}

	@Override
	public String toString() {
		return "KySu [specialTraning=" + specialTraning + ", toString()=" + super.toString() + "]";
	}
}
