/*
 * @author Naïm
 */


import java.util.HashMap;
import java.util.Map;

public class Commande {

    private int idCde;
    private DateP dateCde;
    HashMap<TypeDechet, Ligne> lesLignes;

    public Commande(int idCode, DateP dateCde) {
        this.idCde = idCode;
        this.dateCde = dateCde;
    }

    public DateP getDateCde() {
        return dateCde;
    }

    public void ajoutLigne(TypeDechet unTypeDechet, Ligne uneLigne) {
        lesLignes.put(unTypeDechet, uneLigne);
    }


    public void ajoutLigne(TypeDechet unTypeDechet, int nbsac) {
        Ligne ligne = new Ligne(nbsac, nbsac * unTypeDechet.getPrixUnite());
        this.ajoutLigne(unTypeDechet, ligne);
    }


    public HashMap<TypeDechet, Ligne> getLesLignes() {
        return lesLignes;
    }

    public double getPoidsTotal() {
        double poidsTotal = 0;

        for (Map.Entry<TypeDechet, Ligne> entry : lesLignes.entrySet()) {
            TypeDechet k = entry.getKey();
            Ligne v = entry.getValue();
            poidsTotal += k.getNbKiloParSac() * v.getNbSac();
        }

        return poidsTotal;

    }

    public double getMontantTotal() {
        double montantTotal = 0;
        
        for (Map.Entry<TypeDechet, Ligne> entry : lesLignes.entrySet()) {
            TypeDechet k = entry.getKey();
            Ligne v = entry.getValue();
            montantTotal += k.getPrixUnite() * v.getNbSac();
        }

        return montantTotal;
    }
}