import javax.swing.*;
import java.util.ArrayList;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.event.KeyEvent;
import java.util.Date;
import java.applet.*;
import java.awt.*;
import java.io.*;

public class InterfaceGraphique {
	public final static int X_MAX = 3;
	public final static int Y_MAX = 2;
	public final static float WIDTH = 0.09f;

	// public InterfaceGraphique() {
	// lancementJeu();
	// }

	public static void pressKey() {
		try {
			StdDraw.picture(0, 0,
					"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fond marin jeu java2.jpg", 6.3,
					6.3);
			DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
					DrawEnvironnement.nbLevelIni3, false);
			if (2.7 < Caracters.getY1() && Caracters.getY1() < 3.07) {
				StdDraw.picture(1, Caracters.getY1(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						0.37 - 0.01);
			} else if (0.7 < Caracters.getY1() && Caracters.getY1() < 2.7) {
				StdDraw.picture(1, Caracters.getY1(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv1 - 0.01);
			} else if (-1.3 < Caracters.getY1() && Caracters.getY1() < 0.7) {
				StdDraw.picture(1, Caracters.getY1(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv2 - 0.01);
			} else if (-3 < Caracters.getY1() && Caracters.getY1() < -1.3) {
				StdDraw.picture(1, Caracters.getY1(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv3 - 0.01);
			}
			//Thread.sleep(500);
			// if (Caracters.getY() <= Caracters.getY1()) {
			// System.out.println("player 1 GO!");
			StdDraw.text(0, 2.885, "joueur 2 GO!");
			Thread.sleep(500);
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				Caracters.drawCaracters(0);
				// pressKey1();

			} else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
				Caracters.drawCaracters(1);
				// pressKey1();

			} else if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
				Caracters.drawCaracters(2);
				// pressKey1();

			} else {
				pressKey();
			}
			// } else {
			// pressKey1();
			// }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void pressKey1() {
		try {
			StdDraw.picture(0, 0,
					"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fond marin jeu java2.jpg", 6.3,
					6.3);
			DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
					DrawEnvironnement.nbLevelIni3, false);
			if (2.7 < Caracters.getY() && Caracters.getY() < 3.07) {
				StdDraw.picture(-1, Caracters.getY(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						0.37 - 0.01);
			} else if (0.7 < Caracters.getY() && Caracters.getY() < 2.7) {
				StdDraw.picture(-1, Caracters.getY(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv1 - 0.01);
			} else if (-1.3 < Caracters.getY() && Caracters.getY() < 0.7) {
				StdDraw.picture(-1, Caracters.getY(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv2 - 0.01);
			} else if (-3 < Caracters.getY() && Caracters.getY() < -1.3) {
				StdDraw.picture(-1, Caracters.getY(),
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv3 - 0.01);
			}
			//Thread.sleep(500);
			//System.out.println("player 2 GO!");
			StdDraw.text(0, 2.885, "joueur 1 GO!");
			Thread.sleep(500);
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				Caracters.drawCaracters(3);
				// pressKey();

			} else if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
				Caracters.drawCaracters(4);
				// pressKey();

			} else if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
				Caracters.drawCaracters(5);
				// pressKey();

			} else {
				pressKey1();
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void ordreJeu() {
		if (Caracters.getY() < Caracters.getY1()) {
			//StdDraw.text(0, 2.885, "joueur 1 GO!");
			pressKey();
			// DrawEnvironnement.draw();
			//StdDraw.text(0, 2.885, "joueur 2 GO!");
			pressKey1();
			// DrawEnvironnement.draw();
			ordreJeu();
		} else if (Caracters.getY() > Caracters.getY1()) {
			//StdDraw.text(0, 2.885, "joueur 2 GO!");
			pressKey1();
			// DrawEnvironnement.draw();
			//StdDraw.text(0, 2.885, "joueur 1 GO!");
			pressKey();
			// DrawEnvironnement.draw();
			ordreJeu();
		} else {
			int a = (int) (Math.random() * 2);
			if (a == 0) {
				//StdDraw.text(0, 2.885, "joueur 1 GO!");
				pressKey();
				// DrawEnvironnement.draw();
				//StdDraw.text(0, 2.885, "joueur 2 GO!");
				pressKey1();
				// DrawEnvironnement.draw();
				ordreJeu();
			} else if (a == 1) {
				//StdDraw.text(0, 2.885, "joueur 2 GO!");
				pressKey1();
				// DrawEnvironnement.draw();
				//StdDraw.text(0, 2.885, "joueur 1 GO!");
				pressKey();
				// DrawEnvironnement.draw();
				ordreJeu();
			}

		}
	}

	public static void main(String[] args) {

		/*
		 * StdDraw.setCanvasSize(680, 700); StdDraw.setXscale(-3 - WIDTH, X_MAX +
		 * WIDTH); StdDraw.setYscale(-3 - WIDTH, X_MAX + WIDTH); StdDraw.picture(0, 0,
		 * "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fond marin jeu java2.jpg"
		 * , 6.3, 6.3); StdDraw.picture(0, 2.885,
		 * "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\sable.jpg",
		 * 2*(2.9+0.09f), 2*0.185); StdDraw.picture(-1, 2.885,
		 * "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
		 * 0.2, 0.37 - 0.01); StdDraw.picture(1, 2.885,
		 * "C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg",
		 * 0.2, 0.37 - 0.01);
		 */
		// StdDraw.setPenColor(StdDraw.BLACK);
		// StdDraw.filledCircle(-1, 0.9, 0.1);
		// StdDraw.setPenColor(StdDraw.RED);
		// StdDraw.filledCircle(1, 0.9, 0.1);
		DrawEnvironnement.draw(DrawEnvironnement.nbLevelIni1, DrawEnvironnement.nbLevelIni2,
				DrawEnvironnement.nbLevelIni3, true);
		TableauxTresors.IniContenuCoffres();
		StdDraw.show(20);
		ordreJeu();
	}
	

}
