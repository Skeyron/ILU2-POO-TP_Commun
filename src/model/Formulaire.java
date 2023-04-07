package model;

public abstract class Formulaire {
	private int jour;
	private int mois;
	private int IdentificationEntite;
	
	public Formulaire(int jour, int mois) {
		super();
		this.jour = jour;
		this.mois = mois;
	}

	public int getIdentificationEntite() {
		return IdentificationEntite;
	}

	public void setIdentificationEntite(int numEntity) {
		this.IdentificationEntite = numEntity;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
	
	
	
	
	
}
