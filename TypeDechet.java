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

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrixUnite() {
		return prixUnite;
	}

	public void setPrixUnite(double prixUnite) {
		this.prixUnite = prixUnite;
	}

	public void setNbKiloParSac(int nbKiloParSac) {
		this.nbKiloParSac = nbKiloParSac;
	}

	@Override
	public String toString() {
		return "TypeDechet [id=" + id + ", libelle=" + libelle + ", nbKiloParSac=" + nbKiloParSac + ", prixUnite="
				+ prixUnite + "]";
	}

	public int getNbKiloParSac() {
        return this.nbKiloParSac;
    }

    public double getPrixUnitare() {
        return this.prixUnite;
    }
}
