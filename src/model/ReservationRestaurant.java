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
		return "ReservationRestaurant [numService=" + numService + ", numTable=" + numTable + "]";
	}

	
}
