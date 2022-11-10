package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain{
	private int reputation= 0;
	private String clan;
	
	public Yakuza(String nom, int argent, String boisson,String clan) {
		super(nom, argent, boisson);
		this.clan=clan;
	}

	
}
