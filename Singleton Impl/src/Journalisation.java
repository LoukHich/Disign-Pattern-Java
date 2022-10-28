import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {
  
   private static Journalisation journalisationInstance ;
   private String log ;
   private Journalisation(){
       log="";
   }
   
   public static  Journalisation getInstanceJournalisation(){
       if(journalisationInstance == null)
          journalisationInstance = new Journalisation();
       return journalisationInstance;
   }
   
   public void  ajouterLog(String log){
       String date = new SimpleDateFormat("[dd/MM/yy HH'h'mm]").format(new Date());
          this.log +=date+" "+log+"\n";
   }
   public void afficherLog(){
       System.out.println(log);
   }
}
