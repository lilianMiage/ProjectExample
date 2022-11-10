package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain{

	public Commercant(String nom, int argent, String boisson) {
		super(nom, argent, "thé");
	}
	
	
	public int seFaireExtorquer() {
		int x = getArgent();
		perdreArgent(x);
		return x;
	}
	
	
	public void recevoir(int n) {
		gagneArgent(n);
	}
}
