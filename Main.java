/*
 * 
 * @author Naïm
 */

import java.lang.reflect.Array;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    	
    

    	   HashMap<TypeDechet, Ligne> lesLignes = new HashMap<TypeDechet, Ligne>();
    	 //Date des commandes
        DateP one = new DateP(2018, 8, 29);
        DateP two = new DateP(2022, 9, 27);
        DateP tre = new DateP(2018, 9, 30);
        String al = "Allume Feux";
        String sC = "Sciure/Copeaux";
        Periode p = new Periode(one, one);
        Periode p1 = new Periode(two, two);
        Periode p2 = new Periode(tre, tre);
        TypeDechet d0 = new TypeDechet(1, "sapinplus", 20, 78.99);
        TypeDechet d1 = new TypeDechet(2, "sapinextra", 50, 150.24);
        TypeDechet d2 = new TypeDechet(3, "sapinmini", 10, 49.99);
        TypeDechet d3 = new TypeDechet(4, "hetreplus ", 20, 69.99);
        TypeDechet d4 = new TypeDechet(5, "hetremini", 10, 39.99);
        TypeDechet d5 = new TypeDechet(6, "sciuresapin", 50, 50);
        TypeDechet d6 = new TypeDechet(7, "sciuresapin", 100, 100);
        AllumeFeu a = new AllumeFeu(1,"sapinPlus",20,78.99,"Sapin",4.4);
        AllumeFeu b = new AllumeFeu(2,"sapinExtra",50,150.24,"Sapin",4.4);
        AllumeFeu c = new AllumeFeu(3,"sapinMini",10,49.99,"Sapin",4.4);
        AllumeFeu d = new AllumeFeu(4,"hetrePlus",20,69.99,"Hêtre",4.2);
        AllumeFeu e = new AllumeFeu(5,"hetreMini",10,39.99,"Hêtre",4.2);
        TypeDechet f = new TypeDechet(6,"Sciure sapin",50,50);
        TypeDechet g = new TypeDechet(7,"Sciure sapin",100,100);
     
     
        //Tableau différents Type de déchêt
        
     System.out.println(al+""+d0.toString() + a.toString());
     System.out.println(al +""+ d1.toString()+ b.toString());
     System.out.println(al +""+d2.toString()+c.toString());
     System.out.println(al +""+d3.toString()+d.toString());
     System.out.println(al +""+d4.toString()+e.toString());
     System.out.println(sC +""+d5.toString()+" -"+"      "+"-");
     System.out.println(sC +""+d6.toString()+" -"+"      "+"-");
     
     System.out.println();
     System.out.println();
     System.out.println("COMMANDE DU MOIS DE SEPTEMBRE 2018");
     System.out.println("Comande 1 du 20/09/2018");
     
     Commande h = new Commande(1,one);
     
     //	COMMANDE 1 
     Ligne ligne1 = new Ligne(5, 78.99);
     Ligne ligne2 = new Ligne(5,50);
     Ligne ligne3 = new Ligne(1,100);
     Ligne ligne4 = new Ligne(5,150.24);
     lesLignes.put(d0, ligne1);
     lesLignes.put(d5,ligne2);
     lesLignes.put(d6,ligne3);
     lesLignes.put(d1,ligne4);
     
     h.ajoutLigne(d0, ligne1);
     h.ajoutLigne(d0, 5);
     h.ajoutLigne(d5, ligne2);
     h.ajoutLigne(d5,5);
     h.ajoutLigne(d6,ligne3);
     h.ajoutLigne(d6, 7);
     h.ajoutLigne(d1, ligne4);
     h.ajoutLigne(d1, 5);
     //COMMANDE 2
     Commande i = new Commande(2,two);
     
     Ligne ligne5 = new Ligne(5,78.99);
     Ligne ligne6 = new Ligne(10,150.24);
     Ligne ligne7 = new Ligne(2,49.99);
     Ligne ligne8 = new Ligne(5,69.99);
     Ligne ligne9 = new Ligne(4,39.99);
     Ligne ligne10 = new Ligne(20,50);
     Ligne ligne11 = new Ligne(15,100);
     
     lesLignes.put(d0, ligne5);
     lesLignes.put(d1,ligne6);
     lesLignes.put(d2,ligne7);
     lesLignes.put(d3,ligne8);
     lesLignes.put(d4, ligne9);
     lesLignes.put(d5,ligne10);
     lesLignes.put(d6,ligne11);
     
     i.ajoutLigne(d0, ligne5);
     i.ajoutLigne(d0, 5);
     i.ajoutLigne(d1, ligne6);
     i.ajoutLigne(d1, 10);
     i.ajoutLigne(d2, ligne7);
     i.ajoutLigne(d2, 2);
     i.ajoutLigne(d3, ligne8);
     i.ajoutLigne(d3, 5);
     i.ajoutLigne(d4, ligne9);
     i.ajoutLigne(d4, 4);
     i.ajoutLigne(d5, ligne10); 
     i.ajoutLigne(d5, 20);
     i.ajoutLigne(d6, ligne11);
     i.ajoutLigne(d6, 15);
     // COMMANDE 2
     
     // COMMANDE 3
     Commande tres = new Commande(3,tre);
     Ligne tk = new Ligne (5,78.99);
     Ligne tk1 = new Ligne(5,50);
     
     
     lesLignes.put(d2,tk);
     lesLignes.put(d5,tk1);
     
     tres.ajoutLigne(d2, tk);
     tres.ajoutLigne(d2,5);
     tres.ajoutLigne(d5, tk1);
     tres.ajoutLigne(d5, 5);
     

     for (Map.Entry mapentry : lesLignes.entrySet()) {
       System.out.println("|"+mapentry.getKey() 
                           + " |  " + mapentry.getValue());
      }
                            
                            
   
     
     System.out.println();
     System.out.println("Le montant total de la Commande 1 est " +h.getMontantTotal()+"€");
     System.out.println();
     System.out.println("test poid commande 1"+tres.getPoidsTotal());
     System.out.println("Le montant toal de la Commande 2 est " +i.getMontantTotal()+"€");
     System.out.println();
     System.out.println("Le montant toal de la Commande 3 est " +tres.getMontantTotal()+"€");
     
     System.out.println(p1.venteAllumeFeu());
     
    
     
     
       
        
   
        


    }
}
