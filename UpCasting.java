package BasicProgram;

class Animal {

	String name;
	void type()
	{
		System.out.println("Animal");
	}
}

class Dog extends Animal {

	String color;
	void type()
	{
		System.out.println(" Dog");
	}
}

public class UpCasting {

	public static void main(String[] args)
	{
		Animal a = new Dog();
		a.name = "pomeranian";
		Dog d = new Dog();

		d.name = "dobermann";
		d.color = "Black";
		
		System.out.println("Object a");
		System.out.println("Name: " + a.name);

		a.type();

		System.out.println("Object f");
		System.out.println("Name: " + d.name);
		System.out.println("Color: " + d.color);
		d.nature();
	}
}

