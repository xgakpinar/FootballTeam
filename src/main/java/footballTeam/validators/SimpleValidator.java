package footballTeam.validators;

import footballTeam.Employee;

public class SimpleValidator {

	public void checkId(int id) throws InvalidException {
		// ID check method
		if (id <= 0) {
			// If id less or equal then 0
			// Invalid Exception execute and message print
			throw new InvalidException("ID cannot be initial");
		}
	}

	public void checkName(String name) throws InvalidException {
		// Name check method
		if (name == null) {
			// If name equal null
			// Invalid Exception execute and message print
			throw new InvalidException("Name cannot be initial");
		}
	}

	public void checkSurname(String surname) throws InvalidException {
		// Name check method
		if (surname == null) {
			// If surname equal null
			// Invalid Exception execute and message print
			throw new InvalidException("Surname cannot be initial");
		}
	}

	public void checkSalary(int salary, int experience) throws InvalidException {
		// Salary check method
		if (experience < 5 && salary > 4000) {
			// If experience less then 5, & Salary greater then 4k
			// Invalid Exception execute and message print
			throw new InvalidException("Salary cannot be greater than 4k for " + experience + "years employee");
		}

		else if (experience < 10 && salary > 10000) {
			// If experience less than 10, & Salary greater thhen 10k
			// Invalid Exception execute and message print
			throw new InvalidException("Salary cannot be greater than 10k " + experience + "years employee");
		}
	}

	public void checkAll(Object object) throws InvalidException {
		// All check methods called in checkAll method
		Employee employee = (Employee) object;
		checkId(employee.getID());
		checkName(employee.getName());
		checkSurname(employee.getSurname());
		checkSalary(employee.getSalary(), employee.getExperience());
	}
}
