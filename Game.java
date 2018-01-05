public class Game {
	public static String IA = "off"; // Créer classe IA qui défini la variable IA (On/Off) (si 2 Joueurs ?)
	public static Cave cave1;
	public static Cave cave2;
	public static Cave cave3;
	public static Player Player1;
	public static Player Player2;

	public static int NbNiveauTotal(Cave cave1, Cave cave2, Cave cave3) {
		int nbNiveau1 = cave1.NbNiveau();
		int nbNiveau2 = cave2.NbNiveau();
		int nbNiveau3 = cave3.NbNiveau();
		int nbNiveau = nbNiveau1 + nbNiveau2 + nbNiveau3;
		return (nbNiveau);
	}

	public static void initGame() {
		cave1 = Cave.initCave(1);
		cave2 = Cave.initCave(2);
		cave3 = Cave.initCave(3);
		int nbNiveau = NbNiveauTotal(cave1, cave2, cave3);
		int StageOxygen = Stage.initOxygene(nbNiveau);
		// Si position du joueur est null, afficher au dessus des niveaux
		Player1 = Player.initPlayer("Player1");
		Player2 = Player.initPlayer("Player2");
	}

	public void initStage() {
		int nbNiveau = NbNiveauTotal(cave1, cave2, cave3);
		int StageOxygen = Stage.initOxygene(nbNiveau);
		Player1 = new Player("Player1", 0, null);
		Player2 = new Player("Player2", 0, null);
	}

	public int couche(Level level) {
		for (int i = 0; i < cave1.levels.length; i++) {
			if (level == cave1.levels[i]) {
				return (i);
			}
		}
		for (int i = 0; i < cave2.levels.length; i++) {
			if (level == cave2.levels[i]) {
				return (i + cave1.levels.length);
			}
		}
		for (int i = 0; i < cave3.levels.length; i++) {
			if (level == cave3.levels[i]) {
				return (i + cave1.levels.length + cave2.levels.length);
			}
		}
		return (-1);
	}

	public void tour() {
		Player StartingPlayer;
		Level currentLevelPlayer1 = Player.LevelGet(Player1);
		Level currentLevelPlayer2 = Player.LevelGet(Player2);
		int couchePlayer1 = couche(currentLevelPlayer1);
		int couchePlayer2 = couche(currentLevelPlayer2);
		if (couchePlayer1 >= couchePlayer2) {
			StartingPlayer = Player1;
		} else {
			StartingPlayer = Player2;
		}
		// -Choix d'actions
		// -Modif des variables en fonctions du choix (ajout de coffre, chgmt de level)
		// -Reduction d'oxygene
		// -Passage au joueur suivant
		// -Idem
		// -Fin de tour
		//Besoin de ton code sur les déplacements

	}

}
