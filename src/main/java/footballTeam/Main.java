package footballTeam;

import footballTeam.validators.InvalidException;

public class Main {

	public static void main(String[] args) {

		//Player player;
		Team team1 = new Team("Team 1");
		
		try {
			//player = new Player(10,"Baris", "Arslan", 26, 5, "OOS", 10, 190, 97, 1000000, 100);
			//team1.getPlayers().add(player);
			
			team1.getCoachs().add(new Coach(2,"Sadettin","Melenli",40, 10, 2000000,100));
			team1.getCoachs().add(new Coach(3,"Cagatay","Talayhan",30, 1, 1500000,100));
			
			team1.getPresident().add(new President(1,"Bahri","Danis",40, 12, 3000000,100));	
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
	
	}

}
