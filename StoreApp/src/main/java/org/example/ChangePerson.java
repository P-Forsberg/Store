package org.example;


import java.util.List;

public class ChangePerson extends Person {

	private Store store;
	public ChangePerson(String name, Store store){
		super(name);
		this.store = store;
	}

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
