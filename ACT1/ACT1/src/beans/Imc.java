package beans;

public class Imc {
	private float taille,poids;

	public Imc(float taille, float poids) {
		this.taille = taille;
		this.poids = poids;
	}
	public float calcul()
	{
		return poids/(taille*taille);
	}
}
