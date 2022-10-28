
public class CompteBancaire {
int numero;
double solde;
public CompteBancaire(int num,double solde) {
	this.numero=num;
	this.solde=solde;
}
public void desposerArgent(double depot ){
	this.solde+=depot;
	Journalisation.getInstanceJournalisation().ajouterLog(" Dépôt de "+depot+"€ sur le compte "+numero);
	               
	
}
public void retirer (double retrait) {
	if(solde<retrait) {
		
		Journalisation.getInstanceJournalisation().ajouterLog("La banque n'autorise pas de découvert "+numero);
		
	}else {
	  this.solde-=retrait;
		Journalisation.getInstanceJournalisation().ajouterLog("Retrait de "+ retrait +" sur le compte "+ numero);
		
	}
}
}
