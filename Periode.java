import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Periode {
    
	private DateP dateDebut;
    private DateP dateFin;
    ArrayList<Commande> commandes = new ArrayList<Commande>();

    public Periode(DateP dateDebut, DateP dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }


    public void ajoutCommande(Commande uneCommande) {
        commandes.add(uneCommande);
    }

    public double totalCa() {
        double totalCa = 0;

        for (Commande commande : commandes) {
            System.out.println(commande);
            if (commande.getDateCde().difference(this.dateDebut) >= 0
                    && commande.getDateCde().difference(this.dateFin) <= 0) {

                totalCa += commande.getMontantTotal();
            }
        }
        return totalCa;

    }

    @Override
	public String toString() {
		return "Periode [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", commandes=" + commandes + "]";
	}


	public HashMap venteAllumeFeu() {
        HashMap<String, Integer> ventesA = new HashMap<String, Integer>();
        for (Commande commande : this.commandes) {
            for (Map.Entry<TypeDechet, Ligne> entry : commande.getLesLignes().entrySet()) {
                TypeDechet k = entry.getKey();
                Ligne v = entry.getValue();
                if (k instanceof AllumeFeu) {
                    ventesA.put(((AllumeFeu) k).getLibbeleEssence(), v.getNbSac());
                }
            }
        }
        return ventesA;
    }
}









