package sample;

import java.util.Arrays;

public class Group {
	private String groupName;
	private final Student[] students;

	public Group() {
		super();
		students = new Student[10];
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}

	@Override
	public String toString() {
		String result = groupName + System.lineSeparator();
		for(Student val:students) {
			if(val != null) {
				result += val + System.lineSeparator();
			} 
		}
		return result;
	}

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;				
				return;
			}
			
		}
		throw new GroupOverflowException("Группа переполнена");
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if (students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException("Студент не найден");
	}
	
	public boolean removeStudentById(int id) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if(students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
}
