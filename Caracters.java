import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import edu.princeton.cs.introcs.StdDraw;

public class Caracters {
	public static double y = 2.885;
	public static double y1 = 2.885;
	static int valeurTresorEnMain1 = 0;
	static int valeurTresorEnMain2 = 0;
	static ArrayList<Double> posy1 = new ArrayList<Double>();
	static ArrayList<Double> posy2 = new ArrayList<Double>();
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
				StdDraw.picture(-1, y,
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv1 - 0.01);
				// StdDraw.setPenColor(StdDraw.BLACK);
				// StdDraw.filledCircle(-1, y, 0.1);
				StdDraw.show(20);
				// InterfaceGraphique.pressKey1();
				try {
					Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y - DrawEnvironnement.tailleNiv1/2 - DrawEnvironnement.tailleNiv2/2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y - DrawEnvironnement.tailleNiv2/2 - DrawEnvironnement.tailleNiv3/2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}  else if (-3 < y && y < -1.3) {
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					InterfaceGraphique.pressKey();
				}
			}
			
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv1/2 + 0.185;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							0.37 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					CompteurJoueur.Compt(CompteurJoueur.coffreHand1, CompteurJoueur.coffreHand2);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv2/2 + DrawEnvironnement.tailleNiv1/2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}  else if (-3 < y && y < -1.3) {
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y = y + DrawEnvironnement.tailleNiv3/2 + DrawEnvironnement.tailleNiv2/2;
					StdDraw.picture(-1, y,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			break;

		case 2:
			if (2.7 < y && y < 3.07) {
				break;
				
			    } else if (0.7 < y && y < 2.7) {
			    	posy1.add(y);
			    	for (int z = 0; z < DrawEnvironnement.positionY1.size(); z++) {
			    		if (posy1.get(0).equals(DrawEnvironnement.positionY1.get(z))) {
			    			System.out.println("vrai");
			    			//posy1.size() - 1
			    			StdDraw.setPenColor(StdDraw.RED);
			    			StdDraw.filledRectangle(0, y, 0.2, DrawEnvironnement.tailleNiv1 - 0.01);
			    			StdDraw.text(0, y, "Empty");
			    			valeurTresorEnMain1 =  valeurTresorEnMain1 + TableauxTresors.tresorsCave1.get(z);
			    			CompteurJoueur.Compt(1, 0);
			    			LevelUtilisé1 = LevelUtilisé1 + 1.0;
			    			DrawEnvironnement.positionY1.remove(z);
			    			TableauxTresors.tresorsCave1.remove(z);
			    			posy1.remove(0);
			    			
			    		} else {
			    			System.out.println("faux");
			    		}
			    	}
			    } else if (-1.3 < y && y < 0.7) {
			    	posy1.add(y);
			    	for (int z = 0; z < DrawEnvironnement.positionY2.size(); z++) {
			    		if (posy1.get(posy1.size() - 1).equals(DrawEnvironnement.positionY2.get(z))) {
			    			StdDraw.setPenColor(StdDraw.RED);
			    			StdDraw.rectangle(0, y, 0.2, DrawEnvironnement.tailleNiv2 - 0.01);
			    			StdDraw.text(0, y, "Empty");
			    			valeurTresorEnMain1 =  valeurTresorEnMain1 + TableauxTresors.tresorsCave2.get(z);
			    			CompteurJoueur.Compt(1, 0);
			    			LevelUtilisé2 = LevelUtilisé2 + 1.0;
			    			DrawEnvironnement.positionY2.remove(z);
			    			TableauxTresors.tresorsCave2.remove(z);
			    		}
			    	}
			    			
			    } else if (-3 < y && y < -1.3) {
			    	posy1.add(y);
			    	for (int z = 0; z < DrawEnvironnement.positionY3.size(); z++) {
			    		if (posy1.get(posy1.size() - 1).equals(DrawEnvironnement.positionY3.get(z))) {
			    			StdDraw.setPenColor(StdDraw.RED);
			    			StdDraw.rectangle(0, y, 0.2, DrawEnvironnement.tailleNiv3 - 0.01);
			    			StdDraw.text(0, y, "Empty");
			    			valeurTresorEnMain1 =  valeurTresorEnMain1 + TableauxTresors.tresorsCave3.get(z);
			    			CompteurJoueur.Compt(1, 0);
			    			LevelUtilisé3 = LevelUtilisé3 + 1.0;
			    			DrawEnvironnement.positionY3.remove(z);
			    			TableauxTresors.tresorsCave3.remove(z);
			    		}
			    	}
			    }

			break;

		case 3:
			if (2.7 < y1 && y1 < 3.07) {
				y1 = y1 - 0.185 - DrawEnvironnement.tailleNiv1 / 2;
				StdDraw.picture(1, y1,
						"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
						DrawEnvironnement.tailleNiv1 - 0.01);
				// StdDraw.setPenColor(StdDraw.BLACK);
				// StdDraw.filledCircle(-1, y, 0.1);
				StdDraw.show(20);
				// InterfaceGraphique.pressKey1();
				try {
					Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 - DrawEnvironnement.tailleNiv1/2 - DrawEnvironnement.tailleNiv2/2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 - DrawEnvironnement.tailleNiv2/2 - DrawEnvironnement.tailleNiv3/2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv3 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}  else if (-3 < y1 && y1 < -1.3) {
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					InterfaceGraphique.pressKey1();
				}
			}
			
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv1/2 + 0.185;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							0.37 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					CompteurJoueur.Compt(CompteurJoueur.coffreHand1, CompteurJoueur.coffreHand2);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv2/2 + DrawEnvironnement.tailleNiv1/2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv1 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}  else if (-3 < y1 && y1 < -1.3) {
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
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					y1 = y1 + DrawEnvironnement.tailleNiv3/2 + DrawEnvironnement.tailleNiv2/2;
					StdDraw.picture(1, y1,
							"C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\plongeur.jpg", 0.2,
							DrawEnvironnement.tailleNiv2 - 0.01);
					// StdDraw.setPenColor(StdDraw.BLACK);
					// StdDraw.filledCircle(-1, y, 0.1);
					StdDraw.show(20);
					// InterfaceGraphique.pressKey1();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
			break;

		case 5:
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
