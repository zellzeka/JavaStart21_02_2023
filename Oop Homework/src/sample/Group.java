package sample;

import java.util.Arrays;
import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
		result = prime * result + Objects.hash(groupName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
	}
	
	public boolean compareStudents() {
		boolean result = true;
		for(int i = 0; i < students.length; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if(students[i].equals(students[j])) {
					result = false;
				}
			}
		}
		return result;
	}
	
}
