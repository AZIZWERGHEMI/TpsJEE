package Activitr01;

public class Imc {
    // Attributs priv�s
    private double taille;
    private double poids;

    // Constructeur
    public Imc(double taille, double poids) {
        this.taille = taille;
        this.poids = poids;
    }

    // M�thode de calcul de l'IMC
    public double calcul() {
        // Calcul de l'IMC
        return poids / (taille * taille);
    }
}

