import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import edu.princeton.cs.introcs.StdDraw;

public class Caracters {
	public static double y = 2.885;
	public static double y1 = 2.885;
	static int valeurTresorEnMain1 = 0;
	static int valeurTresorEnMain2 = 0;
	static int valeurTresorSauvés1 = 0;
	static int valeurTresorSauvés2 = 0;
	// static ArrayList<Double> posy1 = new ArrayList<Double>();
	// static ArrayList<Double> posy2 = new ArrayList<Double>();
	static double LevelUtilisé1 = 0.0;
	static double LevelUtilisé2 = 0.0;
	static double LevelUtilisé3 = 0.0;
	

	public static double getY1() {
		return y1;
	}

	public static double getY() {
		return y;
	}

	public static void drawCaracters(int keyPressed) {
		StdDraw.setPenRadius();
		switch (keyPressed) {
		case 0:
			if (2.7 < y && y < 3.07) {
				y = y - 0.185 - DrawEnvironnement.tailleNiv1 / 2;
				StdDraw.picture(-1, y, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
						0.2, DrawEnvironnement.tailleNiv1 - 0.01);
				// StdDraw.setPenColor(StdDraw.BLACK);
				// StdDraw.filledCircle(-1, y, 0.1);
				StdDraw.show(20);
				// InterfaceGraphique.pressKey1();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (0.7 < y && y < 2.7) {
				if (0.7 < y - DrawEnvironnement.tailleNiv1 && y - DrawEnvironnement.tailleNiv1 < 2.7) {
					y = y - DrawEnvironnement.tailleNiv1;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y - DrawEnvironnement.tailleNiv1 / 2 - DrawEnvironnement.tailleNiv2 / 2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-1.3 < y && y < 0.7) {
				if (-1.3 < y - DrawEnvironnement.tailleNiv2 && y - DrawEnvironnement.tailleNiv2 < 0.7) {
					y = y - DrawEnvironnement.tailleNiv2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y - DrawEnvironnement.tailleNiv2 / 2 - DrawEnvironnement.tailleNiv3 / 2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-3 < y && y < -1.3) {
				if (-3 < y - DrawEnvironnement.tailleNiv3 && y - DrawEnvironnement.tailleNiv3 < -1.3) {
					y = y - DrawEnvironnement.tailleNiv3;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					InterfaceGraphique.pressKey();
				}
			}
			Oxygene.diminutionOxygene(CompteurJoueur.coffreHand1);

			break;

		case 1:
			if (2.7 < y && y < 3.07) {

				InterfaceGraphique.pressKey();

			} else if (0.7 < y && y < 2.7) {
				if (0.7 < y + DrawEnvironnement.tailleNiv1 && y + DrawEnvironnement.tailleNiv1 < 2.7) {
					y = y + DrawEnvironnement.tailleNiv1;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv1 / 2 + 0.185;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							0.37 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					CompteurJoueur.Compt(CompteurJoueur.coffreHand1, CompteurJoueur.coffreHand2);
					valeurTresorSauvés1 = valeurTresorSauvés1 + valeurTresorEnMain1;
					valeurTresorEnMain1 = 0;
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-1.3 < y && y < 0.7) {
				if (-1.3 < y + DrawEnvironnement.tailleNiv2 && y + DrawEnvironnement.tailleNiv2 < 0.7) {
					y = y + DrawEnvironnement.tailleNiv2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv2 / 2 + DrawEnvironnement.tailleNiv1 / 2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-3 < y && y < -1.3) {
				if (-3 < y + DrawEnvironnement.tailleNiv3 && y + DrawEnvironnement.tailleNiv3 < -1.3) {
					y = y + DrawEnvironnement.tailleNiv3;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv3 / 2 + DrawEnvironnement.tailleNiv2 / 2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			Oxygene.diminutionOxygene(CompteurJoueur.coffreHand1);

			break;

		case 2:
			if (2.7 < y && y < 3.07) {
				InterfaceGraphique.pressKey();

			} else if (0.7 < y && y < 2.7) {
				//if (Listes.contient(DrawEnvironnement.positionY1ini, y)) {
					// posy1.add(y);
					int[] liste = new int[DrawEnvironnement.positionY1ini.length];
					for (int z = 0; z < DrawEnvironnement.positionY1ini.length; z++) {
						if (y - DrawEnvironnement.positionY1ini[z] <= Math.pow(10, -5)) {
							liste[z] = z;
						} else {
							liste[z] = 0;
						}

					}
					int k = Listes.max(liste);
					// System.out.println("vrai");
					// System.out.println(z);
					// posy1.size() - 1
					//StdDraw.setPenColor(StdDraw.RED);
					//StdDraw.filledRectangle(0, y, 0.2 / 2, (DrawEnvironnement.tailleNiv1 - 0.01) / 2);
					//StdDraw.setPenColor(StdDraw.BLACK);
					//StdDraw.text(0, y, "Empty");
					valeurTresorEnMain1 = valeurTresorEnMain1 + TableauxTresors.tresorsCave1ini[k];
					CompteurJoueur.Compt(1, 0);
					LevelUtilisé1 = LevelUtilisé1 + 1.0;
					DrawEnvironnement.positionY1ini[k] = 0;
					TableauxTresors.tresorsCave1ini[k] = 0;
					DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
							DrawEnvironnement.nbLevelIni3, false);
					// posy1.remove(0);
				//} else {
					//InterfaceGraphique.pressKey();
				//}

			} else if (-1.3 < y && y < 0.7) {
				//if (Listes.contient(DrawEnvironnement.positionY2ini, y)) {

					int[] liste = new int[DrawEnvironnement.positionY2ini.length];
					for (int z = 0; z < DrawEnvironnement.positionY2ini.length; z++) {
						if (y - DrawEnvironnement.positionY2ini[z] <= Math.pow(10, -5)) {
							liste[z] = z;
						} else {
							liste[z] = 0;
						}

					}
					int k = Listes.max(liste);
					// System.out.println("vrai");
					// System.out.println(z);
					// posy1.size() - 1
					//StdDraw.setPenColor(StdDraw.RED);
					//StdDraw.filledRectangle(0, y, 0.2 / 2, (DrawEnvironnement.tailleNiv2 - 0.01) / 2);
					//StdDraw.setPenColor(StdDraw.BLACK);
					//StdDraw.text(0, y, "Empty");
					valeurTresorEnMain1 = valeurTresorEnMain1 + TableauxTresors.tresorsCave2ini[k];
					CompteurJoueur.Compt(1, 0);
					LevelUtilisé2 = LevelUtilisé2 + 1.0;
					DrawEnvironnement.positionY2ini[k] = 0;
					TableauxTresors.tresorsCave2ini[k] = 0;
					DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
							DrawEnvironnement.nbLevelIni3, false);
				//} else {
				//	InterfaceGraphique.pressKey();
				//}

			} else if (-3 < y && y < -1.3) {
				//if (Listes.contient(DrawEnvironnement.positionY3ini, y)) {

					int[] liste = new int[DrawEnvironnement.positionY3ini.length];
					for (int z = 0; z < DrawEnvironnement.positionY3ini.length; z++) {
						if (y - DrawEnvironnement.positionY3ini[z] <= Math.pow(10, -5)) {
							liste[z] = z;
						} else {
							liste[z] = 0;
						}

					}
					int k = Listes.max(liste);
					// System.out.println("vrai");
					// System.out.println(z);
					// posy1.size() - 1
					//StdDraw.setPenColor(StdDraw.RED);
					//StdDraw.filledRectangle(0, y, 0.2 / 2, (DrawEnvironnement.tailleNiv3 - 0.01) / 2);
					//StdDraw.setPenColor(StdDraw.BLACK);
					//StdDraw.text(0, y, "Empty");
					valeurTresorEnMain1 = valeurTresorEnMain1 + TableauxTresors.tresorsCave3ini[k];
					CompteurJoueur.Compt(1, 0);
					LevelUtilisé3 = LevelUtilisé3 + 1.0;
					DrawEnvironnement.positionY3ini[k] = 0;
					TableauxTresors.tresorsCave3ini[k] = 0;
					DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
							DrawEnvironnement.nbLevelIni3, false);
				//} else {
				//	InterfaceGraphique.pressKey();
				//}

			}

			break;

		case 3:
			if (2.7 < y1 && y1 < 3.07) {
				y1 = y1 - 0.185 - DrawEnvironnement.tailleNiv1 / 2;
				StdDraw.picture(1, y1, "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
						0.2, DrawEnvironnement.tailleNiv1 - 0.01);
				// StdDraw.setPenColor(StdDraw.BLACK);
				// StdDraw.filledCircle(-1, y, 0.1);
				StdDraw.show(20);
				// InterfaceGraphique.pressKey1();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else if (0.7 < y1 && y1 < 2.7) {
				if (0.7 < y1 - DrawEnvironnement.tailleNiv1 && y1 - DrawEnvironnement.tailleNiv1 < 2.7) {
					y1 = y1 - DrawEnvironnement.tailleNiv1;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 - DrawEnvironnement.tailleNiv1 / 2 - DrawEnvironnement.tailleNiv2 / 2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-1.3 < y1 && y1 < 0.7) {
				if (-1.3 < y1 - DrawEnvironnement.tailleNiv2 && y1 - DrawEnvironnement.tailleNiv2 < 0.7) {
					y1 = y1 - DrawEnvironnement.tailleNiv2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 - DrawEnvironnement.tailleNiv2 / 2 - DrawEnvironnement.tailleNiv3 / 2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-3 < y1 && y1 < -1.3) {
				if (-3 < y1 - DrawEnvironnement.tailleNiv3 && y1 - DrawEnvironnement.tailleNiv3 < -1.3) {
					y1 = y1 - DrawEnvironnement.tailleNiv3;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					InterfaceGraphique.pressKey1();
				}
			}
			Oxygene.diminutionOxygene(CompteurJoueur.coffreHand2);

			break;

		case 4:
			if (2.7 < y1 && y1 < 3.07) {
				InterfaceGraphique.pressKey1();

			} else if (0.7 < y1 && y1 < 2.7) {
				if (0.7 < y1 + DrawEnvironnement.tailleNiv1 && y1 + DrawEnvironnement.tailleNiv1 < 2.7) {
					y1 = y1 + DrawEnvironnement.tailleNiv1;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv1 / 2 + 0.185;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							0.37 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					CompteurJoueur.Compt(CompteurJoueur.coffreHand1, CompteurJoueur.coffreHand2);
					valeurTresorSauvés2 = valeurTresorSauvés2 + valeurTresorEnMain2;
					valeurTresorEnMain2 = 0;
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-1.3 < y1 && y1 < 0.7) {
				if (-1.3 < y1 + DrawEnvironnement.tailleNiv2 && y1 + DrawEnvironnement.tailleNiv2 < 0.7) {
					y1 = y1 + DrawEnvironnement.tailleNiv2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv2 / 2 + DrawEnvironnement.tailleNiv1 / 2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else if (-3 < y1 && y1 < -1.3) {
				if (-3 < y1 + DrawEnvironnement.tailleNiv3 && y1 + DrawEnvironnement.tailleNiv3 < -1.3) {
					y1 = y1 + DrawEnvironnement.tailleNiv3;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv3 / 2 + DrawEnvironnement.tailleNiv2 / 2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			Oxygene.diminutionOxygene(CompteurJoueur.coffreHand2);

			break;

		case 5:
			if (2.7 < y1 && y1 < 3.07) {
				InterfaceGraphique.pressKey1();

			} else if (0.7 < y1 && y1 < 2.7) {
				//if (Listes.contient(DrawEnvironnement.positionY1ini, y1)) {
				
				// posy1.add(y);
				int[] liste = new int[DrawEnvironnement.positionY1ini.length];
				for (int z = 0; z < DrawEnvironnement.positionY1ini.length; z++) {
					if (y1 - DrawEnvironnement.positionY1ini[z] <= Math.pow(10, -5)) {
						liste[z] = z;
					} else {
						liste[z] = 0;
					}

				}
				int k = Listes.max(liste);
				// System.out.println("vrai");
				// System.out.println(z);
				// posy1.size() - 1
				//StdDraw.setPenColor(StdDraw.RED);
				//StdDraw.filledRectangle(0, y1, 0.2 / 2, (DrawEnvironnement.tailleNiv1 - 0.01) / 2);
				//StdDraw.setPenColor(StdDraw.BLACK);
				//StdDraw.text(0, y1, "Empty");
				valeurTresorEnMain2 = valeurTresorEnMain2 + TableauxTresors.tresorsCave1ini[k];
				CompteurJoueur.Compt(0, 1);
				LevelUtilisé1 = LevelUtilisé1 + 1.0;
				DrawEnvironnement.positionY1ini[k] = 0;
				TableauxTresors.tresorsCave1ini[k] = 0;
				DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
						DrawEnvironnement.nbLevelIni3, false);
				//} else {
				//	InterfaceGraphique.pressKey1();
				//}

				// posy1.remove(0);

			} else if (-1.3 < y1 && y1 < 0.7) {
				//if (Listes.contient(DrawEnvironnement.positionY2ini, y1)) {
				
				int[] liste = new int[DrawEnvironnement.positionY2ini.length];
				for (int z = 0; z < DrawEnvironnement.positionY2ini.length; z++) {
					if (y1 - DrawEnvironnement.positionY2ini[z] <= Math.pow(10, -5)) {
						liste[z] = z;
					} else {
						liste[z] = 0;
					}

				}
				int k = Listes.max(liste);
				// System.out.println("vrai");
				// System.out.println(z);
				// posy1.size() - 1
				//StdDraw.setPenColor(StdDraw.RED);
				//StdDraw.filledRectangle(0, y1, 0.2 / 2, (DrawEnvironnement.tailleNiv2 - 0.01) / 2);
				//StdDraw.setPenColor(StdDraw.BLACK);
				//StdDraw.text(0, y1, "Empty");
				valeurTresorEnMain2 = valeurTresorEnMain2 + TableauxTresors.tresorsCave2ini[k];
				CompteurJoueur.Compt(0, 1);
				LevelUtilisé2 = LevelUtilisé2 + 1.0;
				DrawEnvironnement.positionY2ini[k] = 0;
				TableauxTresors.tresorsCave2ini[k] = 0;
				DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
						DrawEnvironnement.nbLevelIni3, false);
				//} else {
				//	InterfaceGraphique.pressKey1();
				//}

			} else if (-3 < y1 && y1 < -1.3) {
				//if (Listes.contient(DrawEnvironnement.positionY3ini, y1)) {
				
				int[] liste = new int[DrawEnvironnement.positionY3ini.length];
				for (int z = 0; z < DrawEnvironnement.positionY3ini.length; z++) {
					if (y1 - DrawEnvironnement.positionY3ini[z] <= Math.pow(10, -5)) {
						liste[z] = z;
					} else {
						liste[z] = 0;
					}

				}
				int k = Listes.max(liste);
				// System.out.println("vrai");
				// System.out.println(z);
				// posy1.size() - 1
				//StdDraw.setPenColor(StdDraw.RED);
				//StdDraw.filledRectangle(0, y1, 0.2 / 2, (DrawEnvironnement.tailleNiv3 - 0.01) / 2);
				//StdDraw.setPenColor(StdDraw.BLACK);
				//StdDraw.text(0, y1, "Empty");
				valeurTresorEnMain2 = valeurTresorEnMain2 + TableauxTresors.tresorsCave3ini[k];
				CompteurJoueur.Compt(0, 1);
				LevelUtilisé3 = LevelUtilisé3 + 1.0;
				DrawEnvironnement.positionY3ini[k] = 0;
				TableauxTresors.tresorsCave3ini[k] = 0;
				DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
						DrawEnvironnement.nbLevelIni3, false);
				//} else {
				//	InterfaceGraphique.pressKey1();
				//}

			}

			break;

		default:
			break;
		}
		// StdDraw.picture(0, 0,
		// "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fond marin
		// jeu java.png", 6.3, 6.3);
		getY();
		getY1();

	}
	
}
