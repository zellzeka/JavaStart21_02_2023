package sample;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Николай", "Николаев", Gender.MALE, 1, "Группа 1");	
		Student student2 = new Student("Петр", "Петров", Gender.MALE, 2, "Группа 1");
		Student student3 = new Student("Ольга", "Алексеенко", Gender.FEMALE, 3, "Группа 1");
		Student student4 = new Student("Николай", "Яворский", Gender.MALE, 4, "Группа 1");
		Student student5 = new Student("Мария", "Рыбалко", Gender.FEMALE, 5, "Группа 1");
		Student student6 = new Student("Александр", "Литвиненко", Gender.MALE, 6, "Группа 1");
		Student student7 = new Student("Анатолий", "Паденко", Gender.MALE, 7, "Группа 1");
		Student student8 = new Student("Лилия", "Чубенко", Gender.FEMALE, 8, "Группа 1");
		Student student9 = new Student("Дмитрий", "Малиновcкий", Gender.MALE, 9, "Группа 1");
		Student student10 = new Student("Юрий", "Бойко", Gender.MALE, 10, "Группа 1");
		Student student11 = new Student("Анна", "Новик", Gender.FEMALE, 11, "Группа 1");
		
		Group firstGroup = new Group();
		firstGroup.setGroupName("Группа 1");
		
		try {
			firstGroup.addStudent(student1);
			firstGroup.addStudent(student2);
			firstGroup.addStudent(student3);
			firstGroup.addStudent(student4);
			firstGroup.addStudent(student5);
			firstGroup.addStudent(student6);
			firstGroup.addStudent(student7);
			firstGroup.addStudent(student8);
			firstGroup.addStudent(student9);
			firstGroup.addStudent(student10);
			firstGroup.addStudent(student11);
		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(firstGroup.searchStudentByLastName("Малиновcкий"));
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		firstGroup.removeStudentById(10);

		System.out.println(firstGroup);
		
		Arrays.sort(firstGroup.getStudents(), Comparator.nullsLast(new StudentLasNameComparator()));
		
		System.out.println(firstGroup);
		
		
		try {
			firstGroup.addStudent(CustomStudent.scanStudentData());
			firstGroup.addStudent(CustomStudent.scanStudentData());
		} catch (CustomStudentInputException | GroupOverflowException e) {
			e.printStackTrace();
		} 
		System.out.println(firstGroup);
	}

}
