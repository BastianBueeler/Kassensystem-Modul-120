package Aufabe1B;

public class Auto {
	
	int anzahlRaeder;
	String art;
	
	public Auto(int anzR, String Art) {
		this.anzahlRaeder = anzR;
		this.art = Art;
	}
	
	public void erstelleSatz() {
		System.out.println("Das " + art + " hat " + anzahlRaeder + " Raeder in der Oberklasse.");
	}
	
	public void erstelleSatz(boolean t) {
		if(t == true){
			System.out.println("Das " + art + " hat " + anzahlRaeder + " Raeder.");
		} else {
			System.out.println("Es kann nur nur bei true ausgegeben werden..");
		}
		
		System.out.println("schwache statische Polymorphie");
	}
	
	
	
	
	
}
