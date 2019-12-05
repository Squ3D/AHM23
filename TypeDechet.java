/*
 * @author Naïm
 */

public class TypeDechet {

    private int id;
    private String libelle;
    private int nbKiloParSac;
    private double prixUnite;


    public TypeDechet(int id, String libelle, int nbKiloParSac, double prixUnite) {
        this.id = id;
        this.libelle = libelle;
        this.nbKiloParSac = nbKiloParSac;
        this.prixUnite = prixUnite;
    }

    public int getNbKiloParSac() {
        return nbKiloParSac;
    }

    public double getPrixUnite() {
        return prixUnite;
    }
}
