import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateP {
    private int annee;
    private int mois;
    private int jour;

    public DateP(int a, int m, int j) {
        this.annee = a;
        this.mois = m;
        this.jour = j;
    }

    // factory method design pattern
    public static DateP aujourdhui() {

        int jour, mois, annee;
        Calendar calendar = new GregorianCalendar();
        Date dateJour = new Date();
        calendar.setTime(dateJour);
        annee = calendar.get(Calendar.YEAR);
        mois = calendar.get(Calendar.MONTH) + 1;
        jour = calendar.get(Calendar.DAY_OF_MONTH);


        DateP d = new DateP(annee, mois, jour);

        return d;
    }

    public int annee() {
        return annee;
    }

    public int mois() {
        return mois;
    }

    public int jour() {
        return jour;
    }

    public void afficheDate() {
        System.out.println(this.annee + "/" + this.mois + "/" + this.jour);
    }


   /* renvoie le nombre de jours de diff�rence entre l'objet Date courant et le param�tre uneDate
  	 si l�objet Date courant correspond � une date post�rieure au param�tre uneDate,
  	 le nombre de jours retourn� est positif.
  	 Dans le cas contraire, le nombre de jours retourn� est n�gatif.*/


    public long difference(DateP uneDate) {
        long CONST_DURATION_OF_DAY = 1000l * 60 * 60 * 24;

        // Construction de la date plac�e en param�tre
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, uneDate.annee());
        calendar1.set(Calendar.MONTH, uneDate.mois());
        calendar1.set(Calendar.DAY_OF_MONTH, uneDate.jour());
        Date date1 = calendar1.getTime();


        // construction de l'objet Date courant
        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, annee);
        calendar2.set(Calendar.MONTH, mois);
        calendar2.set(Calendar.DAY_OF_MONTH, jour);
        Date date2 = calendar2.getTime();

        // Formule permettant de calculer la diff�rence entre les deux dates

        long diff = date2.getTime() - date1.getTime();
        long numberOfDay = (long) diff / CONST_DURATION_OF_DAY;

        return numberOfDay;
    }

}


