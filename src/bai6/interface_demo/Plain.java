package bai6.interface_demo;

public class Plain implements Flyable {

	@Override
	public void canFly(String name) {
		System.out.println(name + " can fly with wing, engine and oil");
	}

}
