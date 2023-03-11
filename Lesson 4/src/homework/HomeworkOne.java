package homework;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите число больше 4, но меньше 16");
		int userNumber = sc.nextInt();
		long factorialNumber = userNumber;
		
		if (userNumber > 4 && userNumber < 16) {
			for (int i=userNumber-1; i>0; i--) {
				factorialNumber *= i;
			}
			System.out.println("Факториал Вашего числа равен " + factorialNumber);
		} else {
			System.out.println("Число должно быть больше 4, но меньше 16");
		}
		
	}

}
