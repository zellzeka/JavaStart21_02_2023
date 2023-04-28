package sample;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Collections;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		Student student1 = new Student("Николай", "Николаев", Gender.MALE, 1, "Группа 1");	
//		Student student2 = new Student("Петр", "Петров", Gender.MALE, 2, "Группа 1");
//		Student student3 = new Student("Ольга", "Алексеенко", Gender.FEMALE, 3, "Группа 1");
//		Student student4 = new Student("Николай", "Яворский", Gender.MALE, 4, "Группа 1");
//		Student student5 = new Student("Мария", "Рыбалко", Gender.FEMALE, 5, "Группа 1");
//		Student student6 = new Student("Александр", "Литвиненко", Gender.MALE, 6, "Группа 1");
//		Student student7 = new Student("Анатолий", "Паденко", Gender.MALE, 7, "Группа 1");
//		Student student8 = new Student("Лилия", "Чубенко", Gender.FEMALE, 8, "Группа 1");
//		Student student9 = new Student("Дмитрий", "Малиновcкий", Gender.MALE, 9, "Группа 1");
//		Student student10 = new Student("Юрий", "Бойко", Gender.MALE, 10, "Группа 1");
//		Student student11 = new Student("Анна", "Анна", Gender.FEMALE, 11, "Группа 1");
//		
//		Group firstGroup = new Group();
//		firstGroup.setGroupName("Группа 1");
//		
//		try {
//			firstGroup.addStudent(student1);
//			firstGroup.addStudent(student2);
//			firstGroup.addStudent(student3);
//			firstGroup.addStudent(student4);
//			firstGroup.addStudent(student5);
//			firstGroup.addStudent(student6);
//			firstGroup.addStudent(student7);
//			firstGroup.addStudent(student8);
//			firstGroup.addStudent(student9);
//			firstGroup.addStudent(student10);
//			firstGroup.addStudent(student11);
//		} catch (GroupOverflowException e) {
//			e.printStackTrace();
//		}
//		
//		firstGroup.removeStudentById(10);
//		
//		try {
//			System.out.println(firstGroup.searchStudentByLastName("Малиновcкий"));
//		} catch (StudentNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//
//		System.out.println(firstGroup);
//		
//		Collections.sort(firstGroup.getStudents(), Comparator.nullsLast(new StudentLasNameComparator()));
//		
//		System.out.println(firstGroup);
//		
//		
//		try {
//			firstGroup.addStudent(CustomStudent.scanStudentData());
//			firstGroup.addStudent(CustomStudent.scanStudentData());
//		} catch (CustomStudentInputException | GroupOverflowException e) {
//			e.printStackTrace();
//		} 
//		System.out.println(firstGroup);
//		
//		File folderIn = new File("I://мастер стиль");
//		File foulderOut = new File("I://ООП");
//		foulderOut.mkdir();
//		
//		try{
//			System.out.println(ExtensionService.copyFolderFiles(folderIn, foulderOut, "pdf"));
//		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		
//		try{
//			GroupFileStorage.saveGroupToCSV(firstGroup);
//			File secondGroup = new File("Группа 2.csv");
//			System.out.println(GroupFileStorage.loadGroupFromCSV(secondGroup));
//;		} catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		File scanedFolder = new File("E://JAVA//JavaStart21_02_2023//Oop Homework//work folder");
//		try {
//			System.out.println(GroupFileStorage.findFileByGroupName("Группа 2.csv", scanedFolder));
//		} catch(IOException | FileNotFindException e) {
//			e.printStackTrace();
//		}
//		
//		
//		System.out.println(firstGroup.compareStudents());
		
		addList();
		
		
		
	}
	
	public static void addList() {
		List<Integer> listOfElements = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int newElement = rand.nextInt(100);
			listOfElements.add(newElement);
		}
		
		System.out.println(listOfElements);
		
		listOfElements.remove(0);
		listOfElements.remove(0);
		listOfElements.remove(7);
		
		System.out.println(listOfElements);
	}

}
