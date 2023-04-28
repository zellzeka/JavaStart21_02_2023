package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Group {
	private String groupName;
	private List<Student> students;

	public Group() {
		super();
		this.students =  new ArrayList<Student>();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public List<Student> getStudents() {
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
		if (students.size() <= 10) {
			students.add(student);				
		} else {
			throw new GroupOverflowException("Группа переполнена");
		}
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for(Student element : students) {
			if(element != null && element.getLastName().equals(lastName)) {
					return element;
			}
		}
		throw new StudentNotFoundException("Студент не найден");
	}
	
	public boolean removeStudentById(int id) {
		for(Student element : students) {
			if(element != null && element.getId() == id) {
				students.remove(element);
				return true;
			} 
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(groupName, students);
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
		return Objects.equals(groupName, other.groupName) && Objects.equals(students, other.students);
	}

	public boolean compareStudents() {
		boolean result = true;
		for(Student element : students) {
			for (Student value : students) {
				if(element.equals(value)) {
					result = false;
				}
			}
		}
		return result;
	}
	
}
