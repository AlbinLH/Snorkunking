import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

public class DrawEnvironnement {

	// remplacer nombreLevels1 etc par nbLevels1 par la suite dans tout le code
	static double nombreLevels1;
	static double nombreLevels2;
	static double nombreLevels3;
	static double tailleNiv1;
	static double tailleNiv2;
	static double tailleNiv3;
	static boolean once = true;
	static double nbLevelIni1 = 0.0;
	static double nbLevelIni2 = 0.0;
	static double nbLevelIni3 = 0.0;
	static double nbLevels1 = (double)(int)(Math.random()*3) + 9;
	static double nbLevels2 = (double)(int)(Math.random()*3) + 6;
	static double nbLevels3 = (double)(int)(Math.random()*3) + 3;
	static double nbLevelTotal = nbLevels1 + nbLevels2 + nbLevels3;
	// static ArrayList<Double> positionY1 = new ArrayList<Double>();
	// static ArrayList<Double> positionY2 = new ArrayList<Double>();
	// static ArrayList<Double> positionY3 = new ArrayList<Double>();
	static double positionY1ini[] = new double[TableauxTresors.nbCoffres1];
	static double positionY2ini[] = new double[TableauxTresors.nbCoffres2];
	static double positionY3ini[] = new double[TableauxTresors.nbCoffres3];

	// initialisation caves
	// static Cave cave1 = Cave.initCave(1);
	// static Cave cave2 = Cave.initCave(2);
	// static Cave cave3 = Cave.initCave(3);

	// static double nbLevels1 = cave1.levels.length;
	// static double nbLevels2 = cave2.levels.length;
	// static double nbLevels3 = cave3.levels.length;

