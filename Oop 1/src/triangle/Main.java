package triangle;

public class Main {

	public static void main(String[] args) {
		Triangle firstTriangle = new Triangle(0.3, 0.4, 0.5);
		System.out.println(firstTriangle.calcPerimeter());
		
		Triangle secondTriangle = new Triangle(0.6, 0.2, 0.6);
		System.out.println(secondTriangle.calcPerimeter());
		
		Triangle thirdTriangle = new Triangle(0.15, 0.2, 0.3);
		System.out.println(thirdTriangle.calcPerimeter());
	}

}
