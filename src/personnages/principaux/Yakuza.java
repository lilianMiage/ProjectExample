package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	private int reputation= 0;
	private String clan;
	
	public Yakuza(String nom, int argent, String boisson,String clan) {
		super(nom, argent, boisson);
		this.clan=clan;
	}

	public void extorquer( Commercant c) {
		int x = c.seFaireExtorquer();
		gagneArgent(x);
		this.reputation=+1;
	}
	
	public void gagner() {
		 this.reputation+=1;
		 parler("gg ez");
	}
	
	public int perdre()
}