	public static void draw(double nblevelUsed1, double nblevelUsed2, double nblevelUsed3, boolean changePhase) {
		double positionLevel;
		double tailleLevel;

		if (changePhase) {
			StdDraw.picture(0, 0,
					"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fond marin jeu java2.jpg", 6.3,
					6.3);
			StdDraw.picture(0, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\sable.jpg",
					2 * (2.9 + 0.09f), 2 * 0.185);
			StdDraw.picture(-1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.picture(1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			CompteurJoueur.coffreHand1 = 0;
			CompteurJoueur.coffreHand2 = 0;
			nbLevels1 = nbLevels1 - nblevelUsed1;
			nbLevels2 = nbLevels2 - nblevelUsed2;
			nbLevels3 = nbLevels3 - nblevelUsed3;
			Oxygene.initOxygene(nbLevelTotal);
			Oxygene.phase = Oxygene.phase + 1;
			StdDraw.show(20);
		}

		nbLevelIni1 = nblevelUsed1;
		nbLevelIni2 = nblevelUsed2;
		nbLevelIni3 = nblevelUsed3;

		nombreLevels1 = nbLevels1;
		nombreLevels2 = nbLevels2;
		nombreLevels3 = nbLevels3;

		// dessin zone récup
		// StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.rectangle(0, 2.885, 2.9 + 0.09f, 0.185);
		StdDraw.picture(0, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\sable.jpg",
				2 * (2.9 + 0.09f), 2 * 0.185);
		while (once) {
			StdDraw.picture(-1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.picture(1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			once = false;
		}

		// dessins caves
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.rectangle(0, 1.7, 2.9 + 0.09f, 1); // x,Y,largeur,hauteur

		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.rectangle(0, -0.3, 2.9 + 0.09f, 1);

		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.rectangle(0, -2.15, 2.9 + 0.09f, 0.85);

		// dessins levels cave 1
		tailleLevel = 2 / nbLevels1;
		// positionLevel = 1 - tailleLevel;
		positionLevel = 2.7 - tailleLevel / 2;
		for (int i = 1; i <= nbLevels1; i++) {
			StdDraw.setPenColor(StdDraw.GREEN);
			// StdDraw.line(-2.9 -0.09f,positionLevel,2.9+0.09f,positionLevel);
			StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
			if (changePhase) {
				StdDraw.picture(0, positionLevel,
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
						tailleLevel - 0.01);
				// TableauxTresors.tresorsCave1[i - 1][1] = positionLevel;
				positionY1ini[i - 1] = positionLevel;
			} else {
				if (Listes.contient(positionY1ini, positionLevel)) {
					StdDraw.picture(0, positionLevel,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);

				} else {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.text(0, positionLevel, "Empty");
				}

			}
			positionLevel = positionLevel - tailleLevel;
		}
		tailleNiv1 = tailleLevel;

		/*
		 * tailleLevel = 2/nbLevels1; positionLevel = 1/nbLevels1; for (int i = 1;
		 * i<=nbLevels1; i++) { StdDraw.setPenColor(StdDraw.RED);
		 * StdDraw.rectangle(0,positionLevel,3+0.09f,tailleLevel);
		 * 
		 * positionLevel = positionLevel + 2*positionLevel; }
		 */

		// dessins levels cave 2
		tailleLevel = 2 / nbLevels2;
		// positionLevel = 1 - tailleLevel;
		positionLevel = 0.7 - tailleLevel / 2;
		for (int i = 1; i <= nbLevels2; i++) {
			StdDraw.setPenColor(StdDraw.BLUE);
			// StdDraw.line(-2.9 -0.09f,positionLevel,2.9+0.09f,positionLevel);
			StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
			if (changePhase) {
				StdDraw.picture(0, positionLevel,
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
						tailleLevel - 0.01);
				// TableauxTresors.tresorsCave1[i - 1][1] = positionLevel;
				positionY2ini[i - 1] = positionLevel;
			} else {
				if (Listes.contient(positionY2ini, positionLevel)) {
					StdDraw.picture(0, positionLevel,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);

				} else {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.text(0, positionLevel, "Empty");
				}

			}
			positionLevel = positionLevel - tailleLevel;
		}
		tailleNiv2 = tailleLevel;

		// dessins levels cave 3
		tailleLevel = 1.7 / nbLevels3;
		// positionLevel = 1 - tailleLevel;
		positionLevel = -1.3 - tailleLevel / 2;
		for (int i = 1; i <= nbLevels3; i++) {
			StdDraw.setPenColor(StdDraw.RED);
			// StdDraw.line(-2.9 -0.09f,positionLevel,2.9+0.09f,positionLevel);
			StdDraw.rectangle(0, positionLevel, 2.9 + 0.09f, tailleLevel / 2);
			if (changePhase) {
				StdDraw.picture(0, positionLevel,
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
						tailleLevel - 0.01);
				// TableauxTresors.tresorsCave1[i - 1][1] = positionLevel;
				positionY3ini[i - 1] = positionLevel;
			} else {
				if (Listes.contient(positionY3ini, positionLevel)) {
					StdDraw.picture(0, positionLevel,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\coffre pirate2.jpg", 0.2,
							tailleLevel - 0.01);

				} else {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledRectangle(0, positionLevel, 0.2 / 2, (tailleLevel - 0.01) / 2);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.text(0, positionLevel, "Empty");
				}

			}
			positionLevel = positionLevel - tailleLevel;
		}
		tailleNiv3 = tailleLevel;

		// dessin colonne compteurs
		// StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(-2.8 - 0.09f + (1 - 0.09f) / 2, 0, (1.5 - 0.09f) / 2, 2.99 + 0.09f);
		StdDraw.picture(-2.8 - 0.09f + (1 - 0.09f) / 2, 0,
				"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\sable3.jpg", (1.5 - 0.09f),
				2 * (2.99 + 0.09f));
		StdDraw.filledRectangle(2.8 + 0.09f - (1 - 0.09f) / 2, 0, (1.5 - 0.09f) / 2, 2.99 + 0.09f);
		StdDraw.picture(2.8 + 0.09f - (1 - 0.09f) / 2, 0,
				"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\sable3.jpg", (1.5 - 0.09f),
				2 * (2.99 + 0.09f));

		// initialisation compteurs
		CompteurJoueur.Compt(0, 0);
		//StdDraw.show(20);

	}

}
