public class Level {
	public Chest[] chests;
	//public Player[] players;
	
	public Level(Chest[] cchests/*, Player[] cplayers*/) {
		//this.players = cplayers;
		this.chests = cchests;
		}
	public static Level StartingLevel() {
		Level startinglevel = new Level(null);
		return(startinglevel);
	}
}
