package model;

public class ReservationRestaurant extends Reservation {

	private int numService;
	private int numTable;
	
	
	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour,mois);
		this.numService = numService;
		this.numTable = numTable;

	}


	@Override
	public String toString() {
		String service;
		if (numService == 1) {
			service = "premier service";
		} else {
			service = "second service";
		}
		return super.toString() + "table n°" + numTable + " pour le " + service+".\n";
	}

	
}
