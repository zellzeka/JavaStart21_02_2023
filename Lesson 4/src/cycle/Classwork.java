package cycle;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите целое число");
		int firstNumber = sc.nextInt();
		
		System.out.println("Введите второе целое число");
		int secondNumber = sc.nextInt();
		
		int totalSum = 0;
		
		if (firstNumber>=secondNumber) {
			for (int i=secondNumber;i<=firstNumber;i++) {
				totalSum += i;
			}	
		} else {
			for (int i=firstNumber;i<=secondNumber;i++) {
				totalSum += i;
			}
		}
			System.out.println(totalSum);
			
	
	}

}
