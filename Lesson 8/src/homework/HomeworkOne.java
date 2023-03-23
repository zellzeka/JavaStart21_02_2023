package homework;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите текст");
		String userText = sc.nextLine();
		File textFile = new File("textFile.txt");
		savedText(textFile, userText);
	}
	
	public static void savedText (File file, String text) {
		try (PrintWriter print = new PrintWriter(file)){
			print.println(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
