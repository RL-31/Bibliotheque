package domaine;

public class Bibliotheque {
	
	private static final int NB_MAX_OUVRAGES = 50;

	private Ouvrage[] fonds;
	private int nbOuvrages = 0;
	
	public Bibliotheque(int nbMaxOuvrages) {
		fonds = new Ouvrage[nbMaxOuvrages];
		this.nbOuvrages = 0;
	}
	
	private Ouvrage[] getFonds() {
		return fonds;
	}
	
	private int getNbOuvrages() {
		return nbOuvrages;
	}
	
	public void ajouterOuvrage(String titre, String auteur, String editeur, int annee, String isbn) {
		if (nbOuvrages >= NB_MAX_OUVRAGES) {
			return;
		}
		else {
			Ouvrage ouvrage = new Ouvrage(titre, auteur, editeur, annee, isbn);
			fonds[nbOuvrages++] = ouvrage;
		}
	}

	@Override
	public String toString() {
		String texte = "Bibliothèque d'un fond de " + nbOuvrages + " ouvrages :\n";
		
		for (int i = 0; i < nbOuvrages; i++) {
			texte += "- " + fonds[i] + "\n";
		}
		
		return texte;
	}
	
}