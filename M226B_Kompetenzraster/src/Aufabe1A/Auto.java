package Aufabe1A;

public class Auto {
	
	private int anzahlRaeder;
	private String art;
	
	public Auto(int anzR, String Art) {
		this.anzahlRaeder = anzR;
		this.art = Art;
	}
	
	public void erstelleSatz() {
		System.out.println("Das " + art + " hat " + anzahlRaeder + " Raeder.");
	}
	
	
	
}
