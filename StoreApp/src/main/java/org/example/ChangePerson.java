package org.example;


import java.util.List;

public class ChangePerson extends Person {

	private Person person;
	private Store store;
	public ChangePerson(String name, Store store, Person person){
		super(name);
		this.store = store;
		this.person = person;

	}
	private final Person[] persons = new Person[]{
			new Person("Anton"),
			new Person ("Pontus"),
			new Person ("Josef"),
			new Person("Cecilia"),
			new Person("Olga"),
			new Person("Maria"),
	};
	public void changeEmployeeName(int employeeId, String newName) {
		List<Employee> employees = store.getEmployees();
		for (Employee employee : employees) {
			if (employee.getId() == employeeId) {
				employee.getName();
				System.out.println("Changed employee name to: " + newName);
				return;
			}
		}
		System.out.println("Employee with ID " + employeeId + " not found.");
	}

}
