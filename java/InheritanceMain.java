public class InheritanceMain {
	public static void main (String [] args) {
		Dog germanShephard = new Dog("German Shephard",15, 50, 2, 4, 1, 20, "Silky" );
		System.out.println(germanShephard.getBrain());
		germanShephard.eat();
		germanShephard.chew();
		germanShephard.walk();
		germanShephard.run();
	}
}