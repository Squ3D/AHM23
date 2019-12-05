/*
 * @author Naïm
 */


import java.util.HashMap;
import java.util.Map;

public class Commande {

    private int idCde;
    private DateP dateCde;
    private HashMap<TypeDechet, Ligne> lesLignes;

    public Commande(int idCode, DateP dateCde) {
        this.idCde = idCode;
        this.dateCde = dateCde;
    }

    public DateP getDateCde() {
        return dateCde;
    }

    public void ajoutLigne(TypeDechet unTypeDechet, Ligne uneLigne) {
    	lesLignes = new HashMap<TypeDechet, Ligne>();
    	TypeDechet x = new TypeDechet(unTypeDechet.getId(),unTypeDechet.getLibelle(),unTypeDechet.getNbKiloParSac(),unTypeDechet.getPrixUnite());
        unTypeDechet = x;
        Ligne y = new Ligne(uneLigne.getNbSac(),uneLigne.getPrixUniteFacture()); 
        uneLigne = y;
    	lesLignes.put(x,y);
    }


    @Override
	public String toString() {
		return "Commande [idCde=" + idCde + ", dateCde=" + dateCde + ", lesLignes=" + lesLignes + "]";
	}

	public void ajoutLigne(TypeDechet unTypeDechet, int nbsac) {
    	double temp = nbsac * unTypeDechet.getPrixUnitare();
        Ligne ligne = new Ligne(nbsac, temp);
        this.ajoutLigne(unTypeDechet, ligne);
    }


    public HashMap<TypeDechet, Ligne> getLesLignes() {
        return lesLignes;
    }

    public double getPoidsTotal() {
        double poidsTotal = 0;
        TypeDechet k;
        Ligne v;
        for (Map.Entry<TypeDechet, Ligne> entry : lesLignes.entrySet()) {
            k = entry.getKey();
            v = entry.getValue();
            System.out.println(entry.getValue());
            System.out.println("issou");
            poidsTotal = poidsTotal + ( k.getNbKiloParSac() * v.getNbSac());
        }

        return poidsTotal;

    }

    public double getMontantTotal() {
 
    	double montantTotal = 0;
    	

    	int wk = lesLignes.size();
    	TypeDechet k;
        Ligne v;
        for (Map.Entry<TypeDechet, Ligne> entry : this.lesLignes.entrySet()) {
             
             for (int issou = 0; issou < wk;issou++) {
            	 k = entry.getKey();
                 v = entry.getValue();
           montantTotal = montantTotal+k.getPrixUnitare() * v.getNbSac();
        }
        }

        return montantTotal;
    }
}