package model;

public abstract class EntiteReservable <F extends Formulaire> {
	
	private CalendrierAnnuel calendrier;
	private int ID;
	
	public EntiteReservable(CalendrierAnnuel calendrier, int iD) {
		super();
		this.calendrier = calendrier;
		ID = iD;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public boolean estLibre(F formulaire) { // renvoie true si le jour est libre //
		return calendrier.estLibre( formulaire.getJour(), formulaire.getMois() );
	}
	
	public abstract boolean compatible(F formulaire); //
	public abstract Reservation reserver(F formulaire);

	
	
}
