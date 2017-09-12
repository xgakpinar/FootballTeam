package footballTeam;

import footballTeam.validators.InvalidException;
import footballTeam.validators.PresidentCheck;

public class President extends Employee {
	
	private PresidentCheck presidentCheck = new PresidentCheck(this);
	
	public President() {
		
	}
	
	public President(int ID, String name, String surname, int age, int experience, int value, double dailyRate) throws InvalidException {
		this.setID(ID);
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setExperience(experience);
		this.setValue(value);   
		this.setDailyRate(dailyRate);
		
		// Salary Calculation method called
		this.calculateSalary();
		
		// Check methods called
		presidentCheck.checkAll(this);
	}
	
	@Override
	protected void calculateSalary() {
		// Calculate salary method calculate monthly salary
		// Daily salary * coefficient * 20(Work Day)
		this.setSalary((int) (this.getDailyRate() * 1.9 * 20));
	}
}
