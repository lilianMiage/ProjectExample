package histoire;

import personnages.Humain;

public class MonHistoire {

	public static void main(String[] args) {
		Humain h = new Humain("Marvin", 10000000, "mojito");
		h.direBonjour();
		h.boire();
	}

}
