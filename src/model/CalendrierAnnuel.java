package model;

import java.util.function.BooleanSupplier;

public class CalendrierAnnuel {
	
	private Mois[] calendrier = new Mois[12];
	
	public CalendrierAnnuel() {	
		calendrier[0] = new Mois("Janvier",31);
		calendrier[1] = new Mois("F�vrier",28);
		calendrier[2] = new Mois("Mars",31);
		calendrier[3] = new Mois("Avril",30);
		calendrier[4] = new Mois("Mai",31);
		calendrier[5] = new Mois("Juin",30);
		calendrier[6] = new Mois("Juillet",31);
		calendrier[7] = new Mois("Ao�t",31);
		calendrier[8] = new Mois("Septembre",30);
		calendrier[9] = new Mois("Octobre",31);
		calendrier[10] = new Mois("Novmebre",30);
		calendrier[11] = new Mois("Decembre",31);
	}

	private static class Mois {
		private String nom;
		private boolean[] jours;
		
		
		public Mois(String nom, int jour) {
			super();
			this.nom = nom;
			this.jours = new boolean[jour];
		}
		
		private boolean estLibre(int jour) {
			return !(jours[jour -1]); // renvoie True si le jour est libre //
		}
		
		private void reserver(int jour) throws IllegalStateException  {
			if (!estLibre(jour)){
				throw new IllegalStateException();
			}
			jours[jour -1] = true;
		}
		
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1); // Renvoie True si le jour est libre //
	}

	public boolean reserver(int jour, int mois) {
		if (estLibre(jour-1, mois-1)) {
			
			try {
				calendrier[mois-1].reserver(jour -1);
			} catch (Exception IllegalStateException) {
				return false;
			}
			return true;
		}
		return false;
	}
}
