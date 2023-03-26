package shop;

public class Stores {
	private int price;
	private String description;
	private double weight;

	public Stores(int price, String description, double weight) {
		super();
		this.price = price;
		this.description = description;
		this.weight = weight;
	}

	public Stores() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Stores [price = " + price + ", description = " + description + ", weight = " + weight + "]";
	}
	
	
	
}
