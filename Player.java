public class Player {
	public String name;
	public int treasureCount;
	public Level currentLevel;

	public Player(String cname, int ctreasureCount, Level ccurrentLevel) {
		this.treasureCount = ctreasureCount;
		this.name = cname;
		this.currentLevel = ccurrentLevel;
	}

	public static Player initPlayer(String name) {
		Player player = new Player(name, 0, null);
		return(player); 
	}
	public static Level LevelGet(Player player) {
		return(player.currentLevel);
	}
	// Scoring en fin de stage 

}
