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

    @Override
	public String toString() {
		return "Ligne [nbSac=" + nbSac + ", prixUniteFacture=" + prixUniteFacture + "]";
	}

	public int getNbSac() {
        return this.nbSac;
    }

    public double getPrixUniteFacture() {
        return this.prixUniteFacture;
    }
}


