class Cave {
	public Level[] levels;

	public Cave(Level[] clevels) {
		this.levels = clevels;
	}

	public static Cave initCave(int ID) {
		if (ID == 1) {
			int nombreNiveau = (int) Math.random() * 9 + 12;
			Level[] levels = new Level[nombreNiveau];
			for (int i = 1; i <= nombreNiveau; i++) {
				int nombreTresor = (int) Math.random() * 1 + 3;
				Chest chest = new Chest(nombreTresor);
				Chest[] chests = new Chest[1];
				chests[0] = chest;
				Level newLevel = new Level(chests);
				levels[i] = newLevel;
			}
			Cave cave = new Cave(levels);
			return (cave);
		} else if (ID == 2) {
			int nombreNiveau = (int) Math.random() * 6 + 9;
			Level[] levels = new Level[nombreNiveau];
			for (int i = 1; i <= nombreNiveau; i++) {
				int nombreTresor = (int) Math.random() * 5 + 8;
				Chest chest = new Chest(nombreTresor);
				Chest[] chests = new Chest[1];
				chests[0] = chest;
				Level newLevel = new Level(chests);
				levels[i - 1] = newLevel;
			}
			Cave cave = new Cave(levels);
			return (cave);
		} else {
			int nombreNiveau = (int) Math.random() * 3 + 6;
			Level[] levels = new Level[nombreNiveau];
			for (int i = 1; i <= nombreNiveau; i++) {
				int nombreTresor = (int) Math.random() * 10 + 12;
				Chest chest = new Chest(nombreTresor);
				Chest[] chests = new Chest[1];
				chests[0] = chest;
				Level newLevel = new Level(chests);
				levels[i] = newLevel;
			}
			Cave cave = new Cave(levels);
			return (cave);
		}
	}
}
