import java.util.Scanner;

public class AccountMain extends Account {

	

	public void virement(double montant, AccountMain compteCourantBeneficiaire) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Indiquez combien vous souhaitez virer à "+compteCourantBeneficiaire.proprietaire+":");
		montant=scan.nextDouble();
		solde = solde-montant;
		compteCourantBeneficiaire.setSolde(compteCourantBeneficiaire.solde+montant);
		System.out.println("Merci Aurelia, votre nouveau solde est de: "+solde+"€.");
		
		
		
	}

	public void virementPerso(double montant, AccountPEL compteCourantBeneficiaire) {
		
		Scanner scan = new Scanner(System.in);
		
		montant=scan.nextDouble();
		solde = solde-montant;
		compteCourantBeneficiaire.setSolde(compteCourantBeneficiaire.solde+montant);
		System.out.println("Merci Aurelia, votre nouveau solde courant est de: "+solde+"€.\nLe solde de votre plan epargne est de: "+solde+".€");
		
		
		
	}
}
