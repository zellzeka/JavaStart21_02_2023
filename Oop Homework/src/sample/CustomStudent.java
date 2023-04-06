package sample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomStudent {
	
	public static Student scanStudentData () throws CustomStudentInputException {
		Student customStudent = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя");
		customStudent.setName(sc.nextLine());
		
		System.out.println("Введите фамилию");
		customStudent.setLastName(sc.nextLine());
		
		System.out.println("Введите пол(мужской или женский)");
		String scanedGender = sc.nextLine().toLowerCase();
		if (scanedGender.contains("муж")) {
			customStudent.setGender(Gender.MALE);
		} else if (scanedGender.contains("жен")) {
			customStudent.setGender(Gender.FEMALE);
		} else {
			throw new CustomStudentInputException("Введите - мужчина или женщина");
		}
		
		try {
			System.out.println("Введите ID");
			customStudent.setId(sc.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("ID может быть только числом");
		}
		sc.nextLine();
		
		System.out.println("Введите группу");
		customStudent.setGroupName(sc.nextLine());
		
		return customStudent;
	} 
}
