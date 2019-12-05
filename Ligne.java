/*
 * @author Naïm
 */


public class Ligne {

    private int nbSac;
    private double prixUniteFacture;


    public Ligne(int nbSac, double prixUniteFacture) {
        this.nbSac = nbSac;
        this.prixUniteFacture = prixUniteFacture;
    }

    public int getNbSac() {
        return nbSac;
    }

    public double getPrixUniteFacture() {
        return prixUniteFacture;
    }
}


