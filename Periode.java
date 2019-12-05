import java.util.ArrayList;
import java.util.HashMap;

public class Periode {
    private DateP dateDebut;
    private DateP dateFin;
    ArrayList<Commande> commandes = new ArrayList<Commande>();

    public Periode(DateP dateDebut, DateP dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;

    }

    // ajouter une commande à la liste des commandes

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


    // Fonction ventesAllumeFeu() : Dictionnaire<chaîne, entier>
//La méthode retourne un dictionnaire contenant comme
// clé le libellé de l’essence de bois et comme valeur le
// nombre de sacs d’allume-feux vendus.


   /* public HashMap venteAllumeFeu(){
        HashMap<>

    }*/
}








