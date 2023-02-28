package sample;

public class Homework {

	public static void main(String[] args) {
		
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double perimeter = 0.5 * (sideA + sideB + sideC);
		double triangleArea = Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
		
		System.out.println("Площадь треугольника равна " + triangleArea);
	}

}
