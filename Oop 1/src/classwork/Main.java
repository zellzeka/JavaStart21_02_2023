package classwork;

public class Main {

	public static void main(String[] args) {
	    Cat cat1 = new Cat();
	    Cat cat2 = new Cat("Umka", 5, "White");

	    cat1.name = "Barsic";
	    cat1.color = "Black";
	    cat1.weight = 4;

	    System.out.println(cat1.meow());

	    System.out.println(cat1);
	    System.out.println(cat2);

	}

}
