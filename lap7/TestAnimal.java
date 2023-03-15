public class TestAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal("animal1");
		System.out.println(ani1);

		Mammal m1 = new Mammal("mamal1");
		System.out.println(m1);
		
		Cat cat1 = new Cat("cat1");
		System.out.println(cat1);
		cat1.greets();
		
		Dog dog1 = new Dog("dog1");
		System.out.println(dog1);
		dog1.greets();
		dog1.greets(dog1);
	}
}
