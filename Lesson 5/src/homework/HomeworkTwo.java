package homework;

import java.util.Arrays;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите размер массива");
		int size = sc.nextInt();
		int maxIndex = size - 1;
		
		int [] arr = new int[size];
		
		for(int elemet:arr) {
			System.out.println("Введите индекс элемента массива для изменения от 0 до " + maxIndex);
			int index = sc.nextInt();
			if (index <= maxIndex) {
				System.out.println("Введите значение данного элемента массива");
				int value = sc.nextInt();
				arr[index] = value;
			} else {
				System.out.println("Такого индекса в массиве нет");
			}
				
		} 
		System.out.println(Arrays.toString(arr));

	}

}
