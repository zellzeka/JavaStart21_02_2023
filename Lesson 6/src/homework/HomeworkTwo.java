package homework;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку из слов с пробелами");
		String userString = sc.nextLine();
		String[] strArray = userString.split("[ ]");
		String maxString = "";
		
		for(String val:strArray) {
			if(maxString.length() < val.length()) {
				maxString = val;
			}
		}
		
		System.out.println(maxString + " самое длинное слово");
	}

}
