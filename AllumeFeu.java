public class AllumeFeu extends TypeDechet {

    private String libbeleEssence;
    private double valeurEnergetique;


    public AllumeFeu(int id, String libelle, int nbKiloParSac, double prixUnitaire, String libbeleEssence, double valeurEnergetique) {
        super(id, libelle, nbKiloParSac, prixUnitaire);
        this.libbeleEssence = libbeleEssence;
        this.valeurEnergetique = valeurEnergetique;
    }
  
    public void setValeurEnergetique(double valeurEnergetique) {
        this.valeurEnergetique = valeurEnergetique;
    }
    public void setLibbeleEssence(String libbeleEssence) {
        this.libbeleEssence = libbeleEssence;
    }

    public String getLibbeleEssence() {
        return libbeleEssence;
    }

    public double getValeurEnergetique() {
        return valeurEnergetique;
    }
}



