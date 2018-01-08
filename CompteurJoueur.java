import edu.princeton.cs.introcs.StdDraw;

public class CompteurJoueur {
	static int coffreHand1 = 0;
	static int coffreHand2 = 0;
	static int coffreSaved1 = 0;
	static int coffreSaved2 = 0;

	public static void Compt(int coffreEnMain1, int coffreEnMain2) {

		if (2.7 < Caracters.getY() && Caracters.getY() < 3.07) {
			StdDraw.setPenColor(StdDraw.RED);

			coffreSaved1 = coffreSaved1 + coffreEnMain1;
			coffreHand1 = 0;
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2.9, "joueur 1");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2, "coffres amass�s:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved1));
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1, "coffres en main:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand1));
			if (2.7 < Caracters.getY1() && Caracters.getY1() < 3.07) {
				coffreSaved2 = coffreSaved2 + coffreEnMain2;
				coffreHand2 = 0;
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2.9, "joueur 2");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2, "coffres amass�s:");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved2));
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1, "coffres en main:");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand2));
			} else {
				coffreHand2 = coffreHand2 + coffreEnMain2;
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2.9, "joueur 2");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2, "coffres amass�s:");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved2));
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1, "coffres en main:");
				StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand2));
			}

		} else if (2.7 < Caracters.getY1() && Caracters.getY1() < 3.07) {
			StdDraw.setPenColor(StdDraw.RED);

			coffreSaved2 = coffreSaved2 + coffreEnMain2;
			coffreHand2 = 0;
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2.9, "joueur 2");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2, "coffres amass�s:");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved2));
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1, "coffres en main:");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand2));
			
			coffreHand1 = coffreHand1 + coffreEnMain1;
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2.9, "joueur 1");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2, "coffres amass�s:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved1));
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1, "coffres en main:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand1));

		} else {
			StdDraw.setPenColor(StdDraw.RED);

			// joueur 1
			coffreHand1 = coffreHand1 + coffreEnMain1;
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2.9, "joueur 1");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 2, "coffres amass�s:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved1));
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 1, "coffres en main:");
			StdDraw.text(-2.8 - 0.09f + (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand1));

			// joueur 2
			coffreHand2 = coffreHand2 + coffreEnMain2;
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2.9, "joueur 2");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 2, "coffres amass�s:");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1.8, Integer.toString(coffreSaved2));
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 1, "coffres en main:");
			StdDraw.text(2.8 + 0.09f - (1 - 0.09f) / 2, 0.8, Integer.toString(coffreHand2));

		}

	}


}