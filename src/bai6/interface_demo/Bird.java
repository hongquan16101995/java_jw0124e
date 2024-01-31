package bai6.interface_demo;

public class Bird extends Animal implements Flyable {

	@Override
	public void canFly(String name) {
		System.out.println(name + " can fly with wing");
	}

	@Override
	public void canWalk(String name) {
		// TODO Auto-generated method stub

	}

}
