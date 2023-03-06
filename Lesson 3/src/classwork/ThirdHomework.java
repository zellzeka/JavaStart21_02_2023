package classwork;

import java.util.Scanner;

public class ThirdHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите длину стороны а треугольника");
		int a = sc.nextInt();
		System.out.println("Введите длину стороны в треугольника");
		int b = sc.nextInt();
		System.out.println("Введите длину стороны с треугольника");
		int c = sc.nextInt();
		
		if (a + b > c && b + c > a && c + a > b) {
			System.out.println("Такой треугольник существует");
		} else {
			System.out.println("Такой треугольник не существует");
		}

	}

}
