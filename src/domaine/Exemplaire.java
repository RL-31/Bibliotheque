package domaine;

public class Exemplaire {

	private boolean empruntable = true;
	private boolean consultable = true;
	private boolean emprunte = false;
	private String cote;
	
	public Exemplaire(String cote) {
		this.cote = cote;
	}
	
	public boolean estEmpruntable() {
		return empruntable;
	}
	
	public boolean estConsultable() {
		return consultable;
	}
	
	public boolean estEmprunte() {
		return emprunte;
	}

	@Override
	public String toString() {
		return "Exemplaire [empruntable=" + empruntable + ", consultable=" + consultable + ", emprunte=" + emprunte + ", cote=" + cote + "]";
	}
	
}