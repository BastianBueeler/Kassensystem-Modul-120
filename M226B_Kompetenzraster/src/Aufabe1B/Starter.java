package Aufabe1B;

public class Starter {

	
	public static void main(String[] args) {
		
		Auto a = new Auto(0, "Auto");
		a.erstelleSatz();
		
		Auto e = new Elektroauto(4, "Elektroauto");
		e.erstelleSatz();
		
		System.out.println("___________________");
		
		a.erstelleSatz(false);
		
	}

}
