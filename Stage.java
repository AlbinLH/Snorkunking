public class Stage {
	public int oxygen;

	public Stage(int coxygen) {
		this.oxygen = coxygen;
	}

	public int initOxygene(int nbDeNiveau) {
		int oxygene = 2 * nbDeNiveau;
		return (oxygene);
	}

	public int DiminutionOxygene(int oxygene, int poids) {
		oxygene = oxygene - 1 - poids;
		if (oxygene <= 0) {
			oxygene = 0;
		}
		return (oxygene);
	}

}
