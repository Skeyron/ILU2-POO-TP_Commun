package model;

public class ReservationHotel extends Reservation {
	
	private int nombreLitSimple;
	private int nombreLitDouble;
	private int numChambre;
	
	
	
	
	public ReservationHotel(int jour, int mois, int nombreLitSimple, int nombreLitDouble, int numChambre) {
		super(jour, mois);
		this.nombreLitSimple = nombreLitSimple;
		this.nombreLitDouble = nombreLitDouble;
		this.numChambre = numChambre;
	}
	
	
}
