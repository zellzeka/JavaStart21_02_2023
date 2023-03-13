package homework;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст");
		String customString = sc.nextLine();
		int couter = 0;
		
		for(int i = 0; i < customString.length(); i++) {
			if(customString.charAt(i) == 'b') {
				couter++;
			}
		}
		
		System.out.println("В строке " + couter + " символов b");
	}

}
