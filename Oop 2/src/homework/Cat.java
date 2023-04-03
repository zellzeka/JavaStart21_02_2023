package homework;

public class Cat extends Animal{
	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat(String ration, String color, int weight) {
		super(ration, color, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Cat [name = " + name + ", color = " + super.getColor() + ", weight = " + super.getWeight() + " кг" + "]";
	}

	@Override
	public String getVoice() {
		String catVoice = "Кошка " + this.name + " говорит Мяу!";
		return catVoice;
	}

	@Override
	public void eat() {
		System.out.println(this.name + " ест " + super.getRation());
	}

	@Override
	public void sleep() {
		System.out.println("Х-р-р Х-р-р Х-р-р");
	}

	
	
	
}
