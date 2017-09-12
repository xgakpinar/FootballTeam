package footballTeam;

import footballTeam.validators.CoachCheck;
import footballTeam.validators.InvalidException;

public class Coach extends Employee {

	// Get instance from coach check
	private CoachCheck coachCheck = new CoachCheck(this);

	public Coach() {

	}

	public Coach(int ID, String name, String surname, int age, int experience, int value, double dailyRate) throws InvalidException {
		this.setID(ID);
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setExperience(experience);
		this.setValue(value);
		this.setDailyRate(dailyRate);

		// Salary Calculation method called
		calculateSalary();

		// Check methods called
		coachCheck.checkAll(this);
	}

	@Override
	protected void calculateSalary() {
		// Calculate salary method calculate monthly salary
		// Daily salary * coefficient * 20(Work Day)
		this.setSalary((int) (this.getDailyRate() * 1.6 * 20));
	}
}
