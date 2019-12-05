import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        DateP debut = new DateP(2018, 1, 1);
        DateP fin = new DateP(2018, 12, 29);
        
        
        AllumeFeu a = new AllumeFeu(1,"sapinPlus",20,78.99,"Sapin",4.4);
        AllumeFeu b = new AllumeFeu(2,"sapinExtra",50,150.24,"Sapin",4.4);
        AllumeFeu c = new AllumeFeu(3,"sapinMini",10,49.99,"Sapin",4.4);
        AllumeFeu d = new AllumeFeu(4,"hetrePlus",20,69.99,"Hêtre",4.2);
        AllumeFeu e = new AllumeFeu(5,"hetreMini",10,39.99,"Hêtre",4.2);
    
        TypeDechet f = new TypeDechet(6,"Sciure sapin",50,50);
        TypeDechet g = new TypeDechet(7,"Sciure sapin",100,100);


    }
}
