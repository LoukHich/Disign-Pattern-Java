
public class Main {
	
	
public static void main(String[] args) {
	
	CompteBancaire c1 = new CompteBancaire(1457465,5000.5);
	CompteBancaire c2 = new CompteBancaire(1589656,1000.2);
	c1.desposerArgent(100);
	c1.retirer(50);
	Journalisation.getInstanceJournalisation().afficherLog();
	
}
}
