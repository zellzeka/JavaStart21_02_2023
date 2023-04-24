package sample;

import java.util.Objects;

public class Student extends Human {
	private int id;
	private String groupName;
	
	public Student(String name, String lastName, Gender gender, int id, String groupName) {
		super(name, lastName, gender);
		this.id = id;
		this.groupName = groupName;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [name = " + super.getName() + ", lastName = " + super.getLastName() + ", gender = " + super.getGender().getPersonsGender() + ", id = " + id + ", groupName = " + groupName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(groupName, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(groupName, other.groupName) && id == other.id;
	}

}
