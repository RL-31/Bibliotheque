package scenario;
import domaine.Bibliotheque;
import domaine.Exemplaire;
import domaine.Ouvrage;

public class TestBibliotheque {

	public static void main(String[] args) {
		Bibliotheque maBibliotheque = new Bibliotheque(50);
		maBibliotheque.ajouterOuvrage("Beginning Software Engineering", null, null, 0, null);
		
		
	}
	
}