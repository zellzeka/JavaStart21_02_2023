package classwork;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите первое число");
		int firstNumber = sc.nextInt();
		
		System.out.println("Введите второе число");
		int secondNumber = sc.nextInt();
		
		System.out.println("Введите третье число");
		int thirdNumber = sc.nextInt();
		
		System.out.println("Введите четвертое число");
		int fourthNumber = sc.nextInt();
		
		int maxNumber = firstNumber;
		
		if (maxNumber <= secondNumber) {
			maxNumber = secondNumber;
		}
		if (maxNumber <= thirdNumber) {
			maxNumber = thirdNumber;
		}
		if (maxNumber <= fourthNumber) {
			maxNumber = fourthNumber;
		}
		
		System.out.println(maxNumber);
	}

}
