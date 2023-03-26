package classwork;

public class Main {

	public static void main(String[] args) {
	    Employee employee1 = new Employee("Oleksander", "Ts", 1, "Sci dev");

	    System.out.println(employee1.getLastName());

	    System.out.println(employee1.hashCode());

	    System.out.println(employee1);

	    Person person1 = employee1;

	    System.out.println(person1);

//	    System.out.println(person1.getId());

	    if (person1.getClass().equals(Employee.class)) {

	      Employee employee2 = (Employee) person1;

	      System.out.println(employee2.getId());
	    }

	}

}
