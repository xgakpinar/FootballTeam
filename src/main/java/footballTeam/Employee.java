package footballTeam;

//Base class
public class Employee {

	// Attributes
	private int ID;
	private String name;
	private String surname;
	private int age = 0;
	private int experience = 0;
	private int value = 0;
	private double dailyRate = 0;
	private int salary = 0;

	protected void calculateSalary() {

	}

	// Setter getter methods
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	private String controlName(String name) {
		if (name.length() == 0) {
			String newName = "undefined";
			return newName;
		} else {
			return name;
		}
	}

	public void setName(String name) {
		this.name = controlName(name);
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = controlName(surname);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

}
