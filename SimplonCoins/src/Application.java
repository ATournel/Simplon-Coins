import java.util.Scanner;

public class Application {

	private static double montant;

	public static void main(String[] args) {
		Scanner scan2 = new Scanner(System.in);
		
		
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
		
		System.out.println("Bonjour Aurelia, votre solde actuel est de: "+compteCourantA.solde+"€.");
		System.out.println("\n\nA qui souhaitez-vous faire un virement?");
		System.out.println("\nTapez 1 pour votre plan epargne,\nTapez 2 pour votre beneficiaire favori.");
		int choix = scan2.nextInt();
		
		if(choix==2) {
		
		compteCourantA.virement(montant, compteCourantP);
		}
		else {
		compteCourantA.virementPerso(montant, planEpargneA);
		}
		
		
	}

}
