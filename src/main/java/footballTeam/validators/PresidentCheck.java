package footballTeam.validators;

import footballTeam.President;

public class PresidentCheck extends SimpleValidator {
	
	private President president;
	
	// Constructor include president class object parameter
	public PresidentCheck(President president) {
		this.president = president;
	}
	
	public void checkValue(int value) throws InvalidException {
		// Check president value method
		if (value > 4000000) {
			// If president value greater then $4b
			// Invalid Exception execute and message print
			throw new InvalidException("President:"+ president.getID() + "President value cannot be greater than $4b");
		}
	}
	
	@Override
	public void checkAll(Object object) throws InvalidException {
		// All check methods called in checkAll method
		President president = (President) object;
		super.checkAll(president);
		checkValue(president.getValue());
	}

}
