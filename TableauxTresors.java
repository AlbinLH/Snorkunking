import java.util.ArrayList;
public class TableauxTresors {
	//static int nbCoffres1 = (int) DrawEnvironnement.nbLevels1;
	//static int nbCoffres2 = (int) DrawEnvironnement.nbLevels2;
	//static int nbCoffres3 = (int) DrawEnvironnement.nbLevels3;
	//static double tresorsCave1 [][] = new double [nbCoffres1][2];
	//static double tresorsCave2 [][] = new double [nbCoffres2][2];
	//static double tresorsCave3 [][] = new double [nbCoffres3][2];
	static ArrayList<Integer> tresorsCave1 = new ArrayList<Integer>();
	static ArrayList<Integer> tresorsCave2 = new ArrayList<Integer>();
	static ArrayList<Integer> tresorsCave3 = new ArrayList<Integer>();
	
	
	
	
	public static void IniContenuCoffres() {
		for (int i = 1; i <= DrawEnvironnement.nbLevels1 ; i++) {
			tresorsCave1.add((int)(Math.random()*3) + 1);
			
		}
		for (int j = 1; j <= DrawEnvironnement.nbLevels2; j++) {
			tresorsCave2.add((int)(Math.random()*4) + 5);
		}
		for (int k = 1; k <= DrawEnvironnement.nbLevels3; k++) {
			tresorsCave3.add((int)(Math.random()*3) + 10);
		}
	}


}
