package footballTeam;

import footballTeam.validators.InvalidException;
import footballTeam.validators.PlayerCheck;

public class Player extends Employee {

	// Player attritibutes
	private String position;
	private int teamNumber = 0;
	private int height = 0;
	private int weight = 0;

	private PlayerCheck playerCheck = new PlayerCheck(this);

	public Player() {

	}

	// Contructor method
	public Player(int ID, String name, String surname, int age, int experience, String position, int teamNumber,
			int height, int weight, int value, double dailyRate) throws InvalidException {
		this.setID(ID);
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setExperience(experience);
		this.setPosition(position);
		this.setTeamNumber(teamNumber);
		this.setHeight(height);
		this.setWeight(weight);
		this.setValue(value);
		this.setDailyRate(dailyRate);

		// Salary Calculation method called
		this.calculateSalary();

		// Check methods called
		playerCheck.checkAll(this);
	}

	@Override
	protected void calculateSalary() {
		// Calculate salary method calculate monthly salary
		// Daily salary * coefficient * 20(Work Day)
		this.setSalary((int) (this.getDailyRate() * 1.5 * 20));
	}

	// Setter getter methods
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getTeamNumber() {
		return teamNumber;
	}

	public void setTeamNumber(int teamNumber) {
		this.teamNumber = teamNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
