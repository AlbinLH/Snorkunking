import java.util.ArrayList;
public class TableauxTresors {
	static int nbCoffres1 = (int) DrawEnvironnement.nbLevels1;
	static int nbCoffres2 = (int) DrawEnvironnement.nbLevels2;
	static int nbCoffres3 = (int) DrawEnvironnement.nbLevels3;
	static int tresorsCave1ini [] = new int [nbCoffres1];
	static int tresorsCave2ini [] = new int [nbCoffres2];
	static int tresorsCave3ini [] = new int [nbCoffres3];
	//static ArrayList<Integer> tresorsCave1 = new ArrayList<Integer>();
	//static ArrayList<Integer> tresorsCave2 = new ArrayList<Integer>();
	//static ArrayList<Integer> tresorsCave3 = new ArrayList<Integer>();
	
	
	
	
	public static void IniContenuCoffres() {
		for (int i = 0; i < nbCoffres1 ; i++) {
			//tresorsCave1.add((int)(Math.random()*3) + 1);
			tresorsCave1ini[i] = (int)(Math.random()*3) + 1;
			
		}
		for (int j = 0; j < nbCoffres2; j++) {
			//tresorsCave2.add((int)(Math.random()*4) + 5);
			tresorsCave2ini[j] = (int)(Math.random()*4) + 5;
		}
		for (int k = 0; k < nbCoffres3; k++) {
			//tresorsCave3.add((int)(Math.random()*3) + 10);
			tresorsCave3ini[k] = (int)(Math.random()*3) + 10;
		}
	}


}
