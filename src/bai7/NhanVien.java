package bai7;

public class NhanVien extends CanBo {
	private String work;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String fullName, int age, String gender, String address, String work) {
		super(fullName, age, gender, address);
		this.work = work;
		// TODO Auto-generated constructor stub
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	@Override
	public String toString() {
		return "NhanVien [work=" + work + ", toString()=" + super.toString() + "]";
	};
}
