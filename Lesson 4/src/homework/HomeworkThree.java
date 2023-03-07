package homework;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите ширину прямоугольника");
		int width = sc.nextInt();	
		System.out.println("Введите высоту прямоугольника");
		int height = sc.nextInt();
		
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				if (i == 0 || i == height || j == 0 || j == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
