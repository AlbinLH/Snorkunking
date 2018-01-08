import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;

import javax.swing.JCheckBoxMenuItem;

import javax.swing.JFrame;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class MenuJeu extends JFrame {
	//private static Container c;
	

	private static JMenuBar menuBar = new JMenuBar();

	private JMenu test1 = new JMenu("Jouer");

	private JMenu test1_2 = new JMenu("Mode vs joueur");

	private JMenu test1_3 = new JMenu("Mode vs IA");

	private JMenu test2 = new JMenu("Option");

	private JMenuItem item2 = new JMenuItem("Fermer");

	private JMenuItem item3 = new JMenuItem("Son");

	private JMenuItem item4 = new JMenuItem("Sensibilité");

	private JMenuItem jcmi1 = new JMenuItem("Lancer jeu");

	private JMenuItem jcmi2 = new JMenuItem("Lancer jeu");

	public static void main(String[] args) {

		MenuJeu menu = new MenuJeu();
		//imageFondMenu("C:\\Users\\Yann-Ly\\eclipse-workspace\\VideoGame\\src\\ImageGame\\fondMarinMenu.png");

	}

	public MenuJeu() {

		this.setSize(400, 200);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setLocationRelativeTo(null);

		// On ajoute les éléments dans notre sous-menu

		this.test1_2.add(jcmi1);

		this.test1_3.add(jcmi2);

		// Ajout du sous-menu dans notre menu

		this.test1.add(this.test1_2);
		this.test1.add(this.test1_3);

		// Ajout d'un séparateur

		this.test1.addSeparator();

		item2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				System.exit(0);

			}

		});
		jcmi1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				playerVSplayer();
				System.exit(0);

			}

		});

		this.test1.add(item2);

		this.test2.add(item3);

		this.test2.add(item4);

		// L'ordre d'ajout va déterminer l'ordre d'apparition dans le menu de gauche à
		// droite

		// Le premier ajouté sera tout à gauche de la barre de menu et inversement pour
		// le dernier

		this.menuBar.add(test1);

		this.menuBar.add(test2);

		this.setJMenuBar(menuBar);

		this.setVisible(true);

	}
	/*public static void imageFondMenu(String filePath) {
		
		JPanel imagePanel = new JPanel() {
			public void paint(Graphics g) {
				try {
					BufferedImage image = ImageIO.read(new File(filePath));
					g.drawImage(image, 0, 0, null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		imagePanel.setPreferredSize(new Dimension(640, 480));
		menuBar.add(imagePanel);
	}*/
	public static void playerVSplayer() {
		InterfaceGraphique jeu = new InterfaceGraphique();
	}


	

}
