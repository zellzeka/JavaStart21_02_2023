package homework;

public class Dog extends Animal {
	private String name;

	public Dog(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}


	public Dog(String ration, String color, int weight) {
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
		return "Dog [name = " + name + ", color = " + super.getColor() + ", weight = " + super.getWeight() + " кг" + "]";
	}

	@Override
	public String getVoice() {
		String dogVoice = this.name + " говорит Гав!";
		return dogVoice;
	}

	@Override
	public void eat() {
		System.out.println(this.name + " ест " + super.getRation());
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleep();
	}
	
	
}
