
public class Oxygene {
	static double oxygene = 0;
	static int phase = 0;
	
	
	public static void initOxygene(double nbDeNiveau) {
		oxygene = 2 * nbDeNiveau;
	}

	public static void diminutionOxygene(int poids) {
		oxygene = oxygene - 1 - (double) poids;
		if (oxygene <= 0 && phase <= 3) {
			double[] positionY1 = new double[DrawEnvironnement.positionY1ini.length - (int)Caracters.LevelUtilisé1];
			double[] positionY2 = new double[DrawEnvironnement.positionY2ini.length - (int)Caracters.LevelUtilisé2];
			double[] positionY3 = new double[DrawEnvironnement.positionY3ini.length - (int)Caracters.LevelUtilisé3];
			DrawEnvironnement.positionY1ini = positionY1;
			DrawEnvironnement.positionY2ini = positionY2;
			DrawEnvironnement.positionY3ini = positionY3;
			int[] tresorCave1 = new int[TableauxTresors.tresorsCave1ini.length - (int)Caracters.LevelUtilisé1];
			int[] tresorCave2 = new int[TableauxTresors.tresorsCave2ini.length - (int)Caracters.LevelUtilisé2];
			int[] tresorCave3 = new int[TableauxTresors.tresorsCave3ini.length - (int)Caracters.LevelUtilisé3];
			int j = 0;
			int k = 0;
			int l = 0;
			for (int i = 0; i < TableauxTresors.tresorsCave1ini.length; i++) {
				if (TableauxTresors.tresorsCave1ini[i] != 0) {
					tresorCave1[j] = TableauxTresors.tresorsCave1ini[i];
					j++;
				}
				TableauxTresors.tresorsCave1ini = tresorCave1;
			}
			for (int i = 0; i < TableauxTresors.tresorsCave2ini.length; i++) {
				if (TableauxTresors.tresorsCave2ini[i] != 0) {
					tresorCave2[k] = TableauxTresors.tresorsCave2ini[i];
					k++;
				}
				TableauxTresors.tresorsCave2ini = tresorCave2;
			}
			for (int i = 0; i < TableauxTresors.tresorsCave3ini.length; i++) {
				if (TableauxTresors.tresorsCave3ini[i] != 0) {
					tresorCave3[l] = TableauxTresors.tresorsCave3ini[i];
					l++;
				}
				TableauxTresors.tresorsCave3ini = tresorCave3;
			}
			if (-3 < Caracters.getY() && Caracters.getY() < 2.7) {
				TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length-1] = TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length-1] + Caracters.valeurTresorEnMain1;
				Caracters.valeurTresorEnMain1 = 0;
			}
			if (-3 < Caracters.getY1() && Caracters.getY1() < 2.7) {
				TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length-1] = TableauxTresors.tresorsCave3ini[TableauxTresors.tresorsCave3ini.length-1] + Caracters.valeurTresorEnMain2;
				Caracters.valeurTresorEnMain2 = 0;
			}
			DrawEnvironnement.nbLevelIni1 = Caracters.LevelUtilisé1;
			DrawEnvironnement.nbLevelIni2 = Caracters.LevelUtilisé2;
			DrawEnvironnement.nbLevelIni3 = Caracters.LevelUtilisé3;
			DrawEnvironnement.draw(Caracters.LevelUtilisé1, Caracters.LevelUtilisé2, Caracters.LevelUtilisé3, true);
		}

	}



}
