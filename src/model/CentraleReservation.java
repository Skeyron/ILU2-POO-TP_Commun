package model;

public class CentraleReservation < E extends EntiteReservable< F>, F extends Formulaire > {
	private E[] tabEntity;
	private int nbEntity = 0;
	
	
	public CentraleReservation(E[] tabEntity) {
		super();
		this.tabEntity = tabEntity;
	}
	
	
	
	public int ajouterEntite(E entity) {
		tabEntity[nbEntity] = entity;
		nbEntity ++;
		return nbEntity;
	}
	
	public int donnerPossibilites(F formulaire) {
		
		
		
		return 1;
	}
	
}
