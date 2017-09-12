package footballTeam;

import java.util.ArrayList;
import java.util.List;

public class Team {

	// Team attributes
	private String name;
	private List<Player> players;
	private List<Coach> coachs;
	private List<President> president;

	public Team(String name) {
		this.name = name;
		this.players = new ArrayList<Player>();
		this.coachs = new ArrayList<Coach>();
		this.president = new ArrayList<President>();
	}

	// Setter getter methods
	public String getName() {
		return name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public List<Coach> getCoachs() {
		return coachs;
	}

	public List<President> getPresident() {
		return president;
	}
}
