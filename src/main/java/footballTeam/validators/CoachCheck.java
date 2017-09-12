package footballTeam.validators;

import footballTeam.Coach;

public class CoachCheck extends SimpleValidator {
	
	private Coach coach;
	
	// Constructor include coach class object parameter
	public CoachCheck(Coach coach) {
		this.coach = coach;
	}
	

	public void checkExperience(int experience) throws InvalidException {
		// Check coach experience method
		if (experience < 2) {
			// If experience less then 2
			// Invalid Exception execute and message print
			throw new InvalidException("Coach ID:" + coach.getID() + " coach experience cannot be less than 2 years");
		}
	}
	
	public void checkAge(int age) throws InvalidException {
		// Check coach age method
		if (age > 70){
			// If age greater then 70
			// Invalid Exception execute and message print
			throw new InvalidException("Coach ID:" + coach.getID() +" coach age cannot be greater than 70");
		}
	}
	
	@Override
	public void checkAll(Object object) throws InvalidException {
		// All check methods called in checkAll method
		Coach coach = (Coach) object;
		super.checkAll(coach);
		checkExperience(coach.getExperience());
		checkAge(coach.getAge());
	}
	
}
