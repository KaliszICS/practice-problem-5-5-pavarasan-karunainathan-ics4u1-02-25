class Cat extends Animal implements Moveable {

	public Cat() {
		
	}

	public void purr() {
		System.out.println("purr");
	}

	@Override
	public void talk() {
		System.out.println("Meow");
	}

	@Override
	public void move() {
		System.out.println("Cat pounces.");
	}
	
}