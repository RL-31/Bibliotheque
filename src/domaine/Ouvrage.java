package domaine;

import java.util.Arrays;

public class Ouvrage {
	
	private static final int NB_MAX_EXEMPLAIRES = 50;

	private String titre;
	private String auteur;
	private String editeur;
	private int annee;
	private String isbn;
	private Exemplaire[] exemplaires;
	private int nbExemplaires = 0;
	
	public Ouvrage(String titre, String auteur, String editeur, int annee, String isbn) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.annee = annee;
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getEditeur() {
		return editeur;
	}

	public int getAnnee() {
		return annee;
	}

	public String getIsbn() {
		return isbn;
	}

	public Exemplaire[] getExemplaires() {
		return exemplaires;
	}
	
	public void ajouterExemplaire(Exemplaire exemplaire) {
		if (nbExemplaires < NB_MAX_EXEMPLAIRES) {
			exemplaires[nbExemplaires++] = exemplaire;
		}
	}

	@Override
	public String toString() {
		String texte =  "Ouvrage [titre=" + titre + ", auteur=" + auteur + ", editeur=" + editeur + ", annee=" + annee
				+ ", isbn=" + isbn + ", exemplaires=";
		
		for (int i = 0; i < nbExemplaires; i++) {
			texte += exemplaires[i];
		}
		
		return texte + "]";
	}
	
	
	
}