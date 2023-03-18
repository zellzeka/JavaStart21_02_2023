package homework;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите ширину");
		int widthRect = sc.nextInt();
		System.out.println("Введите длину");
		int heightRect = sc.nextInt();
		
		printRect(widthRect, heightRect);
	}
	/**
	 * Method that draws a rectangle from stars of given size.
	 *  
	 * @param width <code>int</code> The user-specified width of the rectangle. Whole numbers only
	 * @param height <code>int</code> The user-specified height of the rectangle. Whole numbers only
	 * @author Eugene email - zelebanishe@gmail.com
	 */
	
	public static void printRect (int width, int height) {
		for(int i = 0; i < height; i++ ) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
