package footballTeam.validators;

import footballTeam.Player;

public class PlayerCheck extends SimpleValidator {
	
	private Player player;
	
	// Constructor include player class object parameter
	public PlayerCheck(Player player) {
		this.player = player;
	}

	public void checkHeight(int height) throws InvalidException {
		// Player height check method
		if (height < 155) {
			// If height less then 155
			// Invalid Exception execute and message print
			throw new InvalidException("Player ID:" + player.getID() + " height cannot be less than 155 cm");
		}
	}
	
	public void checkWeight(int weight) throws InvalidException {
		// Player weight check method
		if (weight >100) {
			// If weight greater then 100
			// Invalid Exception execute and message print
			throw new InvalidException("Player ID:" + player.getID() + " weight cannot be more than 100 kg");
		}
	}
	
	@Override
	public void checkAll(Object object) throws InvalidException {
		// All check methods called in checkAll method
		Player player = (Player) object;
		super.checkAll(player);
		checkHeight(player.getHeight());
		checkWeight(player.getWeight());
	}
}
