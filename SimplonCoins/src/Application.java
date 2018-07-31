import java.util.Scanner;

public class Application {

	private static double montant;

	public static void main(String[] args) throws InterruptedException {
		Scanner scan2 = new Scanner(System.in);
		int choix=0;
		
		AccountMain compteCourantP = new AccountMain();
		AccountMain compteCourantA = new AccountMain();
		AccountPEL planEpargneA = new AccountPEL();
		
		compteCourantP.setProprietaire("Pierre");
		compteCourantP.setSolde(200.00);
		
		compteCourantA.setProprietaire("Aurelia");
		compteCourantA.setSolde(100.00);
		planEpargneA.setProprietaire("Aurelia");
		planEpargneA.setSolde(1000.00);
		planEpargneA.setTauxInterets(4.5);
		
		System.out.println("Bonjour Aurelia,quelle operation souhaitez-vous faire?\n");
		do {
			System.out.println("Consulter mes comptes - 1\nEffectuer un virement - 2\nContacter mon agence  - 3\nDeconnexion           - 4");
			choix = scan2.nextInt();
			
			if(choix == 1) {
				System.out.println("vos soldes actuels sont de:\nCompte courant: "+compteCourantA.solde+"€.\nPlan epargne: "+planEpargneA.solde+"€.");
				System.out.println("Retour au menu.\n....\n\n\n");
				Thread.sleep(2000);
			}
			else if(choix==2) {
				System.out.println("Vers quel compte souhaitez-vous faire un virement?\nPlan epargne - 1\nBeneficiaire favori - 2");
				int choix2 = scan2.nextInt();
				
				if(choix2==2) {				
				compteCourantA.virement(montant, compteCourantP);
				System.out.println("Retour au menu.\n....\n\n\n");
				Thread.sleep(2000);
				}
				else if(choix2==1){
				compteCourantA.virementPerso(montant, planEpargneA);
				System.out.println("Retour au menu.\n....\n\n\n");
				Thread.sleep(2000);
				}
				else {
					System.out.println("Commande inconnue.\nRetour au menu.\n....\n\n\n");
					Thread.sleep(2000);
				}
			}
			else if(choix==3) {
				System.out.println("Votre agence est fermée, contact possible dès Lundi 8h30.");
				System.out.println("Retour au menu.\n....\n\n\n");
				Thread.sleep(2000);
			}
			else if(choix==4) {
				System.out.println("Deconnexion...");
			}
			else {
				System.out.println("Commande inconnue.\\nRetour au menu.\n....\n\n\n");
				Thread.sleep(2000);
			}
		}while(choix!=4);
			
		
		
	}

}
