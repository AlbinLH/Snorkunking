public class Level {
	public Chest[] chests;
	//public Player[] players;
	
	public Level(Chest[] cchests/*, Player[] cplayers*/) {
		//this.players = cplayers;
		this.chests = cchests;
		}
	public Level StartingLevel() {
		Level startinglevel = new Level(null);
		return(startinglevel);
	}
	public int[] getNbCoffre(Level level) {
		int[] list = new int[level.chests.length];
		for (int i = 0; i < level.chests.length; i++) {
			list[i] = level.chests[i].treasureNumber;
		}
		return(list);
	}
}
