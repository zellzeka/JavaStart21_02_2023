package sample;

public class HomeworkThird {
	
	public static void main(String[] args) {
		
		double fuelPrice = 1.2;
		int averageConsumtion = 8;
		int requiredDistance = 120;
		double averagePrice = fuelPrice * averageConsumtion / 100;
		double totalPrice = averagePrice * requiredDistance;
		
		System.out.println("Стоимость поездки составит " + totalPrice + "$");
	}

}
