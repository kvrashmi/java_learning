package binding;

public class StaticBinding {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.eat();
		Dog.isFriendly();
		
	}

}
