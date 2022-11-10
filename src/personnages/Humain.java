package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.argent=argent;
		this.boisson=boisson;
		this.nom=nom;
	}
	
	
	public void parler(String texte) {
		System.out.println(nom +" : "+ texte);
	}
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du "+ boisson);
	}
	
	
	public void boire() {
		parler("Mmmm, un bon verre de "+ boisson+ " ! GLOUPS !");	
	}
	
	
	public void gagneArgent(int n) {
		this.argent+=n;
	}
	
	
	public void perdreArgent(int n) {
		this.argent-=n;
	}
	
	
	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}


	public String getBoisson() {
		return boisson;
	}
}
