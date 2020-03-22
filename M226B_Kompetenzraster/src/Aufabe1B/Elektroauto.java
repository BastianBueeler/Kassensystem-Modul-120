package Aufabe1B;

public class Elektroauto extends Auto{

	public Elektroauto(int anzR, String Art) {
		super(anzR, Art);
	}

	public void erstelleSatz() {
		System.out.println("Das " + art + " hat " + anzahlRaeder + " Raeder in der Unterklasse.");
	}
}
