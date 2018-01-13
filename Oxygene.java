import edu.princeton.cs.introcs.StdDraw;

public class Oxygene {
	static double oxygene = 0;
	static int phase = 1;
	static boolean end = false;

	public static void initOxygene(double nbDeNiveau) {
		oxygene = 2 * nbDeNiveau;
	}

	public static void diminutionOxygene(int poids) {
		oxygene = oxygene - 1 - (double) poids;
		if (oxygene <= 0 && !end) {
			double[] positionY1 = new double[DrawEnvironnement.positionY1ini.length - (int) Caracters.LevelUtilisé1];
			double[] positionY2 = new double[DrawEnvironnement.positionY2ini.length - (int) Caracters.LevelUtilisé2];
			double[] positionY3 = new double[DrawEnvironnement.positionY3ini.length - (int) Caracters.LevelUtilisé3];
			DrawEnvironnement.positionY1ini = positionY1;
			DrawEnvironnement.positionY2ini = positionY2;
			DrawEnvironnement.positionY3ini = positionY3;
			int[] tresorCave1 = new int[TableauxTresors.tresorsCave1ini.length - (int) Caracters.LevelUtilisé1];
			int[] tresorCave2 = new int[TableauxTresors.tresorsCave2ini.length - (int) Caracters.LevelUtilisé2];
			int[] tresorCave3 = new int[TableauxTresors.tresorsCave3ini.length - (int) Caracters.LevelUtilisé3];
			int j = 0;
			int k = 0;
			int l = 0;
			for (int i = 0; i < TableauxTresors.tresorsCave1ini.length; i++) {
				if (TableauxTresors.tresorsCave1ini[i] != 0) {
					tresorCave1[j] = TableauxTresors.tresorsCave1ini[i];
					j++;
				}
			}
			TableauxTresors.tresorsCave1ini = tresorCave1;
			for (int i = 0; i < TableauxTresors.tresorsCave2ini.length; i++) {
				if (TableauxTresors.tresorsCave2ini[i] != 0) {
					tresorCave2[k] = TableauxTresors.tresorsCave2ini[i];
					k++;
				}
			}
			TableauxTresors.tresorsCave2ini = tresorCave2;
			for (int i = 0; i < TableauxTresors.tresorsCave3ini.length; i++) {
				if (TableauxTresors.tresorsCave3ini[i] != 0) {
					tresorCave3[l] = TableauxTresors.tresorsCave3ini[i];
					l++;
				}
			}
			TableauxTresors.tresorsCave3ini = tresorCave3;
			if (-3 < Caracters.getY() && Caracters.getY() < 2.7) {
				TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length
						- 1] = TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length - 1]
								+ Caracters.valeurTresorEnMain1;
				Caracters.valeurTresorEnMain1 = 0;
			}
			if (-3 < Caracters.getY1() && Caracters.getY1() < 2.7) {
				TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length
						- 1] = TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length - 1]
								+ Caracters.valeurTresorEnMain2;
				Caracters.valeurTresorEnMain2 = 0;
			}
			// DrawEnvironnement.nbLevelIni1 = Caracters.LevelUtilisé1;
			// DrawEnvironnement.nbLevelIni2 = Caracters.LevelUtilisé2;
			// DrawEnvironnement.nbLevelIni3 = Caracters.LevelUtilisé3;
			Caracters.y = 2.885;
			Caracters.y1 = 2.885;
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(0, 0, 6.3, 6.3);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.text(-1.5, 1.5, "fin de la phase:");
			StdDraw.text(0, 1.5, Double.toString(Oxygene.phase));
			StdDraw.text(-1.5, 1, "Joueur 1 possède:");
			StdDraw.text(0, 1, Integer.toString(Caracters.valeurTresorSauvés1));
			StdDraw.text(1, 1, "trésors");
			StdDraw.text(-1.5, -1, "Joueur 2 possède:");
			StdDraw.text(0, -1, Integer.toString(Caracters.valeurTresorSauvés2));
			StdDraw.text(1, -1, "trésors");
			StdDraw.show(20);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			phase = phase + 1;
			if (phase == 3) {
				end = true;
			}
			DrawEnvironnement.draw(Caracters.LevelUtilisé1, Caracters.LevelUtilisé2, Caracters.LevelUtilisé3, true);
			Caracters.LevelUtilisé1 = 0;
			Caracters.LevelUtilisé2 = 0;
			Caracters.LevelUtilisé3 = 0;
			StdDraw.picture(-1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.picture(1, 2.885, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
					0.2, 0.37 - 0.01);
			StdDraw.show(20);

		} else if (oxygene <= 0 && end){
			StdDraw.setPenColor(StdDraw.BLUE);
			StdDraw.filledRectangle(0, 0, 6.3, 6.3);
			if (Caracters.valeurTresorSauvés1 < Caracters.valeurTresorSauvés2) {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(0, 1, "Le joueur 2 est le grand gagnant!!!!");
				// code bouton rejouer
			} else if (Caracters.valeurTresorSauvés1 > Caracters.valeurTresorSauvés2) {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(0, 1, "Le joueur 1 est le grand gagnant!!!!");
				// code bouton rejouer
			} else {
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.text(0, 1, "Egalité!!!!");
				// code bouton rejouer
			}
			StdDraw.show(20);
		}
	}
}
